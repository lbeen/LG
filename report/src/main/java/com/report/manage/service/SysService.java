package com.report.manage.service;

import java.util.Map;

/**
 * 系统服务
 */
public interface SysService {
    /**
     * 获取服务器时间
     */
    Map<String, Long> getServerTime();
}
