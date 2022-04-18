package com.mes.timer.utils;

import java.util.Objects;
import java.util.UUID;

/**
 * 公共工具
 */
public class CommonUtils {
    /**
     * 对象转字符串
     */
    public static String toString(Object obj) {
        return Objects.toString(obj, "");
    }

    /**
     * uuid
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
