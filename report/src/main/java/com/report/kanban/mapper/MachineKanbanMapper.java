package com.report.kanban.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MachineKanbanMapper {
    /**
     * 毛棒接收
     *
     * @param param 查询参数
     */
    List<Record> blankBarReceive(Map<String, Object> param);

    /**
     * 毛棒检验
     *
     * @param param 查询参数
     */
    List<Record> blankBarTest(Map<String, Object> param);

    /**
     * 切断产量
     *
     * @param param 查询参数
     */
    List<Record> cutoffYield(Map<String, Object> param);

    /**
     * 切断产量（createTime查询）
     *
     * @param param 查询参数
     */
    List<Record> cutoffYieldCreateTime(Map<String, Object> param);

    /**
     * 切方产量
     *
     * @param param 查询参数
     */
    List<Record> buttYield(Map<String, Object> param);

    /**
     * 抛光产量
     *
     * @param param 查询参数
     */
    List<Record> polishingYield(Map<String, Object> param);

    /**
     * 抛光产量（createTime查询）
     *
     * @param param 查询参数
     */
    List<Record> polishingYieldCreateTime(Map<String, Object> param);

    /**
     * 成品产量
     *
     * @param param 查询参数
     */
    List<Record> finishYield(Map<String, Object> param);
}
