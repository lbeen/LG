package com.mes.timer.emstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*过点信息
* */
@Getter
@Setter
public class EmInfor
{
   private  int keyid;

   private  String equipment;

   private Date actionTime;

   @TableField("crystal_number")
   private  String crystalNumber;

   @TableField("if_id")
   private  String ifId;

}
