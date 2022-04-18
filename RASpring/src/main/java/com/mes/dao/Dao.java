package com.mes.dao;

import com.datasweep.compatibility.client.ATHandler;
import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.services.IFunctionsEx;
import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class Dao {
    private final IFunctionsEx function;

    public Dao(DaoInitialization daoInitialization) {
        this.function = daoInitialization.getFunction();
    }

    public IFunctionsEx getFunction() {
        return function;
    }

    public Time getDBTime() {
        return function.getDBTime();
    }

    /**
     * 查询AT表数据
     *
     * @param ATDefinition AT表定义
     * @param consumer     查询条件拼装
     */
    public Vector<ATRow> queryATRows(String ATDefinition, ConditionConsumer consumer) throws DatasweepException {
        ATRowFilter filter = function.createATRowFilter(ATDefinition);
        consumer.accept(filter);
        @SuppressWarnings("unchecked")
        Vector<ATRow> rows = function.getFilteredATRows(filter, false);
        return rows == null ? new Vector<>() : rows;
    }

    /**
     * 查询AT表数据
     *
     * @param ATDefinition AT表定义
     * @param consumer     查询条件拼装
     */
    public ATRow queryATRow(String ATDefinition, ConditionConsumer consumer) throws DatasweepException {
        Vector<ATRow> vector = queryATRows(ATDefinition, consumer);
        return vector.isEmpty() ? null : vector.get(0);
    }

    /**
     * sql查询数据
     *
     * @param sql sql
     */
    public Vector<String[]> queryBySql(String sql) {
        @SuppressWarnings("unchecked")
        Vector<String[]> list = function.getArrayDataFromActive(sql);
        return list == null ? new Vector<>() : list;
    }

    public Response insert(String ATDefinition, SetConsumer consumer) throws DatasweepException {
        ATHandler atHandlerArea = function.createATHandler(ATDefinition);
        ATRow row = atHandlerArea.createATRow();
        consumer.accept(row);
        return row.save(null, null, null);
    }

    public Response update(ATRow row) {
        return row.save(null, null, null);
    }

    /**
     * 查询条件拼接接口
     */
    @FunctionalInterface
    public interface ConditionConsumer {
        void accept(ATRowFilter f) throws DatasweepException;
    }

    /**
     * 查询条件拼接接口
     */
    @FunctionalInterface
    public interface SetConsumer {
        void accept(ATRow row) throws DatasweepException;
    }
}
