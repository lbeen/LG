package com.mes.timer.utils;

import com.mes.timer.sys.service.SysLogService;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具
 */
public class LogUtils {
    private final static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    private static final int LOG_LEVEL_INFO = 1;
    private static final int LOG_LEVEL_ERROR = 2;

    private static final SysLogService sysLogService = SpringUtils.getBean("sysLogServiceImpl", SysLogService.class);

    /**
     * 记录日志
     *
     * @param clazz   类名
     * @param method  来源方法
     * @param content 日志内容
     */
    public static void logInfo(Class<?> clazz, String method, String content) {
        log(clazz, method, LOG_LEVEL_INFO, content);
    }

    /**
     * 记录日志
     *
     * @param clazz   类名
     * @param method  来源方法
     * @param content 日志内容
     * @param t       异常
     */
    public static void logError(Class<?> clazz, String method, String content, Throwable t) {
        logError(clazz, method, getThrowableInfo(content, t));
    }

    /**
     * 获取异常信息
     *
     * @param content 日志信息
     * @param t       异常
     */
    private static String getThrowableInfo(String content, Throwable t) {
        logger.error("记录错误日志", t);

        StringBuilder sb = new StringBuilder(content).append("|").append(t.getMessage());

        StackTraceElement[] stackTraces = t.getStackTrace();
        if (ArrayUtils.isEmpty(stackTraces)) {
            return sb.toString();
        }

        for (int i = 0; i < stackTraces.length && i < 3; i++) {
            sb.append("，").append(stackTraces[i]);
        }

        return sb.toString();
    }

    /**
     * 记录日志
     *
     * @param clazz   类名
     * @param method  来源方法
     * @param content 日志内容
     */
    public static void logError(Class<?> clazz, String method, String content) {
        log(clazz, method, LOG_LEVEL_ERROR, content);
    }

    /**
     * 记录日志
     *
     * @param clazz   来源类
     * @param method  来源方法
     * @param level   日志级别
     * @param content 日志内容
     */
    private static void log(Class<?> clazz, String method, int level, String content) {
        try {
            sysLogService.saveLog(clazz, method, level, content);
        } catch (Throwable t) {
            logger.error("日志插入失败", t);
        }
    }
}
