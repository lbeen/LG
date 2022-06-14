package com.report.kanban.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.report.kanban.entity.KanbanPage;

import java.util.Map;

public interface KanbanPageService extends IService<KanbanPage> {
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
