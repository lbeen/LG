package com.mes.timer.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Dao源配置
 */
@Configuration
public class DaoConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(DaoConfiguration.class);
    private static final String MYBATIS_CONFIG = "classpath:mybatis-config.xml";
    private static final String MAPPER_LOCATIONS = "classpath:mapping/**/*.xml";

    /**
     * 系统配置数据库Dao
     */
    @Bean
    public Dao bsMesDao(DataSource bsMesDataSource) {
        return Dao(bsMesDataSource, "保山MES数据库");
    }

    /**
     * 保山DG库Dao
     */
    @Bean
    public Dao tcMesDao(DataSource tcMesDataSource) {
        return Dao(tcMesDataSource, "腾冲MES数据库");
    }

    private Dao Dao(DataSource dataSource, String name) {
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATIONS));
            bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(MYBATIS_CONFIG));
            SqlSessionFactory sessionFactory = bean.getObject();
            if (sessionFactory == null) {
                logger.error(name + "Dao初始化失败：SqlSessionFactory=null");
                return null;
            }
            SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sessionFactory);
            logger.info(name + "Dao初始化成功");
            return new Dao(sqlSessionTemplate);
        } catch (Exception e) {
            logger.error(name + "Dao初始化失败", e);
            return null;
        }
    }
}
