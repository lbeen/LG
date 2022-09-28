package com.mes.timer.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mes.timer.sys.entity.SysLog;
import com.mes.timer.sys.mapper.SysLogMapper;
import com.mes.timer.sys.service.SysLogService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {
    /**
     * 保存日志
     *
     * @param clazz   来源类
     * @param method  来源方法
     * @param level   日志级别
     * @param content 日志内容
     */
    @Override
    public void saveLog(Class<?> clazz, String method, int level, String content) {
        if (StringUtils.isBlank(content)) {
            return;
        }
        if (content.length() > 2000) {
            content = content.substring(0, 2000);
        }
        SysLog sysLog = new SysLog();
        sysLog.setUser("timer");
        sysLog.setClazz(clazz.getSimpleName());
        sysLog.setMethod(method);
        sysLog.setLevel(level);
        sysLog.setContent(content);
        super.save(sysLog);
    }
}