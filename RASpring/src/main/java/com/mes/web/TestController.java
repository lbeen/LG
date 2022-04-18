package com.mes.web;

import com.datasweep.compatibility.client.ATHandler;
import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.client.UserSequence;
import com.datasweep.compatibility.client.UserSequenceValue;
import com.datasweep.compatibility.ui.Time;
import com.mes.dao.Dao;
import com.mes.util.CommonUtils;
import com.mes.util.Result;
import com.rockwell.mes.commons.base.ifc.services.IFunctionsEx;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Vector;

@RestController
@RequestMapping("/test")
public class TestController {
    private final Dao dao;

    public TestController(Dao dao) {this.dao = dao;}

    @RequestMapping("list")
    public Result list() throws Exception {
        Vector<ATRow> list = dao.queryATRows("AT_test", f -> {});
        return null;
    }

    private String getShortDateStr() {
        //        CollectionUtils
        IFunctionsEx FUNCTION = dao.getFunction();
        return FUNCTION.formatTime(FUNCTION.getDBTime(), "yMD");
    }

    @RequestMapping("insert")
    public Result insert() throws Exception {
        dao.insert("AT_test", row -> {
            row.setValue("Column_1", "test");
            row.setValue("Column_2", 1);
            row.setValue("Column_3", 1.1);
            row.setValue("Column_4", dao.getDBTime());
        });
        return Result.success();
    }

    @RequestMapping("update")
    public Result update() throws Exception {
        ATRow atRow = dao.queryATRow("AT_test", f -> f.forColumnNameEqualTo("Column_1", "test"));
        atRow.setValue("Column_2", 2);
        dao.update(atRow);
        return Result.success();
    }

}
