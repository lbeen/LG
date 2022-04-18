package com.report.sys.service.impl;

import com.report.sys.service.SysService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
        Map<String, Long> result = new HashMap<>();
        result.put("time", Long.parseLong(new SimpleDateFormat("HHmmss").format(now)));
        result.put("second", now.getTime());
        return result;
    }
}
