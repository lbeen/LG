package com.report.kanban.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.report.kanban.mapper.MachineKanbanMapper;
import com.report.kanban.service.MachineKanbanService;
import com.report.utils.CommonUtils;
import com.report.utils.DataUtils;
import com.report.utils.SysUtils;
import com.report.utils.TimeUtils;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.Record;
import com.report.utils.pojo.Times;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class MachineKanbanServiceImpl implements MachineKanbanService {
    private final MachineKanbanMapper machineKanbanMapper;

    /**
     * 获取毛棒接收检测数据
     *
     * @param dataSource 数据源
     * @param shop       车间
     */
    @DS("#dataSource")
    @Override
    public Map<String, Object> blankBarCount(String dataSource, String shop) {
        Times times = TimeUtils.getRecent2Shifts();

        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", times.startTime());
        param.put("shop", SysUtils.getLJShop(shop));
        Map<String, Double> receive = DataUtils.getMap(machineKanbanMapper::blankBarReceive, param);
        Map<String, Double> test = DataUtils.getMap(machineKanbanMapper::blankBarTest, param);

        String[] formats = times.formats();
        String[] names = times.names();
        Object[] last = new Object[]{names[0], receive.getOrDefault(formats[0], 0D), test.getOrDefault(formats[0], 0D)};
        Object[] current = new Object[]{names[1], receive.getOrDefault(formats[1], 0D),
                test.getOrDefault(formats[1], 0D)};

        Map<String, Object> returnMap = Maps.newHashMap();
        returnMap.put("heads", new String[]{"班次", "毛棒接收", "毛棒检验",});
        returnMap.put("list", new Object[][]{last, current});
        return returnMap;
    }

    /**
     * 切断产量
     *
     * @param dataSource 数据源
     */
    @DS("#dataSource")
    @Override
    public EchartsData cutoffYield(String dataSource) {
        if (dataSource.equals(SysUtils.DS_BS_MACHINE2)) {
            return getEchartsData(machineKanbanMapper::cutoffYieldCreateTime);
        }
        return getEchartsData(machineKanbanMapper::cutoffYield);
    }

    /**
     * 切方产量
     *
     * @param dataSource 数据源
     */
    @DS("#dataSource")
    @Override
    public EchartsData buttYield(String dataSource) {
        return getEchartsData(machineKanbanMapper::buttYield);
    }

    /**
     * 抛光产量
     *
     * @param dataSource 数据源
     */
    @DS("#dataSource")
    @Override
    public EchartsData polishingYield(String dataSource) {
        if (dataSource.equals(SysUtils.DS_BS_MACHINE3)) {
            return getEchartsData(machineKanbanMapper::polishingYield);
        }
        return getEchartsData(machineKanbanMapper::polishingYieldCreateTime);
    }

    /**
     * 成品产量
     *
     * @param dataSource 数据源
     * @param shop    车间
     */
    @DS("#dataSource")
    @Override
    public EchartsData finishYield(String dataSource, String shop) {
        return getEchartsData(machineKanbanMapper::finishYield);
    }

    private EchartsData getEchartsData(Function<Map<String, Object>, List<Record>> query) {
        Times times = TimeUtils.getRecent2Shifts();
        String[] formatTimes = times.formatTimes();
        Map<String, Double> lastMap = getMap(query, formatTimes[0], formatTimes[1]);
        Map<String, Double> currentMap = getMap(query, formatTimes[1], TimeUtils.formatNowTime());

        Set<String> keys = Sets.newTreeSet();
        keys.addAll(lastMap.keySet());
        keys.addAll(currentMap.keySet());
        String[] xAxis = keys.toArray(new String[0]);

        double[] last = new double[xAxis.length];
        double[] current = new double[xAxis.length];
        int lastTotal = 0;
        int currentTotal = 0;
        for (int i = 0; i < xAxis.length; i++) {
            last[i] = CommonUtils.round(lastMap.get(xAxis[i]), 0);
            current[i] = CommonUtils.round(currentMap.get(xAxis[i]), 0);

            lastTotal += last[i];
            currentTotal += current[i];
        }

        String[] names = times.names();
        String[] legend = new String[]{names[0] + "（" + lastTotal + "）", names[1] + "（" + currentTotal + "）"};
        return new EchartsData(legend, xAxis, new double[][]{last, current});
    }

    private Map<String, Double> getMap(Function<Map<String, Object>, List<Record>> query, String startTime,
                                       String endTime) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        return DataUtils.getMap(query, param);
    }
}
