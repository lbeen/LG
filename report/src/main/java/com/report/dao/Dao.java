package com.report.dao;

import com.report.utils.Record;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * 公用dao类
 */
public class Dao {
    private final SqlSession sqlSession;

    Dao(SqlSession sqlSession) {this.sqlSession = sqlSession;}

    /**
     * sql查询数据list
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public List<Record> getList(String sqlId, Map<String, Object> param) {
        return sqlSession.selectList(sqlId, param);
    }

    /**
     * sql查询数据list
     *
     * @param sqlId sqlId
     */
    public List<Record> getList(String sqlId) {
        return sqlSession.selectList(sqlId);
    }

    /**
     * sql查询返回double
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public Double getDouble(String sqlId, Map<String, Object> param) {
        return sqlSession.selectOne(sqlId, param);
    }

    /**
     * 插入数据
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public void insert(String sqlId, Map<String, Object> param) {
        sqlSession.insert(sqlId, param);
    }

    /**
     * 更新数据
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public void update(String sqlId, Map<String, Object> param) {
        sqlSession.update(sqlId, param);
    }
}