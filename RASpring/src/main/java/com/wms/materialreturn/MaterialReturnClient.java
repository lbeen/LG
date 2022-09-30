package com.wms.materialreturn;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class MaterialReturnClient {
    public static void main(String[] args) throws Exception {
        MaterialReturnServiceServiceStub.StockOutputOrderInfo orderInfo = new MaterialReturnServiceServiceStub.StockOutputOrderInfo();
        orderInfo.setEsbInfo(getEsbInfo());
        orderInfo.setRequestHeaderInfo(getStockOutputOrderHeaderObj());
        orderInfo.setRequestInfo(getStockOutputOrderObjs());

        MaterialReturnServiceServiceStub.StockOutputOrderInfoE orderInfoE = new MaterialReturnServiceServiceStub.StockOutputOrderInfoE();
        orderInfoE.setStockOutputOrderInfo(orderInfo);

        MaterialReturnServiceServiceStub stub = new MaterialReturnServiceServiceStub();
        MaterialReturnServiceServiceStub.StockOutputOrderInfoResponseE responseE = stub.stockOutputOrderInfo(orderInfoE);
        MaterialReturnServiceServiceStub.StockOutputOrderInfoResponse response = responseE.getStockOutputOrderInfoResponse();
        MaterialReturnServiceServiceStub.ResponseBody responseBody = response.getStockOutputOrderInfo();
        FileUtils.write(new File("a.json"), JSON.toJSONString(responseBody), StandardCharsets.UTF_8);
    }

    private static MaterialReturnServiceServiceStub.EsbInfo getEsbInfo() {
        MaterialReturnServiceServiceStub.EsbInfo esbInfo = new MaterialReturnServiceServiceStub.EsbInfo();
        esbInfo.setRequestTime("1");
        esbInfo.setInstId("1");
        return esbInfo;
    }

    private static MaterialReturnServiceServiceStub.StockOutputOrderHeaderObj getStockOutputOrderHeaderObj() {
        MaterialReturnServiceServiceStub.StockOutputOrderHeaderObj header = new MaterialReturnServiceServiceStub.StockOutputOrderHeaderObj();
        header.setAttr1("1");
        header.setAttr2("1");
        header.setAttr3("1");
        header.setAttr4("1");
        header.setOrgCode("G02");
        header.setRequisitionNumber("requisitionNumber");
        header.setEditTime("1");
        return header;
    }

    private static MaterialReturnServiceServiceStub.StockOutputOrderObj[] getStockOutputOrderObjs() {
        MaterialReturnServiceServiceStub.StockOutputOrderObj obj = new MaterialReturnServiceServiceStub.StockOutputOrderObj();
        obj.setOrderNo("orderNo");
        obj.setOrganizationCode("G02");
        obj.setRequisitionNumber("requisitionNumber");
        obj.setPartNumber("partNumber");
        obj.setUnit("KG");
        obj.setQuantity("1000");
        obj.setBatch("erpBatch");
        obj.setStorageNumberTarget("target");
        obj.setTrayNumber("trayNumber");
        obj.setBoxNumber("boxNumber3");
        obj.setMaterial("复拉料");
        obj.setAttribute7("边皮");
        obj.setAttribute8("边皮小");
        obj.setAttribute9("型号");
        obj.setAttribute12("自有");
        obj.setAttribute19("边皮复拉料");
        obj.setAttribute21("BBBBBBBBB");
        obj.setProductDate("2022-09-29 10:35:15");
        obj.setWarehousingDate("2022-09-28 10:35:15");
        return new MaterialReturnServiceServiceStub.StockOutputOrderObj[]{obj};
    }
}
