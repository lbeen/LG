package com.report.kanban.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.report.kanban.entity.KanbanPage;
import com.report.kanban.entity.KanbanResource;
import com.report.kanban.mapper.KanbanPageMapper;
import com.report.kanban.service.KanbanPageService;
import com.report.kanban.service.KanbanResourceService;
import com.report.sys.service.SysService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KanbanPageServiceImpl extends ServiceImpl<KanbanPageMapper, KanbanPage> implements KanbanPageService {
    /**
     * 看板版本缓存
     */
    private Map<String, String> KANBAN_VERSION;

    private final KanbanResourceService kanbanResourceService;
    private final SysService sysService;

    /**
     * 加载看板版本
     */
    @Override
    @PostConstruct
    public void loadKanbanVersion() {
        KANBAN_VERSION = this.list().stream().collect(
                Collectors.toMap(KanbanPage::getId, KanbanPage::getVersion));
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
        KanbanPage page = this.getById(pageId);
        if (page == null) {
            return Collections.emptyMap();
        }

        Map<String, Object> result = Maps.newHashMap();
        result.put("interval", page.getInterval());

        JSONArray resources = JSONObject.parseArray(page.getResources());
        setResourcesInfo(resources);
        result.put("resources", resources);

        JSONArray timing = JSONObject.parseArray(page.getTiming());
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
            KanbanResource resource = kanbanResourceService.getById(resourceId);
            if (resource == null) {
                resourceIds.set(i, Collections.emptyMap());
                continue;
            }
            Map<String, Object> info = Maps.newHashMap();
            info.put("name", resource.getName());
            info.put("type", resource.getType());
            switch (resource.getType()) {
                case "HTML":
                    info.put("location", resource.getLocation());
                    break;
                case "PPT": {
                    info.put("location", resource.getLocation());
                    info.put("count", resource.getCount());
                    info.put("duration", resource.getDuration());
                    break;
                }
                case "VIDEO": {
                    info.put("location", resource.getLocation());
                    info.put("duration", resource.getDuration());
                    break;
                }
            }
            resourceIds.set(i, info);
        }
    }
}
