package com.mes.timer.message.kk;

import com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub;
import com.mes.timer.sys.Factory;
import com.mes.timer.utils.LogUtils;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;

/**
 * KK工具
 */
public class KKUtils {
    private static final String USER = "mes";
    private static final String PASSWORD = "d2db8a610f8c7c0785d2d92a6e8c450e";
    private static final String LINK = "http://10.2.0.147:8091/page/message/message.html";

    /**
     * 提交待办
     */
    public static boolean sendTodo(ISysNotifyTodoWebServiceServiceStub.NotifyTodoSendContext context, Factory factory) {
        try {
            context.setAppName(getAppName(factory));
            context.setModelName(getAppName(factory));
            context.setLink(LINK + "?factory=" + factory.name() + "&key=" + context.getModelId());

            ISysNotifyTodoWebServiceServiceStub.SendTodo sendTodo = new ISysNotifyTodoWebServiceServiceStub.SendTodo();
            sendTodo.setArg0(context);
            ISysNotifyTodoWebServiceServiceStub.SendTodoE sendTodoE = new ISysNotifyTodoWebServiceServiceStub.SendTodoE();
            sendTodoE.setSendTodo(sendTodo);

            ISysNotifyTodoWebServiceServiceStub stub = getStub();
            ISysNotifyTodoWebServiceServiceStub.SendTodoResponseE responseE = stub.sendTodo(sendTodoE);
            ISysNotifyTodoWebServiceServiceStub.SendTodoResponse sendTodoResponse = responseE.getSendTodoResponse();
            ISysNotifyTodoWebServiceServiceStub.NotifyTodoAppResult result = sendTodoResponse.get_return();
            if (result.getReturnState() == 2) {
                LogUtils.logInfo(KKUtils.class, "sendTodo", context.getModelId() + "：KK推送成功");
                return true;
            }

            LogUtils.logError(KKUtils.class, "sendTodo", context.getModelId() + "：KK推送失败：返回信息：" + result.getMessage());
            return false;
        } catch (Exception e) {
            LogUtils.logError(KKUtils.class, "sendTodo", context.getModelId() + "：KK推送失败", e);
            return false;
        }
    }

    /**
     * 待办变已办
     */
    public static boolean todoDone(String modelId, Factory factory) {
        try {
            ISysNotifyTodoWebServiceServiceStub.NotifyTodoRemoveContext context = new ISysNotifyTodoWebServiceServiceStub.NotifyTodoRemoveContext();
            context.setAppName(getAppName(factory));
            context.setModelName(getAppName(factory));
            context.setModelId(modelId);
            context.setOptType(1);

            ISysNotifyTodoWebServiceServiceStub.SetTodoDone setTodoDone = new ISysNotifyTodoWebServiceServiceStub.SetTodoDone();
            setTodoDone.setArg0(context);
            ISysNotifyTodoWebServiceServiceStub.SetTodoDoneE setTodoDoneE = new ISysNotifyTodoWebServiceServiceStub.SetTodoDoneE();
            setTodoDoneE.setSetTodoDone(setTodoDone);

            ISysNotifyTodoWebServiceServiceStub stub = getStub();
            ISysNotifyTodoWebServiceServiceStub.SetTodoDoneResponseE responseE = stub.setTodoDone(setTodoDoneE);
            ISysNotifyTodoWebServiceServiceStub.SetTodoDoneResponse response = responseE.getSetTodoDoneResponse();
            ISysNotifyTodoWebServiceServiceStub.NotifyTodoAppResult result = response.get_return();
            if (result.getReturnState() == 2) {
                LogUtils.logInfo(KKUtils.class, "todoDone", modelId + "：KK消息代办置为已办成功");
                return true;
            }
            LogUtils.logError(KKUtils.class, "todoDone", modelId + "：KK消息代办置为已办失败：返回信息：" + result.getMessage());
            return false;
        } catch (Exception e) {
            LogUtils.logError(KKUtils.class, "todoDone", modelId + "：KK消息代办置为已办失败", e);
            return false;
        }
    }

    /**
     * 删除待办
     */
    public static boolean deleteTodo(String modelId, Factory factory) {
        try {
            ISysNotifyTodoWebServiceServiceStub.NotifyTodoRemoveContext context = new ISysNotifyTodoWebServiceServiceStub.NotifyTodoRemoveContext();
            context.setAppName(getAppName(factory));
            context.setModelName(getAppName(factory));
            context.setModelId(modelId);
            context.setOptType(1);

            ISysNotifyTodoWebServiceServiceStub.DeleteTodo deleteTodo = new ISysNotifyTodoWebServiceServiceStub.DeleteTodo();
            deleteTodo.setArg0(context);
            ISysNotifyTodoWebServiceServiceStub.DeleteTodoE deleteTodoE = new ISysNotifyTodoWebServiceServiceStub.DeleteTodoE();
            deleteTodoE.setDeleteTodo(deleteTodo);

            ISysNotifyTodoWebServiceServiceStub stub = getStub();
            ISysNotifyTodoWebServiceServiceStub.DeleteTodoResponseE responseE = stub.deleteTodo(deleteTodoE);
            ISysNotifyTodoWebServiceServiceStub.DeleteTodoResponse response = responseE.getDeleteTodoResponse();
            ISysNotifyTodoWebServiceServiceStub.NotifyTodoAppResult result = response.get_return();
            if (result.getReturnState() == 2) {
                LogUtils.logInfo(KKUtils.class, "deleteTodo", modelId + "：KK消息代办删除成功");
                return true;
            }
            LogUtils.logError(KKUtils.class, "deleteTodo", modelId + "：KK消息代办删除失败：返回信息：" + result.getMessage());
            return false;
        } catch (Exception e) {
            LogUtils.logError(KKUtils.class, "deleteTodo", modelId + "：KK消息代办删除失败", e);
            return false;
        }
    }

    /**
     * 获取AppName 工厂+MES
     *
     * @param factory 工厂
     */
    private static String getAppName(Factory factory) {
        return factory.name() + "MES";
    }

    /**
     * 获取服务，设置用户名密码
     */
    private static ISysNotifyTodoWebServiceServiceStub getStub() throws AxisFault {
        OMFactory omFactory = OMAbstractFactory.getOMFactory();
        OMNamespace omNS = omFactory.createOMNamespace("http://webservice.notify.sys.kmss.landray.com/", "tns");

        OMElement head = omFactory.createOMElement("RequestSOAPHeader", omNS);

        OMElement userName = omFactory.createOMElement("user", omNS);
        userName.addChild(omFactory.createOMText(userName, USER));
        head.addChild(userName);

        OMElement password = omFactory.createOMElement("password", omNS);
        password.addChild(omFactory.createOMText(password, PASSWORD));
        head.addChild(password);

        ISysNotifyTodoWebServiceServiceStub stub = new ISysNotifyTodoWebServiceServiceStub();
        ServiceClient serviceClient = stub._getServiceClient();
        serviceClient.addHeader(head);

        return stub;
    }
}
