package com.report.kanban.service;

import java.util.Map;

/**
 * 看板配置service
 */
public interface KanbanConfService {
    /**
     * 加载看板版本
     */
    void loadKanbanVersion();

    /**
     * 获取看板版本
     */
    String getKanbanVersion(String id);

    /**
     * 获取看板资源
     */
    Map<String, Object> getPageResources(String pageId);
}
