package com.report.utils;

import com.google.common.cache.Cache;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * 缓存工具类
 */
public class CacheUtils {
    private static final Map<String, Cache<String, ?>> CACHES = Maps.newConcurrentMap();

    /**
     * 使用缓存
     *
     * @param cacheKey 缓存对象key
     * @param creator  如果获取不到缓存创建方法
     * @param keys     缓存key
     * @param adder    缓存添加数据方法
     * @param user     缓存数据使用方法
     * @param <T>      缓存对象类型
     */
    public static <T> void useCache(String cacheKey, Callable<Cache<String, T>> creator, Set<String> keys,
                                    Function<Set<String>, Map<String, T>> adder, BiConsumer<String, T> user) {
        @SuppressWarnings("unchecked")
        Cache<String, T> cache = (Cache<String, T>) CACHES.get(cacheKey);
        if (cache == null) {
            cache = creator.call();
            CACHES.put(cacheKey, cache);
            addAndUseCache(cache, keys, adder, user);
            return;
        }

        Set<String> noCacheKeys = Sets.newHashSet();
        for (String key : keys) {
            T value = cache.getIfPresent(key);
            if (value == null) {
                noCacheKeys.add(key);
                continue;
            }
            user.accept(key, value);
        }
        if (noCacheKeys.isEmpty()) {
            return;
        }

        addAndUseCache(cache, noCacheKeys, adder, user);
    }

    /**
     * 添加和使用缓存
     *
     * @param keys  缓存key
     * @param adder 缓存添加数据方法
     * @param user  缓存数据使用方法
     * @param <T>   缓存对象类型
     */
    private static <T> void addAndUseCache(Cache<String, T> cache, Set<String> keys,
                                           Function<Set<String>, Map<String, T>> adder, BiConsumer<String, T> user) {
        Map<String, T> map = adder.apply(keys);
        if (map.isEmpty()) {
            return;
        }
        cache.putAll(map);
        map.forEach(user);
    }
}
