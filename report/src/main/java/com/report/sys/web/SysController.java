package com.report.sys.web;

import com.report.sys.service.SysService;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys")
@RequiredArgsConstructor
public class SysController {
    private final SysService sysService;

    /**
     * 获取服务器时间
     */
    @RequestMapping("getServerTime")
    public Result getServerTime() {
        return Result.success(sysService.getServerTime());
    }
}
