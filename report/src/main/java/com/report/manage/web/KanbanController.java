package com.report.manage.web;

import com.report.constants.KanbanConstants;
import com.report.constants.SysConstants;
import com.report.manage.entity.KanbanPage;
import com.report.manage.entity.KanbanResource;
import com.report.manage.service.KanbanPageService;
import com.report.manage.service.KanbanResourceService;
import com.report.utils.QueryCondition;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("manage/kanban")
@RequiredArgsConstructor
public class KanbanController {
    private final KanbanResourceService kanbanResourceService;
    private final KanbanPageService kanbanPageService;

    /**
     * 加载看板版本
     */
    @PostMapping("loadKanbanVersion")
    public Result loadKanbanVersion() {
        kanbanPageService.loadKanbanVersion();
        return Result.success("操作成功");
    }

    /**
     * 获取看板版本
     */
    @GetMapping("getKanbanVersion")
    public Result getKanbanVersion(String id) {
        String version = kanbanPageService.getKanbanVersion(id);
        return Result.success(null,version);
    }

    /**
     * 获取看板资源
     *
     * @param id      页面id
     * @param current 当前资源id
     */
    @GetMapping("getPageResources")
    public Result getPageResources(String id, String current) {
        return Result.success(kanbanPageService.getPageResources(id, current));
    }

    /**
     * 获取看板资源
     */
    @GetMapping("getResources")
    public Result getResources(KanbanResource resource) {
        QueryCondition<KanbanResource> condition = new QueryCondition<>();
        condition.eqIfNotBlank(KanbanResource::getType, resource.getType());
        condition.eqIfNotBlank(KanbanResource::getFactory, resource.getFactory());
        condition.likeIfNotBlank(KanbanResource::getName, resource.getName());
        condition.orderByDesc(KanbanResource::getCreationTime);
        return Result.success(kanbanResourceService.list(condition));

    }

    /**
     * 保存看板资源
     */
    @PostMapping("saveResource")
    public Result saveResource(@RequestBody KanbanResource resource) {
        kanbanResourceService.saveOrUpdate(resource);
        return Result.success("保存成功");
    }

    /**
     * 获取看板页面
     */
    @GetMapping("getPages")
    public Result getPages(KanbanPage page) {
        QueryCondition<KanbanPage> condition = new QueryCondition<>();
        condition.eqIfNotBlank(KanbanPage::getFactory, page.getFactory());
        condition.likeIfNotBlank(KanbanPage::getName, page.getName());
        condition.orderByDesc(KanbanPage::getCreationTime);
        return Result.success(kanbanPageService.list(condition));
    }

    /**
     * 保存看板页面
     */
    @PostMapping("savePage")
    public Result savePage(@RequestBody KanbanPage page) {
        kanbanPageService.saveAndRefreshVersion(page);
        return Result.success("保存成功");
    }

    /**
     * 获取资源列表
     */
    @GetMapping("getLocations")
    public Result getLocations(String type) {
        String path = SysConstants.OUT_STATIC + ("PPT".equals(
                type) ? KanbanConstants.PPT_DIR : KanbanConstants.VIDEO_DIR);
        return Result.success(listFilenames(path, true));
    }

    /**
     * 获取视频列表
     */
    @GetMapping("getVideos")
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
    private List<String> listFilenames(String dirPath, boolean isDir) {
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
