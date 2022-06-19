package com.report.kanban.web;

import com.report.kanban.KanbanConstants;
import com.report.kanban.entity.KanbanPage;
import com.report.kanban.entity.KanbanResource;
import com.report.kanban.service.KanbanPageService;
import com.report.kanban.service.KanbanResourceService;
import com.report.sys.SysConstants;
import com.report.utils.QueryCondition;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("kanban/conf")
@RequiredArgsConstructor
public class KanbanConfController {
    private final KanbanResourceService kanbanResourceService;
    private final KanbanPageService kanbanPageService;

    /**
     * 加载看板版本
     */
    @RequestMapping("loadKanbanVersion")
    public Result loadKanbanVersion() {
        kanbanPageService.loadKanbanVersion();
        return Result.success();
    }

    /**
     * 获取看板版本
     */
    @RequestMapping("getKanbanVersion")
    public Result getKanbanVersion(String id) {
        return Result.success(null, kanbanPageService.getKanbanVersion(id));
    }

    /**
     * 获取看板资源
     */
    @RequestMapping("getPageResources")
    public Result getPageResources(String id) {
        return Result.success(kanbanPageService.getPageResources(id));
    }

    /**
     * 获取看板资源
     */
    @RequestMapping("getResources")
    public Result getResources(KanbanResource resource) {
        QueryCondition<KanbanResource> condition = new QueryCondition<>();
        condition.eqIfNotBlank(KanbanResource::getType, resource.getType());
        condition.eqIfNotBlank(KanbanResource::getFactory, resource.getFactory());
        condition.likeIfNotBlank(KanbanResource::getName, resource.getName());
        return Result.success(kanbanResourceService.list(condition));

    }

    /**
     * 保存看板资源
     */
    @RequestMapping("saveResource")
    public Result saveResource(KanbanResource resource) {
        kanbanResourceService.saveOrUpdate(resource);
        return Result.success();
    }

    /**
     * 获取看板页面
     */
    @RequestMapping("getPages")
    public Result getPages(KanbanPage page) {
        QueryCondition<KanbanPage> condition = new QueryCondition<>();
        condition.eqIfNotBlank(KanbanPage::getFactory, page.getFactory());
        condition.likeIfNotBlank(KanbanPage::getName, page.getName());
        return Result.success(kanbanPageService.list(condition));
    }

    /**
     * 保存看板页面
     */
    @RequestMapping("savePage")
    public Result savePage(KanbanPage page) {
        kanbanPageService.saveAndRefreshVersion(page);
        return Result.success();
    }

    /**
     * 获取资源列表
     */
    @RequestMapping("getLocations")
    public Result getLocations(String type) {
        String path = SysConstants.OUT_STATIC + ("PPT".equals(
                type) ? KanbanConstants.PPT_DIR : KanbanConstants.VIDEO_DIR);
        return Result.success(listFilenames(path, true));
    }

    /**
     * 获取视频列表
     */
    @RequestMapping("getVideos")
    public Result getVideos(String location) {
        String path = SysConstants.OUT_STATIC + KanbanConstants.VIDEO_DIR + location;
        return Result.success(listFilenames(path, false));
    }

    /**
     * 列出路径文件名
     *
     * @param dirPath 目录路径
     * @param isDir   是否是目录
     */
    public List<String> listFilenames(String dirPath, boolean isDir) {
        File dir = new File(dirPath);
        if (!dir.exists() || !dir.isDirectory()) {
            return Collections.emptyList();
        }
        FileFilter filter = isDir ? File::isDirectory : f -> !f.isDirectory();
        File[] files = dir.listFiles(filter);
        if (ArrayUtils.isEmpty(files)) {
            return Collections.emptyList();
        }

        return Arrays.stream(files).map(File::getName).collect(Collectors.toList());
    }
}
