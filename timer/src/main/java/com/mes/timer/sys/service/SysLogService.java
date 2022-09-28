package com.mes.timer.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mes.timer.sys.entity.SysLog;

public interface SysLogService extends IService<SysLog> {
    /**
     * 保存日志
     *
     * @param clazz   来源类
     * @param method  来源方法
     * @param level   日志级别
     * @param content 日志内容
     */
    void saveLog(Class<?> clazz, String method, int level, String content);
}
