package com.mes.timer.point.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mes.timer.point.entity.AutomaticButtOFF;
import com.mes.timer.point.entity.AutomaticButtON;
import com.mes.timer.point.entity.AutomaticPolishingOFF;
import com.mes.timer.point.entity.AutomaticPolishingON;
import com.mes.timer.point.entity.MesButt;
import com.mes.timer.point.entity.MesPolishing;
import com.mes.timer.point.entity.MesRound;
import com.mes.timer.point.entity.base.AutomaticData;
import com.mes.timer.point.entity.base.MesPointData;
import com.mes.timer.point.mapper.MesButtMapper;
import com.mes.timer.point.mapper.MesPolishingMapper;
import com.mes.timer.point.mapper.MesRoundMapper;
import com.mes.timer.point.service.MESPointService;
import com.mes.timer.utils.CommonUtils;
import com.mes.timer.utils.LogUtils;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class MESPointServiceImpl implements MESPointService {
    /**
     * 状态上线
     */
    private static final String STATUS_ON = "ON";
    /**
     * 状态下线
     */
    private static final String STATUS_OFF = "OFF";
    /**
     * 补账机台号
     */
    private static final String EQUIPMENT_COMPLETION = "0";
    /**
     * 初始化的接收状态0
     */
    private static final String RECEIVE_TAG_INIT = "0";
    /**
     * 备注4默认值（1：标识自动任务补的数据）
     */
    private static final int DATA_TYPE = 1;

    private final MesRoundMapper mesRoundMapper;

    private final MesButtMapper mesButtMapper;

    private final MesPolishingMapper mesPolishingMapper;

    /**
     * MES处理自动化切方上线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    @DS("#DS")
    @Override
    public void handleButtONData(String DS, List<AutomaticButtON> automaticList) {
        handleData(automaticList, crystalNumber -> existMesButtData(crystalNumber, STATUS_ON), automaticData -> {
            MesButt butt = new MesButt();
            setMesPointData(butt, automaticData);
            butt.setStatus(STATUS_ON);
            mesButtMapper.insert(butt);
            return true;
        }, "切方上线");
    }

    /**
     * MES处理自动化切方下线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    @DS("#DS")
    @Override
    public void handleButtOFFData(String DS, List<AutomaticButtOFF> automaticList) {
        handleData(automaticList, crystalNumber -> existMesButtData(crystalNumber, STATUS_OFF), automaticData -> {
            MesButt butt = new MesButt();
            setMesPointData(butt, automaticData);
            butt.setFlight(automaticData.getFlight());
            butt.setLineLoss(Objects.toString(automaticData.getWireCost(), null));
            butt.setInitLineLoss(Objects.toString(automaticData.getWireStart(), null));
            butt.setEndLineLoss(Objects.toString(automaticData.getWireLeft(), null));
            Double consumption = CommonUtils.divide(automaticData.getWireCost(), automaticData.getCalWeight(), 6);
            butt.setConsumption(Objects.toString(consumption, null));
            butt.setStartTime(automaticData.getStartTime());
            butt.setEndTime(automaticData.getEndTime());
            butt.setBoltNumber(automaticData.getWireBreakTimes());
            butt.setStatus(STATUS_OFF);
            mesButtMapper.insert(butt);
            return true;
        }, "切方下线");
    }

    /**
     * 是否存在当前晶编的切方数据
     *
     * @param crystalNumber 晶编
     * @param status        状态
     */
    private boolean existMesButtData(String crystalNumber, String status) {
        LambdaQueryWrapper<MesButt> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MesButt::getCrystalNumber, crystalNumber);
        queryWrapper.eq(MesButt::getStatus, status);
        queryWrapper.ne(MesButt::getEquipment, EQUIPMENT_COMPLETION);
        return mesButtMapper.exists(queryWrapper);
    }

    /**
     * MES处理自动化抛光上线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    @DS("#DS")
    @Override
    public void handlePolishingONData(String DS, List<AutomaticPolishingON> automaticList) {
        handleData(automaticList, crystalNumber -> existMesPolishingData(crystalNumber, STATUS_ON), automaticData -> {
            MesPolishing polishing = new MesPolishing();
            setMesPointData(polishing, automaticData);
            polishing.setStatus(STATUS_ON);
            mesPolishingMapper.insert(polishing);
            return true;
        }, "抛光上线");
    }

    /**
     * MES处理自动化抛光下线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    @DS("#DS")
    @Override
    public void handlePolishingOFFData(String DS, List<AutomaticPolishingOFF> automaticList) {
        handleData(automaticList, crystalNumber -> existMesPolishingData(crystalNumber, STATUS_OFF), automaticData -> {
            if (automaticData.getAfterEdge1() == null || automaticData.getAfterEdge1() == 0) {
                return false;
            }
            MesPolishing polishing = new MesPolishing();
            setMesPointData(polishing, automaticData);
            polishing.setFlight(automaticData.getFlight());
            polishing.setBeforeEdge1(round3(automaticData.getBeforeEdge1()));
            polishing.setBeforeEdge2(round3(automaticData.getBeforeEdge2()));
            polishing.setBeforeEdge3(round3(automaticData.getBeforeEdge3()));
            polishing.setBeforeEdge4(round3(automaticData.getBeforeEdge4()));
            polishing.setBeforeEdge5(round3(automaticData.getBeforeEdge5()));
            polishing.setBeforeEdge6(round3(automaticData.getBeforeEdge6()));
            polishing.setBeforeDiameter1(round3(automaticData.getBeforeDiameter1()));
            polishing.setBeforeDiameter2(round3(automaticData.getBeforeDiameter2()));
            polishing.setBeforeDiameter3(round3(automaticData.getBeforeDiameter3()));
            polishing.setBeforeDiameter4(round3(automaticData.getBeforeDiameter4()));
            polishing.setAfterEdge1(round3(automaticData.getAfterEdge1()));
            polishing.setAfterEdge2(round3(automaticData.getAfterEdge2()));
            polishing.setAfterEdge3(round3(automaticData.getAfterEdge3()));
            polishing.setAfterEdge4(round3(automaticData.getAfterEdge4()));
            polishing.setAfterEdge5(round3(automaticData.getAfterEdge5()));
            polishing.setAfterEdge6(round3(automaticData.getAfterEdge6()));
            polishing.setAfterDiameter1(round3(automaticData.getAfterDiameter1()));
            polishing.setAfterDiameter2(round3(automaticData.getAfterDiameter2()));
            polishing.setAfterDiameter3(round3(automaticData.getAfterDiameter3()));
            polishing.setAfterDiameter4(round3(automaticData.getAfterDiameter4()));
            polishing.setAfterDiameter5(round3(automaticData.getAfterDiameter5()));
            polishing.setAfterDiameter6(round3(automaticData.getAfterDiameter6()));
            polishing.setStatus(STATUS_OFF);
            mesPolishingMapper.insert(polishing);
            return true;
        }, "抛光下线");
    }

    /**
     * 保留三位小数
     */
    private Double round3(Double num) {
        return CommonUtils.round(num, 3);
    }

    /**
     * 是否存在当前晶编的切方数据
     *
     * @param crystalNumber 晶编
     * @param status        状态
     */
    private boolean existMesPolishingData(String crystalNumber, String status) {
        LambdaQueryWrapper<MesPolishing> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MesPolishing::getCrystalNumber, crystalNumber);
        queryWrapper.eq(MesPolishing::getStatus, status);
        queryWrapper.ne(MesPolishing::getEquipment, EQUIPMENT_COMPLETION);
        return mesPolishingMapper.exists(queryWrapper);
    }

    /**
     * 设置mes过点数据
     *
     * @param mesPointData  mes过点数据
     * @param automaticData 自动化数据
     */
    private void setMesPointData(MesPointData mesPointData, AutomaticData automaticData) {
        mesPointData.setCrystalNumber(automaticData.getCrystalNumber());
        mesPointData.setSpec(automaticData.getSpec());
        mesPointData.setWorkshop(getMachineWorkshopCode(automaticData.getWorkshop()));
        mesPointData.setActionTime(automaticData.getActionTime());
        mesPointData.setEquipment(automaticData.getEquipment());
        mesPointData.setLength(automaticData.getLength());
        mesPointData.setReceiveTag(RECEIVE_TAG_INIT);
        mesPointData.setDataType(DATA_TYPE);
    }

    /**
     * 获取机加车间代码
     *
     * @param automaticWorkshop 自动化车间
     */
    private String getMachineWorkshopCode(String automaticWorkshop) {
        if (automaticWorkshop == null) {
            return null;
        }
        switch (automaticWorkshop) {
            case "机加一车间":
            case "机加四车间":
                return "CJ01_JJ";
            case "机加二车间":
                return "CJ02_JJ";
            case "机加三车间":
                return "CJ03_JJ";

        }
        return null;
    }

    /**
     * 处理数据
     *
     * @param automaticList 自动化数据
     * @param existChecker  过点数据是否存在方法
     * @param saver         保存方法
     * @param type          过点数据类型
     * @param <A>           自动化数据类型
     */
    private <A extends AutomaticData> void handleData(List<A> automaticList, Function<String, Boolean> existChecker,
                                                      Function<A, Boolean> saver, String type) {
        for (A automaticData : automaticList) {
            String crystalNumber = automaticData.getCrystalNumber();
            if (StringUtils.length(crystalNumber) != 13) {
                continue;
            }
            //过点数据是否存在
            if (existChecker.apply(crystalNumber)) {
                continue;
            }
            //晶编是否在mes不存在
            if (crystalNumberNotInMES(crystalNumber)) {
                continue;
            }
            try {
                saver.apply(automaticData);
            } catch (Exception e) {
                String msg = crystalNumber + type + "数据保存失败";
                LogUtils.logError(MESPointServiceImpl.class, "handleData", msg, e);
            }
        }
    }

    /**
     * 晶编是否在mes中
     *
     * @param crystalNumber 晶编
     */
    private boolean crystalNumberNotInMES(String crystalNumber) {
        LambdaQueryWrapper<MesRound> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.likeRight(MesRound::getCrystalNumber, StringUtils.substring(crystalNumber, 0, 12));
        return !mesRoundMapper.exists(queryWrapper);
    }

    /**
     * 获取MES切方数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param workshop  车间
     * @param status    状态
     */
    @DS("#DS")
    @Override
    public List<MesButt> getMesButtList(String DS, LocalDateTime startTime, LocalDateTime endTime, String workshop,
                                        String status) {
        LambdaQueryWrapper<MesButt> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(MesButt::getActionTime, startTime);
        queryWrapper.lt(MesButt::getActionTime, endTime);
        queryWrapper.eq(MesButt::getWorkshop, workshop);
        queryWrapper.eq(MesButt::getStatus, status);
        queryWrapper.ne(MesButt::getEquipment, EQUIPMENT_COMPLETION);
        return mesButtMapper.selectList(queryWrapper);
    }

    /**
     * 获取MES抛光数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param workshop  车间
     * @param status    状态
     */
    @DS("#DS")
    @Override
    public List<MesPolishing> getMesPolishingList(String DS, LocalDateTime startTime, LocalDateTime endTime,
                                                  String workshop, String status) {
        LambdaQueryWrapper<MesPolishing> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(MesPolishing::getActionTime, startTime);
        queryWrapper.lt(MesPolishing::getActionTime, endTime);
        queryWrapper.eq(MesPolishing::getWorkshop, workshop);
        queryWrapper.eq(MesPolishing::getStatus, status);
        queryWrapper.ne(MesPolishing::getEquipment, EQUIPMENT_COMPLETION);
        return mesPolishingMapper.selectList(queryWrapper);
    }
}