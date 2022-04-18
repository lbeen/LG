package com.mes.timer.dao;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 数据源配置
 */
@Configuration
public class DataSourcesConfiguration {
    /**
     * 保山MES数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-mes")
    public DataSource bsMesDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 腾冲MES数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.tc-mes")
    public DataSource tcMesDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}