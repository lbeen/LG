/**
 * ExceptionException.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.mes.timer.message.kk.ws;

public class ExceptionException extends Exception {

    private static final long serialVersionUID = 1642746773527L;

    private ISysNotifyTodoWebServiceServiceStub.ExceptionE faultMessage;

    public ExceptionException() {
        super("ExceptionException");
    }

    public ExceptionException(String s) {
        super(s);
    }

    public ExceptionException(String s, Throwable ex) {
        super(s, ex);
    }

    public ExceptionException(Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(ISysNotifyTodoWebServiceServiceStub.ExceptionE msg) {
        faultMessage = msg;
    }

    public ISysNotifyTodoWebServiceServiceStub.ExceptionE getFaultMessage() {
        return faultMessage;
    }
}
    