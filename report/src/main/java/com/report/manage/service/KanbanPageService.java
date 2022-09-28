package com.report.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.report.manage.entity.KanbanPage;

import java.util.Map;

public interface KanbanPageService extends IService<KanbanPage> {
    /**
     * 加载看板版本
     */
    void loadKanbanVersion();

    /**
     * 获取看板版本
     *
     * @param id 页面id
     */
    String getKanbanVersion(String id);

    /**
     * 获取看板资源
     *
     * @param pageId  页面id
     * @param current 当前资源id
     */
    Map<String, Object> getPageResources(String pageId, String current);

    /**
     * 保存看板页面并刷新版本
     *
     * @param page 页面
     */
    void saveAndRefreshVersion(KanbanPage page);
}
