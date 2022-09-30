package com.wms.billreturn;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class BillReturnClient2 {
    public static void main(String[] args) throws Exception {
        BillReturnServiceServiceStub.BillStateReturn billStateReturn = new BillReturnServiceServiceStub.BillStateReturn();
        billStateReturn.setEsbInfo(getEsbInfo());
        billStateReturn.setRequestInfo(getRequestInfo());

        BillReturnServiceServiceStub.BillStateReturnE billStateReturnE = new BillReturnServiceServiceStub.BillStateReturnE();
        billStateReturnE.setBillStateReturn(billStateReturn);

        BillReturnServiceServiceStub stub = new BillReturnServiceServiceStub();
        BillReturnServiceServiceStub.BillStateReturnResponseE responseE = stub.billStateReturn(billStateReturnE);
        BillReturnServiceServiceStub.BillStateReturnResponse response = responseE.getBillStateReturnResponse();
        BillReturnServiceServiceStub.ResponseBody responseBody = response.getBillStateReturn();
        FileUtils.write(new File("b.json"), JSON.toJSONString(responseBody), StandardCharsets.UTF_8);
    }

    private static BillReturnServiceServiceStub.EsbInfo getEsbInfo() {
        BillReturnServiceServiceStub.EsbInfo esbInfo = new BillReturnServiceServiceStub.EsbInfo();
        esbInfo.setRequestTime("1");
        esbInfo.setInstId("1");
        return esbInfo;
    }

    private static BillReturnServiceServiceStub.BillInfo[] getRequestInfo() {
        BillReturnServiceServiceStub.BillInfo billInfo = new BillReturnServiceServiceStub.BillInfo();
        billInfo.setStatus("0");
        billInfo.setPickingBill("T22092714L");
        billInfo.setOrderType("WAWROR");
        return new BillReturnServiceServiceStub.BillInfo[]{billInfo};
    }
}
