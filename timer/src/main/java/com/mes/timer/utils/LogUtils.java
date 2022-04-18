package com.mes.timer.utils;

import com.mes.timer.dao.Dao;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 日志工具
 */
public class LogUtils {
    private final static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    private static final int LOG_LEVEL_INFO = 1;
    private static final int LOG_LEVEL_ERROR = 2;

    private static final Dao dao = SpringUtils.getBean("bsMesDao", Dao.class);

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
            if (StringUtils.isBlank(content)) {
                return;
            }
            if (content.length() > 2000) {
                content = content.substring(0, 2000);
            }

            Map<String, Object> param = new HashMap<>();
            param.put("id", CommonUtils.uuid());
            param.put("class", clazz.getSimpleName());
            param.put("method", method);
            param.put("level", level);
            param.put("content", content);
            dao.insert("SysLog.insert", param);
        } catch (Throwable t) {
            logger.error("日志插入失败", t);
        }
    }
}
