package com.report.manage.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.report.manage.entity.KanbanPage;
import com.report.manage.entity.KanbanResource;
import com.report.manage.mapper.KanbanPageMapper;
import com.report.manage.service.KanbanPageService;
import com.report.manage.service.KanbanResourceService;
import com.report.manage.service.SysService;
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
        KANBAN_VERSION = this.list().stream().collect(Collectors.toMap(KanbanPage::getId, KanbanPage::getVersion));
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
     *
     * @param pageId  页面id
     * @param current 当前资源id
     */
    @Override
    public Map<String, Object> getPageResources(String pageId, String current) {
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
        result.put("resources", resources);

        JSONArray timing = JSONObject.parseArray(page.getTiming());
        for (int i = 0; i < timing.size(); i++) {
            JSONObject json = timing.getJSONObject(i);
            json.put("startTime", Integer.parseInt(json.getString("startTime").replace(":", "")) * 100);
            json.put("endTime", Integer.parseInt(json.getString("endTime").replace(":", "")) * 100);
        }
        result.put("timing", timing);

        if (StringUtils.isBlank(current)) {
            current = resources.getString(0);
        }
        result.put("current", getCurrentMap(current));
        return result;
    }

    private Map<String, Object> getCurrentMap(String current) {
        KanbanResource resource = kanbanResourceService.getById(current);
        Map<String, Object> map = Maps.newHashMap();
        map.put("id", resource.getId());
        map.put("type", resource.getType());
        map.put("location", resource.getLocation());
        map.put("count", resource.getCount());
        map.put("duration", resource.getDuration());
        map.put("startTime", sysService.getServerTime());
        return map;
    }

    /**
     * 保存看板页面并刷新版本
     */
    @Override
    public void saveAndRefreshVersion(KanbanPage page) {
        super.saveOrUpdate(page);
        KANBAN_VERSION.put(page.getId(), page.getVersion());
    }
}
