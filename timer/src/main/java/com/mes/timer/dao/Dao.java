package com.mes.timer.dao;

import com.mes.timer.utils.Record;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
    public List<Record> getList(String sqlId, Object param) {
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
     * sql查询返回Record
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public Record getRecord(String sqlId, Object param) {
        return sqlSession.selectOne(sqlId, param);
    }

    /**
     * 插入数据
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public void insert(String sqlId, Object param) {
        sqlSession.insert(sqlId, param);
    }

    /**
     * 更新数据
     *
     * @param sqlId sqlId
     * @param param 参数
     */
    public void update(String sqlId, Object param) {
        sqlSession.update(sqlId, param);
    }
}
