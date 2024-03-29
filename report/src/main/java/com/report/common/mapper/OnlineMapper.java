package com.report.common.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OnlineMapper {

    /**
     * 毛棒在线统计
     *
     * @param param 查询参数
     */
    List<Record> maoOnlineStatistics(Map<String, Object> param);

    /**
     * 毛棒在线列表
     *
     * @param param 查询参数
     */
    List<Record> maoOnlineList(Map<String, Object> param);

    /**
     * 切断在线统计
     */
    Record cutoffOnlineStatisticsAll();

    /**
     * 切断在线统计
     *
     * @param param 查询参数
     */
    List<Record> cutoffOnlineStatistics(Map<String, Object> param);

    /**
     * 切断在线列表
     *
     * @param param 查询参数
     */
    List<Record> cutoffOnlineList(Map<String, Object> param);

    /**
     * 切断在线列表
     *
     * @param param 查询参数
     */
    List<Record> cutoffOnlineListBS(Map<String, Object> param);

    /**
     * 切方在线统计
     */
    Record buttOnlineStatisticsAll();

    /**
     * 切方在线统计
     *
     * @param param 查询参数
     */
    List<Record> buttOnlineStatistics(Map<String, Object> param);

    /**
     * 切方在线列表
     *
     * @param param 查询参数
     */
    List<Record> buttOnlineList(Map<String, Object> param);

    /**
     * 切方在线列表
     *
     * @param param 查询参数
     */
    List<Record> buttOnlineListBS(Map<String, Object> param);

    /**
     * 抛光在线统计
     */
    Record polishingOnlineStatisticsAll();

    /**
     * 抛光在线统计
     *
     * @param param 查询参数
     */
    List<Record> polishingOnlineStatistics(Map<String, Object> param);

    /**
     * 抛光在线列表
     *
     * @param param 查询参数
     */
    List<Record> polishingOnlineList(Map<String, Object> param);

    /**
     * 抛光在线列表
     *
     * @param param 查询参数
     */
    List<Record> polishingOnlineListBS(Map<String, Object> param);

    /**
     * 成品量产品在线统计
     */
    Record finishOnlineStatisticsAll();

    /**
     * 成品在线统计
     *
     * @param param 查询参数
     */
    List<Record> finishOnlineStatistics(Map<String, Object> param);

    /**
     * 成品在线列表
     *
     * @param param 查询参数
     */
    List<Record> finishOnlineList(Map<String, Object> param);

    /**
     * 成品在线列表
     *
     * @param param 查询参数
     */
    List<Record> finishOnlineListBS(Map<String, Object> param);

    /**
     * 半托在线统计
     *
     * @param param 查询参数
     */
    List<Record> halfPalletOnlineStatistics(Map<String, Object> param);

    /**
     * 半托在线列表
     *
     * @param param 查询参数
     */
    List<Record> halfPalletOnlineList(Map<String, Object> param);

    /**
     * 半托在线列表
     *
     * @param param 查询参数
     */
    List<Record> halfPalletOnlineListBS(Map<String, Object> param);

    /**
     * 半托在线列表
     *
     * @param crystalType 在线晶编类型
     */
    Record yesterdayOnlineTotal(String crystalType);

    /**
     * 半托在线列表
     *
     * @param crystalType 在线晶编类型
     */
    List<Record> yesterdayOnlineBySpec(String crystalType);
}