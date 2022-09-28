package com.mes.timer.emstop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mes.timer.emstop.entity.EmInfor;
import com.mes.timer.emstop.entity.IfEmStop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmStopMapper extends BaseMapper<IfEmStop>
{

    //    获取切断下线信息
    public List<EmInfor> getCutOffList();
    //获取切断上线信息
    public List<EmInfor> getCutOnList();

    public List<EmInfor> getButtOnList();
    public List<EmInfor> getButtOffList();
    public List<EmInfor> getPolishingOnList();
    public List<EmInfor> getPolishingOffList();
    //获取停机信息
    //public List<IfEmStop> getStopInfoList(@Param("START_TIME_STOP") Date stopStarttime,@Param("EM_CODE") String EmCode);


}
