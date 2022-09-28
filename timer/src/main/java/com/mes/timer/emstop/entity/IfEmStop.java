package com.mes.timer.emstop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableName("if_em_stop")
public class IfEmStop
{

   @TableId(value = "KEYID",type = IdType.ASSIGN_UUID)
   private  String keyid;
   private  String emCode;
   private  long emStopoftimeMin;
   private long emArea;
   private Date startTimeStop;
   private  Date endTimeStop;
   private  Date updateTime;
   private  String endCrystalNumber;
}
