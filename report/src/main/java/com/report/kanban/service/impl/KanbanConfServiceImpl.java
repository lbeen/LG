package com.report.kanban.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.report.dao.Dao;
import com.report.kanban.service.KanbanConfService;
import com.report.sys.Factory;
import com.report.sys.service.SysService;
import com.report.utils.CommonUtils;
import com.report.utils.Record;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 看板配置service
 */
@Service
public class KanbanConfServiceImpl implements KanbanConfService {
    private static final String MAPPING_ID = "KanbanConf.";
    /**
     * 看板版本缓存
     */
    private static Map<String, String> KANBAN_VERSION;

    private final Dao configDao;
    private final SysService sysService;

    public KanbanConfServiceImpl(Dao configDao, SysService sysService) {
        this.configDao = configDao;
        this.sysService = sysService;

        loadKanbanVersion();
    }

    /**
     * 加载看板版本
     */
    @Override
    public void loadKanbanVersion() {
        KANBAN_VERSION = configDao.getList(MAPPING_ID + "getPages").stream().collect(
                Collectors.toMap(r -> r.getString("id"), r -> r.getString("page_version")));
    }

    /**
     * 获取看板版本
     */
    @Override
    public String getKanbanVersion(String id) {
        return KANBAN_VERSION.get(id);
    }

    /**
     * 获取看板资源
     */
    @Override
    public Map<String, Object> getPageResources(String pageId) {
        if (StringUtils.isBlank(pageId)) {
            return Collections.emptyMap();
        }
        List<Record> pages = getPages(Collections.singletonMap("id", pageId));
        if (CollectionUtils.isEmpty(pages)) {
            return Collections.emptyMap();
        }
        Record page = pages.get(0);

        Map<String, Object> result = new HashMap<>();
        result.put("interval", page.get("interval"));

        JSONArray resources = JSONObject.parseArray(page.getString("resources"));
        setResourcesInfo(resources);
        result.put("resources", resources);

        JSONArray timing = JSONObject.parseArray(page.getString("timing"));
        for (int i = 0; i < timing.size(); i++) {
            JSONObject json = timing.getJSONObject(i);
            json.put("startTime", Integer.parseInt(json.getString("startTime").replace(":", "")) * 100);
            json.put("endTime", Integer.parseInt(json.getString("endTime").replace(":", "")) * 100);
            JSONArray timingResources = json.getJSONArray("resources");
            setResourcesInfo(timingResources);
        }
        result.put("timing", timing);
        result.put("time", sysService.getServerTime());
        return result;
    }

    /**
     * 设置资源信息
     *
     * @param resourceIds 资源id数组
     */
    private void setResourcesInfo(JSONArray resourceIds) {
        for (int i = 0; i < resourceIds.size(); i++) {
            String resourceId = resourceIds.getString(i);
            if (StringUtils.isBlank(resourceId)) {
                resourceIds.set(i, Collections.emptyMap());
                continue;
            }
            List<Record> resources = getResources(Collections.singletonMap("id", resourceId));
            if (CollectionUtils.isEmpty(resources)) {
                resourceIds.set(i, Collections.emptyMap());
                continue;
            }
            Map<String, Object> resource = resources.get(0);

            Map<String, Object> info = new HashMap<>();
            info.put("name", resource.get("name"));
            info.put("type", resource.get("type"));
            switch (resource.get("type").toString()) {
                case "HTML":
                    info.put("location", resource.get("location"));
                    break;
                case "PPT": {
                    info.put("location", resource.get("location"));
                    info.put("count", resource.get("count"));
                    info.put("duration", resource.get("duration"));
                    break;
                }
                case "VIDEO": {
                    info.put("location", resource.get("location"));
                    info.put("duration", resource.get("duration"));
                    break;
                }
            }
            resourceIds.set(i, info);
        }
    }

    /**
     * 获取看板资源
     */
    @Override
    public List<Record> getResources(Map<String, Object> param) {
        List<Record> list = configDao.getList(MAPPING_ID + "getResources", param);
        for (Record record : list) {
            record.put("type", record.remove("resource_type"));
            record.put("name", record.remove("resource_name"));
            record.put("location", record.remove("resource_location"));
            record.put("count", record.remove("resource_count"));
            record.put("duration", record.remove("resource_duration"));
            record.put("factory_name", Factory.getFactory(record.getString("factory")).factoryName);
        }
        return list;
    }

    /**
     * 保存看板资源
     */
    @Override
    public void saveResource(Map<String, Object> param) {
        Object id = param.get("id");
        if (id == null || id.toString().isEmpty()) {
            param.put("id", CommonUtils.uuid());
            configDao.insert(MAPPING_ID + "insertResource", param);
        } else {
            configDao.update(MAPPING_ID + "updateResource", param);
        }
    }

    /**
     * 获取看板页面
     */
    @Override
    public List<Record> getPages(Map<String, Object> param) {
        List<Record> list = configDao.getList(MAPPING_ID + "getPages", param);
        for (Record record : list) {
            record.put("name", record.remove("page_name"));
            record.put("resources", record.remove("page_resources"));
            record.put("interval", record.remove("cycle_interval"));
            record.put("timing", record.remove("page_timing"));
            record.put("version", record.remove("page_version"));
            record.put("factory_name", Factory.getFactory(record.getString("factory")).factoryName);
        }
        return list;
    }

    /**
     * 保存看板页面
     */
    @Override
    public void savePage(Map<String, Object> param) {
        Object id = param.get("id");
        if (id == null || id.toString().isEmpty()) {
            param.put("id", CommonUtils.uuid());
            configDao.insert(MAPPING_ID + "insertPage", param);
        } else {
            configDao.update(MAPPING_ID + "updatePage", param);
        }
        KANBAN_VERSION.put(param.get("id").toString(), param.get("version").toString());
    }
}
