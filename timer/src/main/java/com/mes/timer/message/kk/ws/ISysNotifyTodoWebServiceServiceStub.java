/**
 * ISysNotifyTodoWebServiceServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.mes.timer.message.kk.ws;



/*
 *  ISysNotifyTodoWebServiceServiceStub java implementation
 */

public class ISysNotifyTodoWebServiceServiceStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return Long.toString(System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("ISysNotifyTodoWebServiceService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[6];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodoCount"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "deleteTodo"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "setTodoDone"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodo"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "sendTodo"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "updateTodo"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

    }

    //populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodoCount"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodoCount"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodoCount"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "deleteTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "deleteTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "deleteTodo"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "setTodoDone"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "setTodoDone"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "setTodoDone"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "getTodo"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "sendTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "sendTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "sendTodo"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "updateTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "updateTodo"), "com.mes.timer.message.kk.ws.ExceptionException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "Exception"),
                "updateTodo"), "com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub$ExceptionE");

    }

    /**
     * Constructor that takes in a configContext
     */

    public ISysNotifyTodoWebServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                               String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ISysNotifyTodoWebServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                               String targetEndpoint,
                                               boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    }

    /**
     * Default Constructor
     */
    public ISysNotifyTodoWebServiceServiceStub(
            org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://i.longi.com:8888/sys/webservice/sysNotifyTodoWebService");

    }

    /**
     * Default Constructor
     */
    public ISysNotifyTodoWebServiceServiceStub() throws org.apache.axis2.AxisFault {

        this("http://i.longi.com:8888/sys/webservice/sysNotifyTodoWebService");

    }

    /**
     * Constructor taking the target endpoint
     */
    public ISysNotifyTodoWebServiceServiceStub(String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     *
     * @param getTodoCount0
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#getTodoCount
     */

    public GetTodoCountResponseE getTodoCount(

            GetTodoCountE getTodoCount0)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[0].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/getTodoCount");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTodoCount0,
                    optimizeContent(new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/",
                            "getTodoCount")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodoCount"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetTodoCountResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (GetTodoCountResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTodoCount0
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startgetTodoCount
     */
    public void startgetTodoCount(

            GetTodoCountE getTodoCount0,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[0].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/getTodoCount");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTodoCount0, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodoCount")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodoCount"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetTodoCountResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetTodoCount((GetTodoCountResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetTodoCount(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodoCount"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrorgetTodoCount((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrorgetTodoCount(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodoCount(f);
                            }
                        } else {
                            callback.receiveErrorgetTodoCount(f);
                        }
                    } else {
                        callback.receiveErrorgetTodoCount(f);
                    }
                } else {
                    callback.receiveErrorgetTodoCount(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetTodoCount(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param deleteTodo2
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#deleteTodo
     */

    public DeleteTodoResponseE deleteTodo(

            DeleteTodoE deleteTodo2)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[1].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/deleteTodo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), deleteTodo2,
                    optimizeContent(new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/",
                            "deleteTodo")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "deleteTodo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), DeleteTodoResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (DeleteTodoResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteTodo2
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startdeleteTodo
     */
    public void startdeleteTodo(

            DeleteTodoE deleteTodo2,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[1].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/deleteTodo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), deleteTodo2, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "deleteTodo")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "deleteTodo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), DeleteTodoResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultdeleteTodo((DeleteTodoResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrordeleteTodo(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteTodo"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrordeleteTodo((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrordeleteTodo(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrordeleteTodo(f);
                            }
                        } else {
                            callback.receiveErrordeleteTodo(f);
                        }
                    } else {
                        callback.receiveErrordeleteTodo(f);
                    }
                } else {
                    callback.receiveErrordeleteTodo(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrordeleteTodo(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param setTodoDone4
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#setTodoDone
     */

    public SetTodoDoneResponseE setTodoDone(

            SetTodoDoneE setTodoDone4)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[2].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/setTodoDone");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), setTodoDone4,
                    optimizeContent(new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/",
                            "setTodoDone")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "setTodoDone"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), SetTodoDoneResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (SetTodoDoneResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTodoDone4
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startsetTodoDone
     */
    public void startsetTodoDone(

            SetTodoDoneE setTodoDone4,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[2].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/setTodoDone");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), setTodoDone4, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "setTodoDone")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "setTodoDone"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), SetTodoDoneResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsetTodoDone((SetTodoDoneResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsetTodoDone(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setTodoDone"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrorsetTodoDone((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrorsetTodoDone(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsetTodoDone(f);
                            }
                        } else {
                            callback.receiveErrorsetTodoDone(f);
                        }
                    } else {
                        callback.receiveErrorsetTodoDone(f);
                    }
                } else {
                    callback.receiveErrorsetTodoDone(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsetTodoDone(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param getTodo6
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#getTodo
     */

    public GetTodoResponseE getTodo(

            GetTodoE getTodo6)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[3].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/getTodo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTodo6, optimizeContent(
                            new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodo")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetTodoResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (GetTodoResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTodo6
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startgetTodo
     */
    public void startgetTodo(

            GetTodoE getTodo6,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[3].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/getTodo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTodo6, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodo")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "getTodo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetTodoResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetTodo((GetTodoResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetTodo(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTodo"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrorgetTodo((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrorgetTodo(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTodo(f);
                            }
                        } else {
                            callback.receiveErrorgetTodo(f);
                        }
                    } else {
                        callback.receiveErrorgetTodo(f);
                    }
                } else {
                    callback.receiveErrorgetTodo(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetTodo(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param sendTodo8
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#sendTodo
     */

    public SendTodoResponseE sendTodo(

            SendTodoE sendTodo8)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[4].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/sendTodo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendTodo8, optimizeContent(
                            new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "sendTodo")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "sendTodo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), SendTodoResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (SendTodoResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param sendTodo8
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startsendTodo
     */
    public void startsendTodo(

            SendTodoE sendTodo8,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[4].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/sendTodo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendTodo8, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "sendTodo")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "sendTodo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), SendTodoResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsendTodo((SendTodoResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsendTodo(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendTodo"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrorsendTodo((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrorsendTodo(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorsendTodo(f);
                            }
                        } else {
                            callback.receiveErrorsendTodo(f);
                        }
                    } else {
                        callback.receiveErrorsendTodo(f);
                    }
                } else {
                    callback.receiveErrorsendTodo(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsendTodo(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param updateTodo10
     * @throws ExceptionException :
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#updateTodo
     */

    public UpdateTodoResponseE updateTodo(

            UpdateTodoE updateTodo10)

            throws java.rmi.RemoteException

            , ExceptionException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                    _operations[5].getName());
            _operationClient.getOptions().setAction(
                    "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/updateTodo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateTodo10,
                    optimizeContent(new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/",
                            "updateTodo")),
                    new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "updateTodo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), UpdateTodoResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (UpdateTodoResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});

                        if (ex instanceof ExceptionException) {
                            throw (ExceptionException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateTodo10
     * @see com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceService#startupdateTodo
     */
    public void startupdateTodo(

            UpdateTodoE updateTodo10,

            final ISysNotifyTodoWebServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(
                _operations[5].getName());
        _operationClient.getOptions().setAction(
                "http://webservice.notify.sys.kmss.landray.com/ISysNotifyTodoWebService/updateTodo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateTodo10, optimizeContent(
                        new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "updateTodo")),
                new javax.xml.namespace.QName("http://webservice.notify.sys.kmss.landray.com/", "updateTodo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), UpdateTodoResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultupdateTodo((UpdateTodoResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorupdateTodo(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(
                                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateTodo"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});

                                if (ex instanceof ExceptionException) {
                                    callback.receiveErrorupdateTodo((ExceptionException) ex);
                                    return;
                                }

                                callback.receiveErrorupdateTodo(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateTodo(f);
                            }
                        } else {
                            callback.receiveErrorupdateTodo(f);
                        }
                    } else {
                        callback.receiveErrorupdateTodo(f);
                    }
                } else {
                    callback.receiveErrorupdateTodo(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(
                        faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorupdateTodo(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    //http://i.longi.com:8888/sys/webservice/sysNotifyTodoWebService
    public static class Exception implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Exception
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Message
         */

        protected String localMessage;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMessageTracker = false;

        public boolean isMessageSpecified() {
            return localMessageTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMessage() {
            return localMessage;
        }

        /**
         * Auto generated setter method
         *
         * @param param Message
         */
        public void setMessage(String param) {
            localMessageTracker = param != null;

            this.localMessage = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":Exception", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Exception", xmlWriter);
                }

            }
            if (localMessageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "message", xmlWriter);

                if (localMessage == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localMessage);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localMessageTracker) {
                elementList.add(new javax.xml.namespace.QName("", "message"));

                if (localMessage != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Exception parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Exception object = new Exception();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Exception".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Exception) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "message").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "message" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoRemoveContext implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoRemoveContext
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for AppName
         */

        protected String localAppName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAppNameTracker = false;

        public boolean isAppNameSpecified() {
            return localAppNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getAppName() {
            return localAppName;
        }

        /**
         * Auto generated setter method
         *
         * @param param AppName
         */
        public void setAppName(String param) {
            localAppNameTracker = param != null;

            this.localAppName = param;

        }

        /**
         * field for Key
         */

        protected String localKey;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localKeyTracker = false;

        public boolean isKeySpecified() {
            return localKeyTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getKey() {
            return localKey;
        }

        /**
         * Auto generated setter method
         *
         * @param param Key
         */
        public void setKey(String param) {
            localKeyTracker = param != null;

            this.localKey = param;

        }

        /**
         * field for ModelId
         */

        protected String localModelId;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelIdTracker = false;

        public boolean isModelIdSpecified() {
            return localModelIdTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelId() {
            return localModelId;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelId
         */
        public void setModelId(String param) {
            localModelIdTracker = param != null;

            this.localModelId = param;

        }

        /**
         * field for ModelName
         */

        protected String localModelName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelNameTracker = false;

        public boolean isModelNameSpecified() {
            return localModelNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelName() {
            return localModelName;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelName
         */
        public void setModelName(String param) {
            localModelNameTracker = param != null;

            this.localModelName = param;

        }

        /**
         * field for OptType
         */

        protected int localOptType;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getOptType() {
            return localOptType;
        }

        /**
         * Auto generated setter method
         *
         * @param param OptType
         */
        public void setOptType(int param) {

            this.localOptType = param;

        }

        /**
         * field for Others
         */

        protected String localOthers;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOthersTracker = false;

        public boolean isOthersSpecified() {
            return localOthersTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getOthers() {
            return localOthers;
        }

        /**
         * Auto generated setter method
         *
         * @param param Others
         */
        public void setOthers(String param) {
            localOthersTracker = param != null;

            this.localOthers = param;

        }

        /**
         * field for Param1
         */

        protected String localParam1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam1Tracker = false;

        public boolean isParam1Specified() {
            return localParam1Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam1() {
            return localParam1;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param1
         */
        public void setParam1(String param) {
            localParam1Tracker = param != null;

            this.localParam1 = param;

        }

        /**
         * field for Param2
         */

        protected String localParam2;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam2Tracker = false;

        public boolean isParam2Specified() {
            return localParam2Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam2() {
            return localParam2;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param2
         */
        public void setParam2(String param) {
            localParam2Tracker = param != null;

            this.localParam2 = param;

        }

        /**
         * field for Targets
         */

        protected String localTargets;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTargetsTracker = false;

        public boolean isTargetsSpecified() {
            return localTargetsTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTargets() {
            return localTargets;
        }

        /**
         * Auto generated setter method
         *
         * @param param Targets
         */
        public void setTargets(String param) {
            localTargetsTracker = param != null;

            this.localTargets = param;

        }

        /**
         * field for Type
         */

        protected int localType;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getType() {
            return localType;
        }

        /**
         * Auto generated setter method
         *
         * @param param Type
         */
        public void setType(int param) {

            this.localType = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoRemoveContext", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "notifyTodoRemoveContext", xmlWriter);
                }

            }
            if (localAppNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "appName", xmlWriter);

                if (localAppName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localAppName);

                }

                xmlWriter.writeEndElement();
            }
            if (localKeyTracker) {
                namespace = "";
                writeStartElement(null, namespace, "key", xmlWriter);

                if (localKey == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localKey);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelIdTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelId", xmlWriter);

                if (localModelId == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelId);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelName", xmlWriter);

                if (localModelName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelName);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "optType", xmlWriter);

            if (localOptType == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("optType cannot be null!!");

            } else {
                xmlWriter.writeCharacters(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptType));
            }

            xmlWriter.writeEndElement();
            if (localOthersTracker) {
                namespace = "";
                writeStartElement(null, namespace, "others", xmlWriter);

                if (localOthers == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localOthers);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param1", xmlWriter);

                if (localParam1 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam1);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam2Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param2", xmlWriter);

                if (localParam2 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam2);

                }

                xmlWriter.writeEndElement();
            }
            if (localTargetsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "targets", xmlWriter);

                if (localTargets == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localTargets);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "type", xmlWriter);

            if (localType == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localAppNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "appName"));

                if (localAppName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");
                }
            }
            if (localKeyTracker) {
                elementList.add(new javax.xml.namespace.QName("", "key"));

                if (localKey != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");
                }
            }
            if (localModelIdTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelId"));

                if (localModelId != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelId));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");
                }
            }
            if (localModelNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelName"));

                if (localModelName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "optType"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptType));
            if (localOthersTracker) {
                elementList.add(new javax.xml.namespace.QName("", "others"));

                if (localOthers != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOthers));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");
                }
            }
            if (localParam1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param1"));

                if (localParam1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");
                }
            }
            if (localParam2Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param2"));

                if (localParam2 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam2));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");
                }
            }
            if (localTargetsTracker) {
                elementList.add(new javax.xml.namespace.QName("", "targets"));

                if (localTargets != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargets));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "type"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoRemoveContext parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoRemoveContext object = new NotifyTodoRemoveContext();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoRemoveContext".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoRemoveContext) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "appName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "appName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setAppName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "key").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "key" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelId").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelId" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "optType").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "optType" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setOptType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "others").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "others" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setOthers(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param1").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param1" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param2").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param2" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "targets").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "targets" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setTargets(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "type").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "type" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoGetContext implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoGetContext
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for OtherCond
         */

        protected String localOtherCond;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOtherCondTracker = false;

        public boolean isOtherCondSpecified() {
            return localOtherCondTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getOtherCond() {
            return localOtherCond;
        }

        /**
         * Auto generated setter method
         *
         * @param param OtherCond
         */
        public void setOtherCond(String param) {
            localOtherCondTracker = param != null;

            this.localOtherCond = param;

        }

        /**
         * field for PageNo
         */

        protected int localPageNo;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getPageNo() {
            return localPageNo;
        }

        /**
         * Auto generated setter method
         *
         * @param param PageNo
         */
        public void setPageNo(int param) {

            this.localPageNo = param;

        }

        /**
         * field for RowSize
         */

        protected int localRowSize;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getRowSize() {
            return localRowSize;
        }

        /**
         * Auto generated setter method
         *
         * @param param RowSize
         */
        public void setRowSize(int param) {

            this.localRowSize = param;

        }

        /**
         * field for Targets
         */

        protected String localTargets;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTargetsTracker = false;

        public boolean isTargetsSpecified() {
            return localTargetsTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTargets() {
            return localTargets;
        }

        /**
         * Auto generated setter method
         *
         * @param param Targets
         */
        public void setTargets(String param) {
            localTargetsTracker = param != null;

            this.localTargets = param;

        }

        /**
         * field for Type
         */

        protected int localType;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getType() {
            return localType;
        }

        /**
         * Auto generated setter method
         *
         * @param param Type
         */
        public void setType(int param) {

            this.localType = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoGetContext", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "notifyTodoGetContext",
                            xmlWriter);
                }

            }
            if (localOtherCondTracker) {
                namespace = "";
                writeStartElement(null, namespace, "otherCond", xmlWriter);

                if (localOtherCond == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("otherCond cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localOtherCond);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "pageNo", xmlWriter);

            if (localPageNo == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("pageNo cannot be null!!");

            } else {
                xmlWriter.writeCharacters(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNo));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "rowSize", xmlWriter);

            if (localRowSize == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("rowSize cannot be null!!");

            } else {
                xmlWriter.writeCharacters(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRowSize));
            }

            xmlWriter.writeEndElement();
            if (localTargetsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "targets", xmlWriter);

                if (localTargets == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localTargets);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "type", xmlWriter);

            if (localType == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localOtherCondTracker) {
                elementList.add(new javax.xml.namespace.QName("", "otherCond"));

                if (localOtherCond != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherCond));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("otherCond cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "pageNo"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNo));

            elementList.add(new javax.xml.namespace.QName("", "rowSize"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRowSize));
            if (localTargetsTracker) {
                elementList.add(new javax.xml.namespace.QName("", "targets"));

                if (localTargets != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargets));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "type"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoGetContext parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoGetContext object = new NotifyTodoGetContext();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoGetContext".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoGetContext) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "otherCond").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "otherCond" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setOtherCond(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "pageNo").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "pageNo" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setPageNo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "rowSize").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "rowSize" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setRowSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "targets").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "targets" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setTargets(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "type").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "type" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SendTodoResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "sendTodoResponse", "ns1");

        /**
         * field for SendTodoResponse
         */

        protected SendTodoResponse localSendTodoResponse;

        /**
         * Auto generated getter method
         *
         * @return SendTodoResponse
         */
        public SendTodoResponse getSendTodoResponse() {
            return localSendTodoResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param SendTodoResponse
         */
        public void setSendTodoResponse(SendTodoResponse param) {

            this.localSendTodoResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localSendTodoResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("sendTodoResponse cannot be null!");
            }
            localSendTodoResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localSendTodoResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SendTodoResponseE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SendTodoResponseE object = new SendTodoResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "sendTodoResponse").equals(
                                    reader.getName())) {

                                object.setSendTodoResponse(SendTodoResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SetTodoDoneResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "setTodoDoneResponse", "ns1");

        /**
         * field for SetTodoDoneResponse
         */

        protected SetTodoDoneResponse localSetTodoDoneResponse;

        /**
         * Auto generated getter method
         *
         * @return SetTodoDoneResponse
         */
        public SetTodoDoneResponse getSetTodoDoneResponse() {
            return localSetTodoDoneResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetTodoDoneResponse
         */
        public void setSetTodoDoneResponse(SetTodoDoneResponse param) {

            this.localSetTodoDoneResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localSetTodoDoneResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("setTodoDoneResponse cannot be null!");
            }
            localSetTodoDoneResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localSetTodoDoneResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SetTodoDoneResponseE parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SetTodoDoneResponseE object = new SetTodoDoneResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "setTodoDoneResponse").equals(
                                    reader.getName())) {

                                object.setSetTodoDoneResponse(SetTodoDoneResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = getTodoResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":getTodoResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTodoResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoResponse object = new GetTodoResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"getTodoResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetTodoResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "getTodo", "ns1");

        /**
         * field for GetTodo
         */

        protected GetTodo localGetTodo;

        /**
         * Auto generated getter method
         *
         * @return GetTodo
         */
        public GetTodo getGetTodo() {
            return localGetTodo;
        }

        /**
         * Auto generated setter method
         *
         * @param param GetTodo
         */
        public void setGetTodo(GetTodo param) {

            this.localGetTodo = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localGetTodo == null) {
                throw new org.apache.axis2.databinding.ADBException("getTodo cannot be null!");
            }
            localGetTodo.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localGetTodo.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoE object = new GetTodoE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "getTodo").equals(
                                    reader.getName())) {

                                object.setGetTodo(GetTodo.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = getTodo
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoGetContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoGetContext
         */
        public NotifyTodoGetContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoGetContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":getTodo", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTodo", xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodo object = new GetTodo();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"getTodo".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetTodo) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoGetContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class DeleteTodoResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = deleteTodoResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":deleteTodoResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "deleteTodoResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteTodoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                DeleteTodoResponse object = new DeleteTodoResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"deleteTodoResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DeleteTodoResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class UpdateTodo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = updateTodo
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoUpdateContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoUpdateContext
         */
        public NotifyTodoUpdateContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoUpdateContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":updateTodo", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "updateTodo", xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateTodo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                UpdateTodo object = new UpdateTodo();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"updateTodo".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdateTodo) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoUpdateContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoCountResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = getTodoCountResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":getTodoCountResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTodoCountResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoCountResponse parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoCountResponse object = new GetTodoCountResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"getTodoCountResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetTodoCountResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "getTodoResponse", "ns1");

        /**
         * field for GetTodoResponse
         */

        protected GetTodoResponse localGetTodoResponse;

        /**
         * Auto generated getter method
         *
         * @return GetTodoResponse
         */
        public GetTodoResponse getGetTodoResponse() {
            return localGetTodoResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param GetTodoResponse
         */
        public void setGetTodoResponse(GetTodoResponse param) {

            this.localGetTodoResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localGetTodoResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getTodoResponse cannot be null!");
            }
            localGetTodoResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localGetTodoResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoResponseE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoResponseE object = new GetTodoResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "getTodoResponse").equals(
                                    reader.getName())) {

                                object.setGetTodoResponse(GetTodoResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoGetCountContext implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoGetCountContext
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Target
         */

        protected String localTarget;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTargetTracker = false;

        public boolean isTargetSpecified() {
            return localTargetTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTarget() {
            return localTarget;
        }

        /**
         * Auto generated setter method
         *
         * @param param Target
         */
        public void setTarget(String param) {
            localTargetTracker = param != null;

            this.localTarget = param;

        }

        /**
         * field for Types
         */

        protected String localTypes;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTypesTracker = false;

        public boolean isTypesSpecified() {
            return localTypesTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTypes() {
            return localTypes;
        }

        /**
         * Auto generated setter method
         *
         * @param param Types
         */
        public void setTypes(String param) {
            localTypesTracker = param != null;

            this.localTypes = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoGetCountContext", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "notifyTodoGetCountContext", xmlWriter);
                }

            }
            if (localTargetTracker) {
                namespace = "";
                writeStartElement(null, namespace, "target", xmlWriter);

                if (localTarget == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("target cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localTarget);

                }

                xmlWriter.writeEndElement();
            }
            if (localTypesTracker) {
                namespace = "";
                writeStartElement(null, namespace, "types", xmlWriter);

                if (localTypes == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("types cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localTypes);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localTargetTracker) {
                elementList.add(new javax.xml.namespace.QName("", "target"));

                if (localTarget != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTarget));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("target cannot be null!!");
                }
            }
            if (localTypesTracker) {
                elementList.add(new javax.xml.namespace.QName("", "types"));

                if (localTypes != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTypes));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("types cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoGetCountContext parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoGetCountContext object = new NotifyTodoGetCountContext();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoGetCountContext".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoGetCountContext) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "target").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "target" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setTarget(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "types").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "types" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setTypes(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SendTodo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = sendTodo
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoSendContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoSendContext
         */
        public NotifyTodoSendContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoSendContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":sendTodo", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "sendTodo", xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SendTodo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SendTodo object = new SendTodo();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"sendTodo".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SendTodo) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoSendContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoAppResult implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoAppResult
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Message
         */

        protected String localMessage;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMessageTracker = false;

        public boolean isMessageSpecified() {
            return localMessageTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMessage() {
            return localMessage;
        }

        /**
         * Auto generated setter method
         *
         * @param param Message
         */
        public void setMessage(String param) {
            localMessageTracker = param != null;

            this.localMessage = param;

        }

        /**
         * field for ReturnState
         */

        protected int localReturnState;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getReturnState() {
            return localReturnState;
        }

        /**
         * Auto generated setter method
         *
         * @param param ReturnState
         */
        public void setReturnState(int param) {

            this.localReturnState = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoAppResult", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "notifyTodoAppResult",
                            xmlWriter);
                }

            }
            if (localMessageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "message", xmlWriter);

                if (localMessage == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localMessage);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "returnState", xmlWriter);

            if (localReturnState == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("returnState cannot be null!!");

            } else {
                xmlWriter.writeCharacters(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnState));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localMessageTracker) {
                elementList.add(new javax.xml.namespace.QName("", "message"));

                if (localMessage != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "returnState"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnState));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoAppResult parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoAppResult object = new NotifyTodoAppResult();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoAppResult".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoAppResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "message").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "message" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "returnState").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "returnState" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setReturnState(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SetTodoDone implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = setTodoDone
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoRemoveContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoRemoveContext
         */
        public NotifyTodoRemoveContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoRemoveContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":setTodoDone", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "setTodoDone",
                            xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SetTodoDone parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SetTodoDone object = new SetTodoDone();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"setTodoDone".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SetTodoDone) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoRemoveContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoUpdateContext implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoUpdateContext
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for AppName
         */

        protected String localAppName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAppNameTracker = false;

        public boolean isAppNameSpecified() {
            return localAppNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getAppName() {
            return localAppName;
        }

        /**
         * Auto generated setter method
         *
         * @param param AppName
         */
        public void setAppName(String param) {
            localAppNameTracker = param != null;

            this.localAppName = param;

        }

        /**
         * field for CreateTime
         */

        protected String localCreateTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCreateTimeTracker = false;

        public boolean isCreateTimeSpecified() {
            return localCreateTimeTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getCreateTime() {
            return localCreateTime;
        }

        /**
         * Auto generated setter method
         *
         * @param param CreateTime
         */
        public void setCreateTime(String param) {
            localCreateTimeTracker = param != null;

            this.localCreateTime = param;

        }

        /**
         * field for DocCreator
         */

        protected String localDocCreator;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDocCreatorTracker = false;

        public boolean isDocCreatorSpecified() {
            return localDocCreatorTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getDocCreator() {
            return localDocCreator;
        }

        /**
         * Auto generated setter method
         *
         * @param param DocCreator
         */
        public void setDocCreator(String param) {
            localDocCreatorTracker = param != null;

            this.localDocCreator = param;

        }

        /**
         * field for ExtendContent
         */

        protected String localExtendContent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExtendContentTracker = false;

        public boolean isExtendContentSpecified() {
            return localExtendContentTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getExtendContent() {
            return localExtendContent;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtendContent
         */
        public void setExtendContent(String param) {
            localExtendContentTracker = param != null;

            this.localExtendContent = param;

        }

        /**
         * field for Key
         */

        protected String localKey;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localKeyTracker = false;

        public boolean isKeySpecified() {
            return localKeyTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getKey() {
            return localKey;
        }

        /**
         * Auto generated setter method
         *
         * @param param Key
         */
        public void setKey(String param) {
            localKeyTracker = param != null;

            this.localKey = param;

        }

        /**
         * field for Level
         */

        protected int localLevel;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localLevelTracker = false;

        public boolean isLevelSpecified() {
            return localLevelTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getLevel() {
            return localLevel;
        }

        /**
         * Auto generated setter method
         *
         * @param param Level
         */
        public void setLevel(int param) {

            // setting primitive attribute tracker to true
            localLevelTracker = param != Integer.MIN_VALUE;

            this.localLevel = param;

        }

        /**
         * field for Link
         */

        protected String localLink;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localLinkTracker = false;

        public boolean isLinkSpecified() {
            return localLinkTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getLink() {
            return localLink;
        }

        /**
         * Auto generated setter method
         *
         * @param param Link
         */
        public void setLink(String param) {
            localLinkTracker = param != null;

            this.localLink = param;

        }

        /**
         * field for ModelId
         */

        protected String localModelId;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelIdTracker = false;

        public boolean isModelIdSpecified() {
            return localModelIdTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelId() {
            return localModelId;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelId
         */
        public void setModelId(String param) {
            localModelIdTracker = param != null;

            this.localModelId = param;

        }

        /**
         * field for ModelName
         */

        protected String localModelName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelNameTracker = false;

        public boolean isModelNameSpecified() {
            return localModelNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelName() {
            return localModelName;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelName
         */
        public void setModelName(String param) {
            localModelNameTracker = param != null;

            this.localModelName = param;

        }

        /**
         * field for Others
         */

        protected String localOthers;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOthersTracker = false;

        public boolean isOthersSpecified() {
            return localOthersTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getOthers() {
            return localOthers;
        }

        /**
         * Auto generated setter method
         *
         * @param param Others
         */
        public void setOthers(String param) {
            localOthersTracker = param != null;

            this.localOthers = param;

        }

        /**
         * field for Param1
         */

        protected String localParam1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam1Tracker = false;

        public boolean isParam1Specified() {
            return localParam1Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam1() {
            return localParam1;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param1
         */
        public void setParam1(String param) {
            localParam1Tracker = param != null;

            this.localParam1 = param;

        }

        /**
         * field for Param2
         */

        protected String localParam2;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam2Tracker = false;

        public boolean isParam2Specified() {
            return localParam2Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam2() {
            return localParam2;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param2
         */
        public void setParam2(String param) {
            localParam2Tracker = param != null;

            this.localParam2 = param;

        }

        /**
         * field for Subject
         */

        protected String localSubject;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSubjectTracker = false;

        public boolean isSubjectSpecified() {
            return localSubjectTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getSubject() {
            return localSubject;
        }

        /**
         * Auto generated setter method
         *
         * @param param Subject
         */
        public void setSubject(String param) {
            localSubjectTracker = param != null;

            this.localSubject = param;

        }

        /**
         * field for Type
         */

        protected int localType;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getType() {
            return localType;
        }

        /**
         * Auto generated setter method
         *
         * @param param Type
         */
        public void setType(int param) {

            this.localType = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoUpdateContext", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "notifyTodoUpdateContext", xmlWriter);
                }

            }
            if (localAppNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "appName", xmlWriter);

                if (localAppName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localAppName);

                }

                xmlWriter.writeEndElement();
            }
            if (localCreateTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "createTime", xmlWriter);

                if (localCreateTime == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("createTime cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localCreateTime);

                }

                xmlWriter.writeEndElement();
            }
            if (localDocCreatorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "docCreator", xmlWriter);

                if (localDocCreator == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("docCreator cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localDocCreator);

                }

                xmlWriter.writeEndElement();
            }
            if (localExtendContentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "extendContent", xmlWriter);

                if (localExtendContent == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("extendContent cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localExtendContent);

                }

                xmlWriter.writeEndElement();
            }
            if (localKeyTracker) {
                namespace = "";
                writeStartElement(null, namespace, "key", xmlWriter);

                if (localKey == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localKey);

                }

                xmlWriter.writeEndElement();
            }
            if (localLevelTracker) {
                namespace = "";
                writeStartElement(null, namespace, "level", xmlWriter);

                if (localLevel == Integer.MIN_VALUE) {

                    throw new org.apache.axis2.databinding.ADBException("level cannot be null!!");

                } else {
                    xmlWriter.writeCharacters(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
                }

                xmlWriter.writeEndElement();
            }
            if (localLinkTracker) {
                namespace = "";
                writeStartElement(null, namespace, "link", xmlWriter);

                if (localLink == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("link cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLink);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelIdTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelId", xmlWriter);

                if (localModelId == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelId);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelName", xmlWriter);

                if (localModelName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelName);

                }

                xmlWriter.writeEndElement();
            }
            if (localOthersTracker) {
                namespace = "";
                writeStartElement(null, namespace, "others", xmlWriter);

                if (localOthers == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localOthers);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param1", xmlWriter);

                if (localParam1 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam1);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam2Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param2", xmlWriter);

                if (localParam2 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam2);

                }

                xmlWriter.writeEndElement();
            }
            if (localSubjectTracker) {
                namespace = "";
                writeStartElement(null, namespace, "subject", xmlWriter);

                if (localSubject == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("subject cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localSubject);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "";
            writeStartElement(null, namespace, "type", xmlWriter);

            if (localType == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localAppNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "appName"));

                if (localAppName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");
                }
            }
            if (localCreateTimeTracker) {
                elementList.add(new javax.xml.namespace.QName("", "createTime"));

                if (localCreateTime != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateTime));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("createTime cannot be null!!");
                }
            }
            if (localDocCreatorTracker) {
                elementList.add(new javax.xml.namespace.QName("", "docCreator"));

                if (localDocCreator != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocCreator));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("docCreator cannot be null!!");
                }
            }
            if (localExtendContentTracker) {
                elementList.add(new javax.xml.namespace.QName("", "extendContent"));

                if (localExtendContent != null) {
                    elementList.add(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtendContent));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("extendContent cannot be null!!");
                }
            }
            if (localKeyTracker) {
                elementList.add(new javax.xml.namespace.QName("", "key"));

                if (localKey != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");
                }
            }
            if (localLevelTracker) {
                elementList.add(new javax.xml.namespace.QName("", "level"));

                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
            }
            if (localLinkTracker) {
                elementList.add(new javax.xml.namespace.QName("", "link"));

                if (localLink != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLink));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("link cannot be null!!");
                }
            }
            if (localModelIdTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelId"));

                if (localModelId != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelId));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");
                }
            }
            if (localModelNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelName"));

                if (localModelName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");
                }
            }
            if (localOthersTracker) {
                elementList.add(new javax.xml.namespace.QName("", "others"));

                if (localOthers != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOthers));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");
                }
            }
            if (localParam1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param1"));

                if (localParam1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");
                }
            }
            if (localParam2Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param2"));

                if (localParam2 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam2));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");
                }
            }
            if (localSubjectTracker) {
                elementList.add(new javax.xml.namespace.QName("", "subject"));

                if (localSubject != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("subject cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("", "type"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoUpdateContext parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoUpdateContext object = new NotifyTodoUpdateContext();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoUpdateContext".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoUpdateContext) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "appName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "appName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setAppName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "createTime").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "createTime" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setCreateTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "docCreator").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "docCreator" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setDocCreator(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "extendContent").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "extendContent" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setExtendContent(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "key").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "key" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "level").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "level" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setLevel(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                        object.setLevel(Integer.MIN_VALUE);

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "link").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "link" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setLink(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelId").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelId" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "others").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "others" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setOthers(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param1").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param1" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param2").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param2" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "subject").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "subject" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setSubject(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "type").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "type" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class DeleteTodoResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "deleteTodoResponse", "ns1");

        /**
         * field for DeleteTodoResponse
         */

        protected DeleteTodoResponse localDeleteTodoResponse;

        /**
         * Auto generated getter method
         *
         * @return DeleteTodoResponse
         */
        public DeleteTodoResponse getDeleteTodoResponse() {
            return localDeleteTodoResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteTodoResponse
         */
        public void setDeleteTodoResponse(DeleteTodoResponse param) {

            this.localDeleteTodoResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localDeleteTodoResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTodoResponse cannot be null!");
            }
            localDeleteTodoResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localDeleteTodoResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteTodoResponseE parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                DeleteTodoResponseE object = new DeleteTodoResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "deleteTodoResponse").equals(
                                    reader.getName())) {

                                object.setDeleteTodoResponse(DeleteTodoResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class DeleteTodo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = deleteTodo
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoRemoveContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoRemoveContext
         */
        public NotifyTodoRemoveContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoRemoveContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":deleteTodo", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "deleteTodo", xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteTodo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                DeleteTodo object = new DeleteTodo();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"deleteTodo".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DeleteTodo) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoRemoveContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class ExceptionE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "Exception", "ns1");

        /**
         * field for Exception
         */

        protected Exception localException;

        /**
         * Auto generated getter method
         *
         * @return Exception
         */
        public Exception getException() {
            return localException;
        }

        /**
         * Auto generated setter method
         *
         * @param param Exception
         */
        public void setException(Exception param) {

            this.localException = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localException == null) {
                throw new org.apache.axis2.databinding.ADBException("Exception cannot be null!");
            }
            localException.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localException.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ExceptionE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ExceptionE object = new ExceptionE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "Exception").equals(
                                    reader.getName())) {

                                object.setException(Exception.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class ExtensionMapper {

        public static Object getTypeObject(String namespaceURI, String typeName,
                                           javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "Exception".equals(typeName)) {

                return Exception.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(
                    namespaceURI) && "notifyTodoUpdateContext".equals(typeName)) {

                return NotifyTodoUpdateContext.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "notifyTodoAppResult".equals(
                    typeName)) {

                return NotifyTodoAppResult.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "notifyTodoSendContext".equals(
                    typeName)) {

                return NotifyTodoSendContext.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(
                    namespaceURI) && "notifyTodoGetCountContext".equals(typeName)) {

                return NotifyTodoGetCountContext.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "deleteTodoResponse".equals(
                    typeName)) {

                return DeleteTodoResponse.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "getTodoCount".equals(
                    typeName)) {

                return GetTodoCount.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "deleteTodo".equals(
                    typeName)) {

                return DeleteTodo.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "updateTodoResponse".equals(
                    typeName)) {

                return UpdateTodoResponse.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(
                    namespaceURI) && "notifyTodoRemoveContext".equals(typeName)) {

                return NotifyTodoRemoveContext.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "setTodoDone".equals(
                    typeName)) {

                return SetTodoDone.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "sendTodoResponse".equals(
                    typeName)) {

                return SendTodoResponse.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "getTodo".equals(typeName)) {

                return GetTodo.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "notifyTodoGetContext".equals(
                    typeName)) {

                return NotifyTodoGetContext.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "setTodoDoneResponse".equals(
                    typeName)) {

                return SetTodoDoneResponse.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "sendTodo".equals(typeName)) {

                return SendTodo.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "getTodoResponse".equals(
                    typeName)) {

                return GetTodoResponse.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "updateTodo".equals(
                    typeName)) {

                return UpdateTodo.Factory.parse(reader);

            }

            if ("http://webservice.notify.sys.kmss.landray.com/".equals(namespaceURI) && "getTodoCountResponse".equals(
                    typeName)) {

                return GetTodoCountResponse.Factory.parse(reader);

            }

            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    public static class UpdateTodoE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "updateTodo", "ns1");

        /**
         * field for UpdateTodo
         */

        protected UpdateTodo localUpdateTodo;

        /**
         * Auto generated getter method
         *
         * @return UpdateTodo
         */
        public UpdateTodo getUpdateTodo() {
            return localUpdateTodo;
        }

        /**
         * Auto generated setter method
         *
         * @param param UpdateTodo
         */
        public void setUpdateTodo(UpdateTodo param) {

            this.localUpdateTodo = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localUpdateTodo == null) {
                throw new org.apache.axis2.databinding.ADBException("updateTodo cannot be null!");
            }
            localUpdateTodo.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localUpdateTodo.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateTodoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                UpdateTodoE object = new UpdateTodoE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "updateTodo").equals(
                                    reader.getName())) {

                                object.setUpdateTodo(UpdateTodo.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoCount implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = getTodoCount
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for Arg0
         */

        protected NotifyTodoGetCountContext localArg0;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localArg0Tracker = false;

        public boolean isArg0Specified() {
            return localArg0Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoGetCountContext
         */
        public NotifyTodoGetCountContext getArg0() {
            return localArg0;
        }

        /**
         * Auto generated setter method
         *
         * @param param Arg0
         */
        public void setArg0(NotifyTodoGetCountContext param) {
            localArg0Tracker = param != null;

            this.localArg0 = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":getTodoCount", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTodoCount",
                            xmlWriter);
                }

            }
            if (localArg0Tracker) {
                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localArg0Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "arg0"));

                if (localArg0 == null) {
                    throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
                }
                elementList.add(localArg0);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoCount parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoCount object = new GetTodoCount();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"getTodoCount".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetTodoCount) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

                        object.setArg0(NotifyTodoGetCountContext.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SetTodoDoneE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "setTodoDone", "ns1");

        /**
         * field for SetTodoDone
         */

        protected SetTodoDone localSetTodoDone;

        /**
         * Auto generated getter method
         *
         * @return SetTodoDone
         */
        public SetTodoDone getSetTodoDone() {
            return localSetTodoDone;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetTodoDone
         */
        public void setSetTodoDone(SetTodoDone param) {

            this.localSetTodoDone = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localSetTodoDone == null) {
                throw new org.apache.axis2.databinding.ADBException("setTodoDone cannot be null!");
            }
            localSetTodoDone.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localSetTodoDone.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SetTodoDoneE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SetTodoDoneE object = new SetTodoDoneE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "setTodoDone").equals(
                                    reader.getName())) {

                                object.setSetTodoDone(SetTodoDone.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class NotifyTodoSendContext implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = notifyTodoSendContext
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for AppName
         */

        protected String localAppName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAppNameTracker = false;

        public boolean isAppNameSpecified() {
            return localAppNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getAppName() {
            return localAppName;
        }

        /**
         * Auto generated setter method
         *
         * @param param AppName
         */
        public void setAppName(String param) {
            localAppNameTracker = param != null;

            this.localAppName = param;

        }

        /**
         * field for CreateTime
         */

        protected String localCreateTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCreateTimeTracker = false;

        public boolean isCreateTimeSpecified() {
            return localCreateTimeTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getCreateTime() {
            return localCreateTime;
        }

        /**
         * Auto generated setter method
         *
         * @param param CreateTime
         */
        public void setCreateTime(String param) {
            localCreateTimeTracker = param != null;

            this.localCreateTime = param;

        }

        /**
         * field for DocCreator
         */

        protected String localDocCreator;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDocCreatorTracker = false;

        public boolean isDocCreatorSpecified() {
            return localDocCreatorTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getDocCreator() {
            return localDocCreator;
        }

        /**
         * Auto generated setter method
         *
         * @param param DocCreator
         */
        public void setDocCreator(String param) {
            localDocCreatorTracker = param != null;

            this.localDocCreator = param;

        }

        /**
         * field for ExtendContent
         */

        protected String localExtendContent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExtendContentTracker = false;

        public boolean isExtendContentSpecified() {
            return localExtendContentTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getExtendContent() {
            return localExtendContent;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtendContent
         */
        public void setExtendContent(String param) {
            localExtendContentTracker = param != null;

            this.localExtendContent = param;

        }

        /**
         * field for Key
         */

        protected String localKey;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localKeyTracker = false;

        public boolean isKeySpecified() {
            return localKeyTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getKey() {
            return localKey;
        }

        /**
         * Auto generated setter method
         *
         * @param param Key
         */
        public void setKey(String param) {
            localKeyTracker = param != null;

            this.localKey = param;

        }

        /**
         * field for Language
         */

        protected String localLanguage;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localLanguageTracker = false;

        public boolean isLanguageSpecified() {
            return localLanguageTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getLanguage() {
            return localLanguage;
        }

        /**
         * Auto generated setter method
         *
         * @param param Language
         */
        public void setLanguage(String param) {
            localLanguageTracker = param != null;

            this.localLanguage = param;

        }

        /**
         * field for Level
         */

        protected int localLevel;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localLevelTracker = false;

        public boolean isLevelSpecified() {
            return localLevelTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getLevel() {
            return localLevel;
        }

        /**
         * Auto generated setter method
         *
         * @param param Level
         */
        public void setLevel(int param) {

            // setting primitive attribute tracker to true
            localLevelTracker = param != Integer.MIN_VALUE;

            this.localLevel = param;

        }

        /**
         * field for Link
         */

        protected String localLink;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localLinkTracker = false;

        public boolean isLinkSpecified() {
            return localLinkTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getLink() {
            return localLink;
        }

        /**
         * Auto generated setter method
         *
         * @param param Link
         */
        public void setLink(String param) {
            localLinkTracker = param != null;

            this.localLink = param;

        }

        /**
         * field for ModelId
         */

        protected String localModelId;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelIdTracker = false;

        public boolean isModelIdSpecified() {
            return localModelIdTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelId() {
            return localModelId;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelId
         */
        public void setModelId(String param) {
            localModelIdTracker = param != null;

            this.localModelId = param;

        }

        /**
         * field for ModelName
         */

        protected String localModelName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localModelNameTracker = false;

        public boolean isModelNameSpecified() {
            return localModelNameTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getModelName() {
            return localModelName;
        }

        /**
         * Auto generated setter method
         *
         * @param param ModelName
         */
        public void setModelName(String param) {
            localModelNameTracker = param != null;

            this.localModelName = param;

        }

        /**
         * field for Others
         */

        protected String localOthers;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOthersTracker = false;

        public boolean isOthersSpecified() {
            return localOthersTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getOthers() {
            return localOthers;
        }

        /**
         * Auto generated setter method
         *
         * @param param Others
         */
        public void setOthers(String param) {
            localOthersTracker = param != null;

            this.localOthers = param;

        }

        /**
         * field for Param1
         */

        protected String localParam1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam1Tracker = false;

        public boolean isParam1Specified() {
            return localParam1Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam1() {
            return localParam1;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param1
         */
        public void setParam1(String param) {
            localParam1Tracker = param != null;

            this.localParam1 = param;

        }

        /**
         * field for Param2
         */

        protected String localParam2;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParam2Tracker = false;

        public boolean isParam2Specified() {
            return localParam2Tracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getParam2() {
            return localParam2;
        }

        /**
         * Auto generated setter method
         *
         * @param param Param2
         */
        public void setParam2(String param) {
            localParam2Tracker = param != null;

            this.localParam2 = param;

        }

        /**
         * field for Subject
         */

        protected String localSubject;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSubjectTracker = false;

        public boolean isSubjectSpecified() {
            return localSubjectTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getSubject() {
            return localSubject;
        }

        /**
         * Auto generated setter method
         *
         * @param param Subject
         */
        public void setSubject(String param) {
            localSubjectTracker = param != null;

            this.localSubject = param;

        }

        /**
         * field for Targets
         */

        protected String localTargets;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTargetsTracker = false;

        public boolean isTargetsSpecified() {
            return localTargetsTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTargets() {
            return localTargets;
        }

        /**
         * Auto generated setter method
         *
         * @param param Targets
         */
        public void setTargets(String param) {
            localTargetsTracker = param != null;

            this.localTargets = param;

        }

        /**
         * field for Type
         */

        protected int localType;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTypeTracker = false;

        public boolean isTypeSpecified() {
            return localTypeTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getType() {
            return localType;
        }

        /**
         * Auto generated setter method
         *
         * @param param Type
         */
        public void setType(int param) {

            // setting primitive attribute tracker to true
            localTypeTracker = param != Integer.MIN_VALUE;

            this.localType = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":notifyTodoSendContext", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "notifyTodoSendContext",
                            xmlWriter);
                }

            }
            if (localAppNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "appName", xmlWriter);

                if (localAppName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localAppName);

                }

                xmlWriter.writeEndElement();
            }
            if (localCreateTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "createTime", xmlWriter);

                if (localCreateTime == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("createTime cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localCreateTime);

                }

                xmlWriter.writeEndElement();
            }
            if (localDocCreatorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "docCreator", xmlWriter);

                if (localDocCreator == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("docCreator cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localDocCreator);

                }

                xmlWriter.writeEndElement();
            }
            if (localExtendContentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "extendContent", xmlWriter);

                if (localExtendContent == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("extendContent cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localExtendContent);

                }

                xmlWriter.writeEndElement();
            }
            if (localKeyTracker) {
                namespace = "";
                writeStartElement(null, namespace, "key", xmlWriter);

                if (localKey == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localKey);

                }

                xmlWriter.writeEndElement();
            }
            if (localLanguageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "language", xmlWriter);

                if (localLanguage == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("language cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLanguage);

                }

                xmlWriter.writeEndElement();
            }
            if (localLevelTracker) {
                namespace = "";
                writeStartElement(null, namespace, "level", xmlWriter);

                if (localLevel == Integer.MIN_VALUE) {

                    throw new org.apache.axis2.databinding.ADBException("level cannot be null!!");

                } else {
                    xmlWriter.writeCharacters(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
                }

                xmlWriter.writeEndElement();
            }
            if (localLinkTracker) {
                namespace = "";
                writeStartElement(null, namespace, "link", xmlWriter);

                if (localLink == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("link cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLink);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelIdTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelId", xmlWriter);

                if (localModelId == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelId);

                }

                xmlWriter.writeEndElement();
            }
            if (localModelNameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "modelName", xmlWriter);

                if (localModelName == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localModelName);

                }

                xmlWriter.writeEndElement();
            }
            if (localOthersTracker) {
                namespace = "";
                writeStartElement(null, namespace, "others", xmlWriter);

                if (localOthers == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localOthers);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param1", xmlWriter);

                if (localParam1 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam1);

                }

                xmlWriter.writeEndElement();
            }
            if (localParam2Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "param2", xmlWriter);

                if (localParam2 == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localParam2);

                }

                xmlWriter.writeEndElement();
            }
            if (localSubjectTracker) {
                namespace = "";
                writeStartElement(null, namespace, "subject", xmlWriter);

                if (localSubject == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("subject cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localSubject);

                }

                xmlWriter.writeEndElement();
            }
            if (localTargetsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "targets", xmlWriter);

                if (localTargets == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localTargets);

                }

                xmlWriter.writeEndElement();
            }
            if (localTypeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "type", xmlWriter);

                if (localType == Integer.MIN_VALUE) {

                    throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

                } else {
                    xmlWriter.writeCharacters(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localAppNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "appName"));

                if (localAppName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");
                }
            }
            if (localCreateTimeTracker) {
                elementList.add(new javax.xml.namespace.QName("", "createTime"));

                if (localCreateTime != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateTime));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("createTime cannot be null!!");
                }
            }
            if (localDocCreatorTracker) {
                elementList.add(new javax.xml.namespace.QName("", "docCreator"));

                if (localDocCreator != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocCreator));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("docCreator cannot be null!!");
                }
            }
            if (localExtendContentTracker) {
                elementList.add(new javax.xml.namespace.QName("", "extendContent"));

                if (localExtendContent != null) {
                    elementList.add(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtendContent));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("extendContent cannot be null!!");
                }
            }
            if (localKeyTracker) {
                elementList.add(new javax.xml.namespace.QName("", "key"));

                if (localKey != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");
                }
            }
            if (localLanguageTracker) {
                elementList.add(new javax.xml.namespace.QName("", "language"));

                if (localLanguage != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("language cannot be null!!");
                }
            }
            if (localLevelTracker) {
                elementList.add(new javax.xml.namespace.QName("", "level"));

                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
            }
            if (localLinkTracker) {
                elementList.add(new javax.xml.namespace.QName("", "link"));

                if (localLink != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLink));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("link cannot be null!!");
                }
            }
            if (localModelIdTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelId"));

                if (localModelId != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelId));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelId cannot be null!!");
                }
            }
            if (localModelNameTracker) {
                elementList.add(new javax.xml.namespace.QName("", "modelName"));

                if (localModelName != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelName));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelName cannot be null!!");
                }
            }
            if (localOthersTracker) {
                elementList.add(new javax.xml.namespace.QName("", "others"));

                if (localOthers != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOthers));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("others cannot be null!!");
                }
            }
            if (localParam1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param1"));

                if (localParam1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param1 cannot be null!!");
                }
            }
            if (localParam2Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "param2"));

                if (localParam2 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParam2));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("param2 cannot be null!!");
                }
            }
            if (localSubjectTracker) {
                elementList.add(new javax.xml.namespace.QName("", "subject"));

                if (localSubject != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("subject cannot be null!!");
                }
            }
            if (localTargetsTracker) {
                elementList.add(new javax.xml.namespace.QName("", "targets"));

                if (localTargets != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargets));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("targets cannot be null!!");
                }
            }
            if (localTypeTracker) {
                elementList.add(new javax.xml.namespace.QName("", "type"));

                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NotifyTodoSendContext parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NotifyTodoSendContext object = new NotifyTodoSendContext();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"notifyTodoSendContext".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NotifyTodoSendContext) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "appName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "appName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setAppName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "createTime").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "createTime" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setCreateTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "docCreator").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "docCreator" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setDocCreator(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "extendContent").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "extendContent" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setExtendContent(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "key").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "key" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "language").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "language" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "level").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "level" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setLevel(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                        object.setLevel(Integer.MIN_VALUE);

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "link").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "link" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setLink(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelId").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelId" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "modelName").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelName" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setModelName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "others").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "others" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setOthers(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param1").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param1" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "param2").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "param2" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setParam2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "subject").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "subject" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setSubject(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "targets").equals(
                            reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "targets" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setTargets(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "type").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "type" + "  cannot be null");
                        }

                        String content = reader.getElementText();

                        object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                        object.setType(Integer.MIN_VALUE);

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoCountResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "getTodoCountResponse", "ns1");

        /**
         * field for GetTodoCountResponse
         */

        protected GetTodoCountResponse localGetTodoCountResponse;

        /**
         * Auto generated getter method
         *
         * @return GetTodoCountResponse
         */
        public GetTodoCountResponse getGetTodoCountResponse() {
            return localGetTodoCountResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param GetTodoCountResponse
         */
        public void setGetTodoCountResponse(GetTodoCountResponse param) {

            this.localGetTodoCountResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localGetTodoCountResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getTodoCountResponse cannot be null!");
            }
            localGetTodoCountResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localGetTodoCountResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoCountResponseE parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoCountResponseE object = new GetTodoCountResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "getTodoCountResponse").equals(
                                    reader.getName())) {

                                object.setGetTodoCountResponse(GetTodoCountResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class UpdateTodoResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = updateTodoResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":updateTodoResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "updateTodoResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateTodoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                UpdateTodoResponse object = new UpdateTodoResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"updateTodoResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdateTodoResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class DeleteTodoE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "deleteTodo", "ns1");

        /**
         * field for DeleteTodo
         */

        protected DeleteTodo localDeleteTodo;

        /**
         * Auto generated getter method
         *
         * @return DeleteTodo
         */
        public DeleteTodo getDeleteTodo() {
            return localDeleteTodo;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteTodo
         */
        public void setDeleteTodo(DeleteTodo param) {

            this.localDeleteTodo = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localDeleteTodo == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTodo cannot be null!");
            }
            localDeleteTodo.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localDeleteTodo.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteTodoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                DeleteTodoE object = new DeleteTodoE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "deleteTodo").equals(
                                    reader.getName())) {

                                object.setDeleteTodo(DeleteTodo.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SetTodoDoneResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = setTodoDoneResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":setTodoDoneResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "setTodoDoneResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SetTodoDoneResponse parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SetTodoDoneResponse object = new SetTodoDoneResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"setTodoDoneResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SetTodoDoneResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SendTodoE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "sendTodo", "ns1");

        /**
         * field for SendTodo
         */

        protected SendTodo localSendTodo;

        /**
         * Auto generated getter method
         *
         * @return SendTodo
         */
        public SendTodo getSendTodo() {
            return localSendTodo;
        }

        /**
         * Auto generated setter method
         *
         * @param param SendTodo
         */
        public void setSendTodo(SendTodo param) {

            this.localSendTodo = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localSendTodo == null) {
                throw new org.apache.axis2.databinding.ADBException("sendTodo cannot be null!");
            }
            localSendTodo.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localSendTodo.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SendTodoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SendTodoE object = new SendTodoE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "sendTodo").equals(
                                    reader.getName())) {

                                object.setSendTodo(SendTodo.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class GetTodoCountE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "getTodoCount", "ns1");

        /**
         * field for GetTodoCount
         */

        protected GetTodoCount localGetTodoCount;

        /**
         * Auto generated getter method
         *
         * @return GetTodoCount
         */
        public GetTodoCount getGetTodoCount() {
            return localGetTodoCount;
        }

        /**
         * Auto generated setter method
         *
         * @param param GetTodoCount
         */
        public void setGetTodoCount(GetTodoCount param) {

            this.localGetTodoCount = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localGetTodoCount == null) {
                throw new org.apache.axis2.databinding.ADBException("getTodoCount cannot be null!");
            }
            localGetTodoCount.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localGetTodoCount.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetTodoCountE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetTodoCountE object = new GetTodoCountE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "getTodoCount").equals(
                                    reader.getName())) {

                                object.setGetTodoCount(GetTodoCount.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class SendTodoResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = sendTodoResponse
                Namespace URI = http://webservice.notify.sys.kmss.landray.com/
                Namespace Prefix = ns1
                */

        /**
         * field for _return
         */

        protected NotifyTodoAppResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return NotifyTodoAppResult
         */
        public NotifyTodoAppResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(NotifyTodoAppResult param) {
            local_returnTracker = param != null;

            this.local_return = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                String namespacePrefix = registerPrefix(xmlWriter, "http://webservice.notify.sys.kmss.landray.com/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":sendTodoResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "sendTodoResponse",
                            xmlWriter);
                }

            }
            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
            }
            xmlWriter.writeEndElement();

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (local_returnTracker) {
                elementList.add(new javax.xml.namespace.QName("", "return"));

                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
                }
                elementList.add(local_return);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SendTodoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SendTodoResponse object = new SendTodoResponse();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"sendTodoResponse".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SendTodoResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "return").equals(
                            reader.getName())) {

                        object.set_return(NotifyTodoAppResult.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    public static class UpdateTodoResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservice.notify.sys.kmss.landray.com/", "updateTodoResponse", "ns1");

        /**
         * field for UpdateTodoResponse
         */

        protected UpdateTodoResponse localUpdateTodoResponse;

        /**
         * Auto generated getter method
         *
         * @return UpdateTodoResponse
         */
        public UpdateTodoResponse getUpdateTodoResponse() {
            return localUpdateTodoResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param UpdateTodoResponse
         */
        public void setUpdateTodoResponse(UpdateTodoResponse param) {

            this.localUpdateTodoResponse = param;

        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                          final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it

            if (localUpdateTodoResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("updateTodoResponse cannot be null!");
            }
            localUpdateTodoResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://webservice.notify.sys.kmss.landray.com/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName, String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(
                            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
                                      String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
                javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

            //We can safely assume an element has only one type associated with it
            return localUpdateTodoResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateTodoResponseE parse(
                    javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                UpdateTodoResponseE object = new UpdateTodoResponseE();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName(
                                    "http://webservice.notify.sys.kmss.landray.com/", "updateTodoResponse").equals(
                                    reader.getName())) {

                                object.setUpdateTodoResponse(UpdateTodoResponse.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                        "Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class

    }

    private org.apache.axiom.om.OMElement toOM(GetTodoCountE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetTodoCountE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetTodoCountResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetTodoCountResponseE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(ExceptionE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(ExceptionE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(DeleteTodoE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(DeleteTodoE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(DeleteTodoResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(DeleteTodoResponseE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SetTodoDoneE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SetTodoDoneE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SetTodoDoneResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SetTodoDoneResponseE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetTodoE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetTodoE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetTodoResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetTodoResponseE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SendTodoE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SendTodoE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SendTodoResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SendTodoResponseE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UpdateTodoE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UpdateTodoE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UpdateTodoResponseE param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UpdateTodoResponseE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          GetTodoCountE param, boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetTodoCountE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, DeleteTodoE param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(DeleteTodoE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SetTodoDoneE param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(SetTodoDoneE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetTodoE param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetTodoE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SendTodoE param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(SendTodoE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, UpdateTodoE param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(UpdateTodoE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }


    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private Object fromOM(org.apache.axiom.om.OMElement param, Class type,
                          java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (GetTodoCountE.class.equals(type)) {

                return GetTodoCountE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetTodoCountResponseE.class.equals(type)) {

                return GetTodoCountResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (DeleteTodoE.class.equals(type)) {

                return DeleteTodoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (DeleteTodoResponseE.class.equals(type)) {

                return DeleteTodoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SetTodoDoneE.class.equals(type)) {

                return SetTodoDoneE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SetTodoDoneResponseE.class.equals(type)) {

                return SetTodoDoneResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetTodoE.class.equals(type)) {

                return GetTodoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetTodoResponseE.class.equals(type)) {

                return GetTodoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SendTodoE.class.equals(type)) {

                return SendTodoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SendTodoResponseE.class.equals(type)) {

                return SendTodoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UpdateTodoE.class.equals(type)) {

                return UpdateTodoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UpdateTodoResponseE.class.equals(type)) {

                return UpdateTodoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExceptionE.class.equals(type)) {

                return ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
   