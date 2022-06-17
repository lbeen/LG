package com.mes;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.ui.Time;
import com.mes.dao.Dao;
import com.mes.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

@RestController
@RequestMapping("/finish")
public class FinishController {
    private final Dao dao;

    public FinishController(Dao dao) {this.dao = dao;}

    @RequestMapping("record")
    public Result record() throws Exception {
        //保山16 15
        //        Vector<ATRow> list = dao.queryATRows("PM_SiliconRodsRecord", f -> {});
        //        for (ATRow row : list) {
        //            row.delete(null, null, null);
        //        }

        Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2022-05-29 08:30:00");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Time time = new Time(instance);
        Vector<ATRow> list = dao.queryATRows("PM_SiliconRodsDetail", f -> f.forCreatedTimeGreaterThanOrEqualTo(time));

        int count = list.size();
        System.out.println(count);
        for (ATRow detail : list) {
            dao.insert("PM_SiliconRodsRecord", row -> {
                row.setValue("main_key", detail.getKey());
                row.setValue("crystal_number", detail.getValue("crystal_number"));
                row.setValue("length", detail.getValue("qualified_length"));
                row.setValue("del_status", 0L);
                row.setValue("times", 1L);
                row.setValue("first_time", detail.getCreationTime());
                row.setValue("first_number", detail.getValue("crystal_number"));
            });
            count--;
            if (count % 100 == 0) {
                System.out.println(count);
            }
        }
        System.out.println(count);

        return Result.success();
    }

    @RequestMapping("check")
    public Result check() throws Exception {
        String sql = "SELECT D.ATR_KEY FROM AT_PM_SILICONRODSRECORD R\n" + "RIGHT JOIN AT_PM_SILICONRODSDETAIL D ON R" + ".MAIN_KEY_I=D.ATR_KEY\n" + "WHERE R.ATR_KEY IS NULL AND D.Creation_Time>sysdate-1";
        List<String[]> list = dao.queryList(sql);
        int count = list.size();
        System.out.println(count);
        for (String[] obj : list) {
            ATRow detail = dao.queryATRow("PM_SiliconRodsDetail", f -> f.forATRowKeyEqualTo(Long.parseLong(obj[0])));
            dao.insert("PM_SiliconRodsRecord", row -> {
                row.setValue("main_key", detail.getKey());
                row.setValue("crystal_number", detail.getValue("crystal_number"));
                row.setValue("length", detail.getValue("qualified_length"));
                row.setValue("del_status", 0L);
                row.setValue("times", 1L);
                row.setValue("first_time", detail.getCreationTime());
                row.setValue("first_number", detail.getValue("crystal_number"));
            });
            count--;
            System.out.println(count);
        }

        return Result.success();
    }
}
