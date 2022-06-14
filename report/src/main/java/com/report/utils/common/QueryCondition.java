package com.report.utils.common;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import org.apache.commons.lang3.StringUtils;

public class QueryCondition<T> extends LambdaQueryWrapper<T> {
    /**
     * 如果值不为空，添加等于条件
     *
     * @param column 字段名
     * @param value  值
     */
    public void eqIfNotBlank(SFunction<T, String> column, String value) {
        if (StringUtils.isNotBlank(value)) {
            this.eq(column, value);
        }
    }

    /**
     * 如果值不为空，添加like条件
     *
     * @param column 字段名
     * @param value  值
     */
    public void likeIfNotBlank(SFunction<T, String> column, String value) {
        if (StringUtils.isNotBlank(value)) {
            this.like(column, value);
        }
    }
}
