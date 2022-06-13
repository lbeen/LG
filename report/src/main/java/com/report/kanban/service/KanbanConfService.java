package com.report.kanban.service;

import com.report.utils.common.Record;

import java.util.List;
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

    /**
     * 获取看板资源
     */
    List<Record> getResources(Map<String, Object> param);

    /**
     * 保存看板资源
     */
    void saveResource(Map<String, Object> param);

    /**
     * 获取看板页面
     */
    List<Record> getPages(Map<String, Object> param);

    /**
     * 保存看板页面
     */
    void savePage(Map<String, Object> param);
}
