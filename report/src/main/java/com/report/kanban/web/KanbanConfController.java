package com.report.kanban.web;

import com.report.kanban.KanbanConstants;
import com.report.kanban.service.KanbanConfService;
import com.report.sys.SysConstants;
import com.report.utils.web.Result;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("kanban/conf")
@RequiredArgsConstructor
public class KanbanConfController {
    private final KanbanConfService kanbanConfService;

    /**
     * 加载看板版本
     */
    @RequestMapping("loadKanbanVersion")
    public Result loadKanbanVersion() {
        kanbanConfService.loadKanbanVersion();
        return Result.success();
    }

    /**
     * 获取看板版本
     */
    @RequestMapping("getKanbanVersion")
    public Result getKanbanVersion(String id) {
        return Result.success(null, kanbanConfService.getKanbanVersion(id));
    }

    /**
     * 获取看板资源
     */
    @RequestMapping("getPageResources")
    public Result getPageResources(String id) {
        return Result.success(kanbanConfService.getPageResources(id));
    }

    /**
     * 获取看板资源
     */
    @RequestMapping("getResources")
    public Result getResources(String factory, String name, String type) {
        Map<String, Object> param = new HashMap<>();
        param.put("factory", factory);
        if (StringUtils.isNoneBlank(name)) {
            param.put("name", "%" + name + "%");
        }
        param.put("type", type);
        return Result.success(kanbanConfService.getResources(param));

    }

    /**
     * 保存看板资源
     */
    @RequestMapping("saveResource")
    public Result saveResource(String id, String type, String name, String location, int count, int duration,
                               String factory) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("type", type);
        param.put("name", name);
        param.put("location", location);
        param.put("count", count);
        param.put("duration", duration);
        param.put("factory", factory);
        kanbanConfService.saveResource(param);
        return Result.success();
    }

    /**
     * 获取看板页面
     */
    @RequestMapping("getPages")
    public Result getPages(String factory, String name) {
        Map<String, Object> param = new HashMap<>();
        param.put("factory", factory);
        if (StringUtils.isNoneBlank(name)) {
            param.put("name", "%" + name + "%");
        }
        return Result.success(kanbanConfService.getPages(param));
    }

    /**
     * 保存看板页面
     */
    @RequestMapping("savePage")
    public Result savePage(String id, String name, String resources, int interval, String timing, String factory,
                           String version) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("name", name);
        param.put("resources", resources);
        param.put("interval", interval);
        param.put("timing", timing);
        param.put("factory", factory);
        param.put("version", version);
        kanbanConfService.savePage(param);
        return Result.success();
    }

    /**
     * 获取资源列表
     */
    @RequestMapping("getLocations")
    public Result getLocations(String type) {
        String path = SysConstants.OUT_STATIC + ("PPT".equals(
                type) ? KanbanConstants.PPT_DIR : KanbanConstants.VIDEO_DIR);
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            return Result.success(Collections.emptyList());
        }

        File[] files = dir.listFiles();
        if (ArrayUtils.isEmpty(files)) {
            return Result.success(Collections.emptyList());
        }

        List<String> locations = new ArrayList<>();
        for (File file : files) {
            if (file.exists() && file.isDirectory()) {
                locations.add(file.getName());
            }
        }
        return Result.success(locations);
    }

    /**
     * 获取视频列表
     */
    @RequestMapping("getVideos")
    public Result getVideos(String location) {
        String path = SysConstants.OUT_STATIC + KanbanConstants.VIDEO_DIR + location;
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            return Result.success(Collections.emptyList());
        }

        File[] files = dir.listFiles(f -> !f.isDirectory());
        if (ArrayUtils.isEmpty(files)) {
            return Result.success(Collections.emptyList());
        }

        List<String> videos = new ArrayList<>();
        for (File file : files) {
            videos.add(file.getName());
        }
        return Result.success(videos);
    }
}
