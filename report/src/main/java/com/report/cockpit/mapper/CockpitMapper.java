package com.report.cockpit.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface CockpitMapper {
    /**
     * 寿命大于150占比
     */
    List<Record> lifetimeGt150(Map<String, Object> param);

    /**
     * 工单规格
     */
    List<Record> orderInfo(Set<String> orders);

    /**
     * 昨天运行炉台
     */
    List<Record> yesterdayRunPullerGroupSpec();

    /**
     * 昨天运行炉台
     */
    List<Record> yesterdayRunPullersGroupWorkshop();

    /**
     * 昨天运行炉台
     */
    List<Record> runPullerGroupSpec();

    /**
     * 昨天运行炉台
     */
    List<Record> runPullersGroupWorkshop();

    /**
     * 获取方棒产量
     */
    List<Record> finish(Map<String, Object> param);

    /**
     * 获取方棒产量目标
     */
    Double finishTarget();

    /**
     * 获取投料量
     */
    List<Record> feeding(Map<String, Object> param);

    /**
     * 获取方棒产量
     */
    List<Record> squareYield(Map<String, Object> param);

    /**
     * 获取拉晶用时
     */
    List<Record> timeSingle(Map<String, Object> param);

    /**
     * 获取方棒产量分规格
     */
    List<Record> squareYieldBySpec(Map<String, Object> param);

    /**
     * 获取拉晶用时分规格
     */
    List<Record> timeSingleBySpec(Map<String, Object> param);

    /**
     * 获取平均成品率
     */
    Double avgFinishRate(Map<String, Object> param);

    /**
     * 获取无位错产量
     */
    List<Record> getWwcWeight(Map<String, Object> param);

    /**
     * 获取方棒产量分规格
     */
    List<Record> squareYieldBySpec2(Map<String, Object> param);

    /**
     * 获取拉晶用时分规格
     */
    List<Record> timeSingleBySpec2(Map<String, Object> param);

    /**
     * 获取平均成品率
     */
    Double avgFinishRate2(Map<String, Object> param);

    /**
     * 获取无位错产量
     */
    List<Record> getWwcWeight2(Map<String, Object> param);

    /**
     * 获取方棒产量
     */
    List<Record> squareYieldTarget(Map<String, Object> param);

    /**
     * 获取单晶产能
     */
    List<Record> singleYield(Map<String, Object> param);

    /**
     * 获取机加产能
     */
    List<Record> machineYield(Map<String, Object> param);

    /**
     * 获取机加产能
     */
    List<Record> machineYieldTC(Map<String, Object> param);

    /**
     * 机加物料周转天数
     */
    List<Record> turnoverDays(Map<String, Object> param);

    /**
     * 机加48小时在线
     */
    List<Record> machineOnline48();

    /**
     * 单晶8小时在线
     */
    List<Record> singleOnline8();

    /**
     * 成品率
     */
    List<Record> singleFinishedRate(Map<String, Object> param);

    /**
     * 交料趋势
     */
    List<Record> payLength(Map<String, Object> param);

    /**
     * 单晶在线
     */
    List<Record> singleOnline();

    /**
     * 机加在线
     */
    List<Record> machineOnline();
}
