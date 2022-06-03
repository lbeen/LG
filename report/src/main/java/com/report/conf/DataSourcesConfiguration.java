package com.report.conf;

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
     * 系统配置数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.config")
    public DataSource configDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 保山DG库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-dg")
    public DataSource bsDgDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 保山scada库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-scada")
    public DataSource bsScadaDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 保山机加一车间数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-machine1")
    public DataSource bsMachine1DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 保山机加二车间数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-machine2")
    public DataSource bsMachine2DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 保山机加三车间数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.bs-machine3")
    public DataSource bsMachine3DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 腾冲DG库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.tc-dg")
    public DataSource tcDgDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 腾冲机加一车间数据库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.tc-machine1")
    public DataSource tcMachine1DataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}