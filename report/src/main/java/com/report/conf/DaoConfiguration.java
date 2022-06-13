package com.report.conf;

import com.report.dao.Dao;
import com.report.sys.Factory;
import com.report.sys.SysConstants;
import com.report.utils.common.SpringUtils;
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
     * 获取机加数据库Dao
     *
     * @param factory 工厂
     */
    public static Dao getDGDao(String factory) {
        Factory factoryEnum = Factory.getFactory(factory);
        if (factoryEnum == Factory.BS) {
            return SpringUtils.getBean("bsDgDao", Dao.class);
        }
        if (factoryEnum == Factory.TC) {
            return SpringUtils.getBean("tcDgDao", Dao.class);
        }
        throw new RuntimeException("工厂匹配不到对应DG库Dao");
    }

    /**
     * 获取机加数据库Dao
     *
     * @param factory 工厂
     * @param shop    车间
     */
    public static Dao getMachineDao(String factory, String shop) {
        Factory factoryEnum = Factory.getFactory(factory);
        if (factoryEnum == Factory.BS) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return SpringUtils.getBean("bsMachine1Dao", Dao.class);
            }
            if (SysConstants.MACHINE_SHOP_2.equalsIgnoreCase(shop)) {
                return SpringUtils.getBean("bsMachine2Dao", Dao.class);
            }
            if (SysConstants.MACHINE_SHOP_3.equalsIgnoreCase(shop)) {
                return SpringUtils.getBean("bsMachine3Dao", Dao.class);
            }
        } else if (factoryEnum == Factory.TC) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return SpringUtils.getBean("tcMachine1Dao", Dao.class);
            }
        }
        throw new RuntimeException("工厂和车间匹配不到对应机加数据库Dao");
    }

    /**
     * 系统配置数据库Dao
     */
    @Bean
    public Dao configDao(DataSource configDataSource) {
        return Dao(configDataSource, "系统配置数据库");
    }

    /**
     * 保山DG库Dao
     */
    @Bean
    public Dao bsDgDao(DataSource bsDgDataSource) {
        return Dao(bsDgDataSource, "保山DG库");
    }

    /**
     * 保山scada库Dao
     */
    @Bean
    public Dao bsScadaDao(DataSource bsScadaDataSource) {
        return Dao(bsScadaDataSource, "保山scada库");
    }

    /**
     * 保山机加一车间数据库Dao
     */
    @Bean
    public Dao bsMachine1Dao(DataSource bsMachine1DataSource) {
        return Dao(bsMachine1DataSource, "保山机加一车间数据库");
    }

    /**
     * 保山机加二车间数据库Dao
     */
    @Bean
    public Dao bsMachine2Dao(DataSource bsMachine2DataSource) {
        return Dao(bsMachine2DataSource, "保山机加二车间数据库");
    }

    /**
     * 保山机加三车间数据库Dao
     */
    @Bean
    public Dao bsMachine3Dao(DataSource bsMachine3DataSource) {
        return Dao(bsMachine3DataSource, "保山机加三车间数据库");
    }

    /**
     * 腾冲DG库Dao
     */
    @Bean
    public Dao tcDgDao(DataSource tcDgDataSource) {
        return Dao(tcDgDataSource, "腾冲DG库");
    }

    /**
     * 腾冲机加一车间数据库Dao
     */
    @Bean
    public Dao tcMachine1Dao(DataSource tcMachine1DataSource) {
        return Dao(tcMachine1DataSource, "腾冲机加一车间数据库");
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
