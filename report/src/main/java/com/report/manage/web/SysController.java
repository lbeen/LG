package com.report.manage.web;

import com.report.manage.service.SysService;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manage/sys")
@RequiredArgsConstructor
public class SysController {
    private final SysService sysService;

    /**
     * 获取服务器时间
     */
    @GetMapping("getServerTime")
    public Result getServerTime() {
        return Result.success(sysService.getServerTime());
    }
}
