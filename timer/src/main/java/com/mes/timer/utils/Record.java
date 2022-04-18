package com.mes.timer.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

/**
 * 数据记录（key全为小写）
 */
public class Record extends HashMap<String, Object> {
    @Override
    public Object put(String key, Object value) {
        return super.put(key.toLowerCase(), value);
    }

    @Override
    public Object get(Object key) {
        return super.get(key.toString().toLowerCase());
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return super.getOrDefault(key.toString().toLowerCase(), defaultValue);
    }

    @Override
    public Object remove(Object key) {
        return super.remove(key.toString().toLowerCase());
    }

    /**
     * 获取字符串
     */
    public String getString(String key) {
        return Objects.toString(get(key), null);
    }

    /**
     * 获取Long
     */
    public Long getLong(String key) {
        Object value = get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Long) {
            return (Long) get(key);
        }
        if (value instanceof BigDecimal) {
            return ((BigDecimal) value).longValue();
        }
        if (value instanceof Integer) {
            return ((Integer) value).longValue();
        }
        throw new RuntimeException(value.getClass() + "can not cast to Long");
    }
}
