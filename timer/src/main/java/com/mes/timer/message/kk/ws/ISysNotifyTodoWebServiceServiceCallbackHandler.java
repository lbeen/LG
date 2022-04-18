/**
 * ISysNotifyTodoWebServiceServiceCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.mes.timer.message.kk.ws;

/**
 *  ISysNotifyTodoWebServiceServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ISysNotifyTodoWebServiceServiceCallbackHandler {

    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ISysNotifyTodoWebServiceServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ISysNotifyTodoWebServiceServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getTodoCount method
     * override this method for handling normal response from getTodoCount operation
     */
    public void receiveResultgetTodoCount(ISysNotifyTodoWebServiceServiceStub.GetTodoCountResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTodoCount operation
     */
    public void receiveErrorgetTodoCount(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteTodo method
     * override this method for handling normal response from deleteTodo operation
     */
    public void receiveResultdeleteTodo(ISysNotifyTodoWebServiceServiceStub.DeleteTodoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteTodo operation
     */
    public void receiveErrordeleteTodo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setTodoDone method
     * override this method for handling normal response from setTodoDone operation
     */
    public void receiveResultsetTodoDone(ISysNotifyTodoWebServiceServiceStub.SetTodoDoneResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setTodoDone operation
     */
    public void receiveErrorsetTodoDone(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTodo method
     * override this method for handling normal response from getTodo operation
     */
    public void receiveResultgetTodo(ISysNotifyTodoWebServiceServiceStub.GetTodoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTodo operation
     */
    public void receiveErrorgetTodo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for sendTodo method
     * override this method for handling normal response from sendTodo operation
     */
    public void receiveResultsendTodo(ISysNotifyTodoWebServiceServiceStub.SendTodoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from sendTodo operation
     */
    public void receiveErrorsendTodo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateTodo method
     * override this method for handling normal response from updateTodo operation
     */
    public void receiveResultupdateTodo(ISysNotifyTodoWebServiceServiceStub.UpdateTodoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateTodo operation
     */
    public void receiveErrorupdateTodo(Exception e) {
    }

}
    