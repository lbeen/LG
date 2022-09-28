package com.report.manage.service.impl;

import com.google.common.collect.Maps;
import com.report.manage.service.SysService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 系统服务
 */
@Service
public class SysServiceImpl implements SysService {
    /**
     * 获取服务器时间
     */
    @Override
    public Map<String, Long> getServerTime() {
        Date now = new Date();
        Map<String, Long> result = Maps.newHashMap();
        result.put("time", Long.parseLong(new SimpleDateFormat("HHmmss").format(now)));
        result.put("second", now.getTime());
        return result;
    }
}
