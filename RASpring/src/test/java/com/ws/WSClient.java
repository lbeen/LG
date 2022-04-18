package com.ws;

import com.alibaba.fastjson.JSONObject;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class WSClient {
    private static final String WL_WSDL = "http://10.2.0.142:12030/Service/LOGISTICS_MES_Service?wsdl";
//    private static final String WL_WSDL = "http://10.2.6.166:12030/Service/LOGISTICS_MES_Service?wsdl";
    private static final String NG_WSDL = "http://10.2.5.60:12009/Service/ENERGY_MES_Service?wsdl";

    public static void main(String[] args) throws Exception {


//        getBoxInfo();
//        checkBoxWeightBack();
        returnBox();
//        getMESYield();
    }

    private static void getBoxInfo() throws Exception {
        JSONObject json = new JSONObject();
        json.put("waterCode", "B22012900010");
        request(WL_WSDL, "getBoxInfo", json.toJSONString());
    }

    private static void checkBoxWeightBack() throws Exception {
        JSONObject json = new JSONObject();
        json.put("waterCode", "B22012900010");
        json.put("state", "OK");
        request(WL_WSDL, "checkBoxWeightBack", json.toJSONString());
    }

    private static void returnBox() throws Exception {
        JSONObject json = new JSONObject();
        json.put("waterCode", "B22012900011");
        request(WL_WSDL, "returnBox", json.toJSONString());
    }

    private static void getMESYield() throws Exception {
        JSONObject json = new JSONObject();
        json.put("startTime", "2021-10-20 13:00:00");
        json.put("endTime", "2021-10-20 14:00:00");
        request(NG_WSDL, "MESYield", json.toJSONString());
    }

    private static void request(String url, String method, Object param) throws Exception {
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient(url);
        System.out.println(param);
        Object[] results = client.invoke(method, param);
        System.out.println(results[0]);
    }
}
