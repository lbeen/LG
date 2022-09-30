
/**
 * MaterialReturnServiceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.wms.materialreturn;

        

        /*
        *  MaterialReturnServiceServiceStub java implementation
        */

        
        public class MaterialReturnServiceServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("MaterialReturnServiceService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/", "stockOutputOrderInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public MaterialReturnServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public MaterialReturnServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public MaterialReturnServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://10.2.6.166:12031/Service/WMS_MES_Service/MaterialReturnService" );
                
    }

    /**
     * Default Constructor
     */
    public MaterialReturnServiceServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://10.2.6.166:12031/Service/WMS_MES_Service/MaterialReturnService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public MaterialReturnServiceServiceStub(String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.wms.materialreturn.MaterialReturnServiceService#stockOutputOrderInfo
                     * @param stockOutputOrderInfo0
                    
                     */

                    

                            public  StockOutputOrderInfoResponseE stockOutputOrderInfo(

                            StockOutputOrderInfoE stockOutputOrderInfo0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://materialreturn.server.wms.service.webservice.longi.com/MaterialReturnService/stockOutputOrderInfo");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    stockOutputOrderInfo0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/",
                                                    "stockOutputOrderInfo")), new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/",
                                                    "stockOutputOrderInfo"));
                                                
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
                
                
                                Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             StockOutputOrderInfoResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (StockOutputOrderInfoResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"))){
                    //make the fault by reflection
                    try{
                        String exceptionClassName = (String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        Exception ex = (Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new Class[]{messageClass});
                        m.invoke(ex,new Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
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
                * @see com.wms.materialreturn.MaterialReturnServiceService#startstockOutputOrderInfo
                    * @param stockOutputOrderInfo0
                
                */
                public  void startstockOutputOrderInfo(

                 StockOutputOrderInfoE stockOutputOrderInfo0,

                  final MaterialReturnServiceServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://materialreturn.server.wms.service.webservice.longi.com/MaterialReturnService/stockOutputOrderInfo");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    stockOutputOrderInfo0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/",
                                                    "stockOutputOrderInfo")), new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/",
                                                    "stockOutputOrderInfo"));
                                                
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
                                
                                        Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         StockOutputOrderInfoResponseE.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultstockOutputOrderInfo(
                                        (StockOutputOrderInfoResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorstockOutputOrderInfo(e);
                            }
                            }

                            public void onError(Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"))){
											//make the fault by reflection
											try{
													String exceptionClassName = (String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"));
													Class exceptionClass = Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    Exception ex = (Exception) constructor.newInstance(f.getMessage());
													//message class
													String messageClassName = (String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"stockOutputOrderInfo"));
														Class messageClass = Class.forName(messageClassName);
													Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new Class[]{messageClass});
													m.invoke(ex,new Object[]{messageObject});
													
					
										            callback.receiveErrorstockOutputOrderInfo(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstockOutputOrderInfo(f);
                                            }
									    } else {
										    callback.receiveErrorstockOutputOrderInfo(f);
									    }
									} else {
									    callback.receiveErrorstockOutputOrderInfo(f);
									}
								} else {
								    callback.receiveErrorstockOutputOrderInfo(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorstockOutputOrderInfo(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
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
     //http://10.2.6.166:12031/Service/WMS_MES_Service/MaterialReturnService
        public static class StockOutputOrderInfoResponseE
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://materialreturn.server.wms.service.webservice.longi.com/",
                "stockOutputOrderInfoResponse",
                "ns1");

            

                        /**
                        * field for StockOutputOrderInfoResponse
                        */

                        
                                    protected StockOutputOrderInfoResponse localStockOutputOrderInfoResponse ;
                                

                           /**
                           * Auto generated getter method
                           * @return StockOutputOrderInfoResponse
                           */
                           public  StockOutputOrderInfoResponse getStockOutputOrderInfoResponse(){
                               return localStockOutputOrderInfoResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StockOutputOrderInfoResponse
                               */
                               public void setStockOutputOrderInfoResponse(StockOutputOrderInfoResponse param){
                            
                                            this.localStockOutputOrderInfoResponse=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                
                //We can safely assume an element has only one type associated with it
                
                                 if (localStockOutputOrderInfoResponse==null){
                                   throw new org.apache.axis2.databinding.ADBException("stockOutputOrderInfoResponse cannot be null!");
                                 }
                                 localStockOutputOrderInfoResponse.serialize(MY_QNAME,xmlWriter);
                            

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                
                //We can safely assume an element has only one type associated with it
                return localStockOutputOrderInfoResponse.getPullParser(MY_QNAME);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderInfoResponseE parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderInfoResponseE object =
                new StockOutputOrderInfoResponseE();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/","stockOutputOrderInfoResponse").equals(reader.getName())){
                                
                                                object.setStockOutputOrderInfoResponse(StockOutputOrderInfoResponse.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ResponseBody
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = responseBody
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for EsbInfo
                        */

                        
                                    protected EsbInfoRes localEsbInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEsbInfoTracker = false ;

                           public boolean isEsbInfoSpecified(){
                               return localEsbInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return EsbInfoRes
                           */
                           public  EsbInfoRes getEsbInfo(){
                               return localEsbInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EsbInfo
                               */
                               public void setEsbInfo(EsbInfoRes param){
                            localEsbInfoTracker = param != null;
                                   
                                            this.localEsbInfo=param;
                                    

                               }
                            

                        /**
                        * field for ResultInfo
                        */

                        
                                    protected ResultInfo localResultInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultInfoTracker = false ;

                           public boolean isResultInfoSpecified(){
                               return localResultInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return ResultInfo
                           */
                           public  ResultInfo getResultInfo(){
                               return localResultInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResultInfo
                               */
                               public void setResultInfo(ResultInfo param){
                            localResultInfoTracker = param != null;
                                   
                                            this.localResultInfo=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":responseBody",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "responseBody",
                           xmlWriter);
                   }

               
                   }
                if (localEsbInfoTracker){
                                            if (localEsbInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("esbInfo cannot be null!!");
                                            }
                                           localEsbInfo.serialize(new javax.xml.namespace.QName("","esbInfo"),
                                               xmlWriter);
                                        } if (localResultInfoTracker){
                                            if (localResultInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resultInfo cannot be null!!");
                                            }
                                           localResultInfo.serialize(new javax.xml.namespace.QName("","resultInfo"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localEsbInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "esbInfo"));
                            
                            
                                    if (localEsbInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("esbInfo cannot be null!!");
                                    }
                                    elementList.add(localEsbInfo);
                                } if (localResultInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "resultInfo"));
                            
                            
                                    if (localResultInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("resultInfo cannot be null!!");
                                    }
                                    elementList.add(localResultInfo);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ResponseBody parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            ResponseBody object =
                new ResponseBody();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"responseBody".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResponseBody)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","esbInfo").equals(reader.getName())){
                                
                                                object.setEsbInfo(EsbInfoRes.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","resultInfo").equals(reader.getName())){
                                
                                                object.setResultInfo(ResultInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ExtensionMapper{

          public static Object getTypeObject(String namespaceURI,
                                             String typeName,
                                             javax.xml.stream.XMLStreamReader reader) throws Exception{

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "stockOutputOrderInfo".equals(typeName)){
                   
                            return  StockOutputOrderInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "stockOutputOrderHeaderObj".equals(typeName)){
                   
                            return  StockOutputOrderHeaderObj.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "stockOutputOrderObj".equals(typeName)){
                   
                            return  StockOutputOrderObj.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "esbInfoRes".equals(typeName)){
                   
                            return  EsbInfoRes.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "esbInfo".equals(typeName)){
                   
                            return  EsbInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "resultInfo".equals(typeName)){
                   
                            return  ResultInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "responseBody".equals(typeName)){
                   
                            return  ResponseBody.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://materialreturn.server.wms.service.webservice.longi.com/".equals(namespaceURI) &&
                  "stockOutputOrderInfoResponse".equals(typeName)){
                   
                            return  StockOutputOrderInfoResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
        public static class StockOutputOrderObj
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = stockOutputOrderObj
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Area
                        */

                        
                                    protected String localArea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAreaTracker = false ;

                           public boolean isAreaSpecified(){
                               return localAreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getArea(){
                               return localArea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Area
                               */
                               public void setArea(String param){
                            localAreaTracker = param != null;
                                   
                                            this.localArea=param;
                                    

                               }
                            

                        /**
                        * field for Attribute1
                        */

                        
                                    protected String localAttribute1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute1Tracker = false ;

                           public boolean isAttribute1Specified(){
                               return localAttribute1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute1(){
                               return localAttribute1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute1
                               */
                               public void setAttribute1(String param){
                            localAttribute1Tracker = param != null;
                                   
                                            this.localAttribute1=param;
                                    

                               }
                            

                        /**
                        * field for Attribute10
                        */

                        
                                    protected String localAttribute10 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute10Tracker = false ;

                           public boolean isAttribute10Specified(){
                               return localAttribute10Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute10(){
                               return localAttribute10;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute10
                               */
                               public void setAttribute10(String param){
                            localAttribute10Tracker = param != null;
                                   
                                            this.localAttribute10=param;
                                    

                               }
                            

                        /**
                        * field for Attribute11
                        */

                        
                                    protected String localAttribute11 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute11Tracker = false ;

                           public boolean isAttribute11Specified(){
                               return localAttribute11Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute11(){
                               return localAttribute11;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute11
                               */
                               public void setAttribute11(String param){
                            localAttribute11Tracker = param != null;
                                   
                                            this.localAttribute11=param;
                                    

                               }
                            

                        /**
                        * field for Attribute12
                        */

                        
                                    protected String localAttribute12 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute12Tracker = false ;

                           public boolean isAttribute12Specified(){
                               return localAttribute12Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute12(){
                               return localAttribute12;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute12
                               */
                               public void setAttribute12(String param){
                            localAttribute12Tracker = param != null;
                                   
                                            this.localAttribute12=param;
                                    

                               }
                            

                        /**
                        * field for Attribute13
                        */

                        
                                    protected String localAttribute13 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute13Tracker = false ;

                           public boolean isAttribute13Specified(){
                               return localAttribute13Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute13(){
                               return localAttribute13;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute13
                               */
                               public void setAttribute13(String param){
                            localAttribute13Tracker = param != null;
                                   
                                            this.localAttribute13=param;
                                    

                               }
                            

                        /**
                        * field for Attribute14
                        */

                        
                                    protected String localAttribute14 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute14Tracker = false ;

                           public boolean isAttribute14Specified(){
                               return localAttribute14Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute14(){
                               return localAttribute14;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute14
                               */
                               public void setAttribute14(String param){
                            localAttribute14Tracker = param != null;
                                   
                                            this.localAttribute14=param;
                                    

                               }
                            

                        /**
                        * field for Attribute15
                        */

                        
                                    protected String localAttribute15 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute15Tracker = false ;

                           public boolean isAttribute15Specified(){
                               return localAttribute15Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute15(){
                               return localAttribute15;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute15
                               */
                               public void setAttribute15(String param){
                            localAttribute15Tracker = param != null;
                                   
                                            this.localAttribute15=param;
                                    

                               }
                            

                        /**
                        * field for Attribute16
                        */

                        
                                    protected String localAttribute16 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute16Tracker = false ;

                           public boolean isAttribute16Specified(){
                               return localAttribute16Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute16(){
                               return localAttribute16;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute16
                               */
                               public void setAttribute16(String param){
                            localAttribute16Tracker = param != null;
                                   
                                            this.localAttribute16=param;
                                    

                               }
                            

                        /**
                        * field for Attribute17
                        */

                        
                                    protected String localAttribute17 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute17Tracker = false ;

                           public boolean isAttribute17Specified(){
                               return localAttribute17Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute17(){
                               return localAttribute17;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute17
                               */
                               public void setAttribute17(String param){
                            localAttribute17Tracker = param != null;
                                   
                                            this.localAttribute17=param;
                                    

                               }
                            

                        /**
                        * field for Attribute18
                        */

                        
                                    protected String localAttribute18 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute18Tracker = false ;

                           public boolean isAttribute18Specified(){
                               return localAttribute18Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute18(){
                               return localAttribute18;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute18
                               */
                               public void setAttribute18(String param){
                            localAttribute18Tracker = param != null;
                                   
                                            this.localAttribute18=param;
                                    

                               }
                            

                        /**
                        * field for Attribute19
                        */

                        
                                    protected String localAttribute19 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute19Tracker = false ;

                           public boolean isAttribute19Specified(){
                               return localAttribute19Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute19(){
                               return localAttribute19;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute19
                               */
                               public void setAttribute19(String param){
                            localAttribute19Tracker = param != null;
                                   
                                            this.localAttribute19=param;
                                    

                               }
                            

                        /**
                        * field for Attribute2
                        */

                        
                                    protected String localAttribute2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute2Tracker = false ;

                           public boolean isAttribute2Specified(){
                               return localAttribute2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute2(){
                               return localAttribute2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute2
                               */
                               public void setAttribute2(String param){
                            localAttribute2Tracker = param != null;
                                   
                                            this.localAttribute2=param;
                                    

                               }
                            

                        /**
                        * field for Attribute20
                        */

                        
                                    protected String localAttribute20 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute20Tracker = false ;

                           public boolean isAttribute20Specified(){
                               return localAttribute20Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute20(){
                               return localAttribute20;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute20
                               */
                               public void setAttribute20(String param){
                            localAttribute20Tracker = param != null;
                                   
                                            this.localAttribute20=param;
                                    

                               }
                            

                        /**
                        * field for Attribute21
                        */

                        
                                    protected String localAttribute21 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute21Tracker = false ;

                           public boolean isAttribute21Specified(){
                               return localAttribute21Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute21(){
                               return localAttribute21;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute21
                               */
                               public void setAttribute21(String param){
                            localAttribute21Tracker = param != null;
                                   
                                            this.localAttribute21=param;
                                    

                               }
                            

                        /**
                        * field for Attribute22
                        */

                        
                                    protected String localAttribute22 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute22Tracker = false ;

                           public boolean isAttribute22Specified(){
                               return localAttribute22Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute22(){
                               return localAttribute22;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute22
                               */
                               public void setAttribute22(String param){
                            localAttribute22Tracker = param != null;
                                   
                                            this.localAttribute22=param;
                                    

                               }
                            

                        /**
                        * field for Attribute23
                        */

                        
                                    protected String localAttribute23 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute23Tracker = false ;

                           public boolean isAttribute23Specified(){
                               return localAttribute23Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute23(){
                               return localAttribute23;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute23
                               */
                               public void setAttribute23(String param){
                            localAttribute23Tracker = param != null;
                                   
                                            this.localAttribute23=param;
                                    

                               }
                            

                        /**
                        * field for Attribute24
                        */

                        
                                    protected String localAttribute24 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute24Tracker = false ;

                           public boolean isAttribute24Specified(){
                               return localAttribute24Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute24(){
                               return localAttribute24;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute24
                               */
                               public void setAttribute24(String param){
                            localAttribute24Tracker = param != null;
                                   
                                            this.localAttribute24=param;
                                    

                               }
                            

                        /**
                        * field for Attribute25
                        */

                        
                                    protected String localAttribute25 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute25Tracker = false ;

                           public boolean isAttribute25Specified(){
                               return localAttribute25Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute25(){
                               return localAttribute25;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute25
                               */
                               public void setAttribute25(String param){
                            localAttribute25Tracker = param != null;
                                   
                                            this.localAttribute25=param;
                                    

                               }
                            

                        /**
                        * field for Attribute26
                        */

                        
                                    protected String localAttribute26 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute26Tracker = false ;

                           public boolean isAttribute26Specified(){
                               return localAttribute26Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute26(){
                               return localAttribute26;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute26
                               */
                               public void setAttribute26(String param){
                            localAttribute26Tracker = param != null;
                                   
                                            this.localAttribute26=param;
                                    

                               }
                            

                        /**
                        * field for Attribute27
                        */

                        
                                    protected String localAttribute27 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute27Tracker = false ;

                           public boolean isAttribute27Specified(){
                               return localAttribute27Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute27(){
                               return localAttribute27;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute27
                               */
                               public void setAttribute27(String param){
                            localAttribute27Tracker = param != null;
                                   
                                            this.localAttribute27=param;
                                    

                               }
                            

                        /**
                        * field for Attribute28
                        */

                        
                                    protected String localAttribute28 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute28Tracker = false ;

                           public boolean isAttribute28Specified(){
                               return localAttribute28Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute28(){
                               return localAttribute28;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute28
                               */
                               public void setAttribute28(String param){
                            localAttribute28Tracker = param != null;
                                   
                                            this.localAttribute28=param;
                                    

                               }
                            

                        /**
                        * field for Attribute29
                        */

                        
                                    protected String localAttribute29 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute29Tracker = false ;

                           public boolean isAttribute29Specified(){
                               return localAttribute29Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute29(){
                               return localAttribute29;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute29
                               */
                               public void setAttribute29(String param){
                            localAttribute29Tracker = param != null;
                                   
                                            this.localAttribute29=param;
                                    

                               }
                            

                        /**
                        * field for Attribute3
                        */

                        
                                    protected String localAttribute3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute3Tracker = false ;

                           public boolean isAttribute3Specified(){
                               return localAttribute3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute3(){
                               return localAttribute3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute3
                               */
                               public void setAttribute3(String param){
                            localAttribute3Tracker = param != null;
                                   
                                            this.localAttribute3=param;
                                    

                               }
                            

                        /**
                        * field for Attribute30
                        */

                        
                                    protected String localAttribute30 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute30Tracker = false ;

                           public boolean isAttribute30Specified(){
                               return localAttribute30Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute30(){
                               return localAttribute30;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute30
                               */
                               public void setAttribute30(String param){
                            localAttribute30Tracker = param != null;
                                   
                                            this.localAttribute30=param;
                                    

                               }
                            

                        /**
                        * field for Attribute31
                        */

                        
                                    protected String localAttribute31 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute31Tracker = false ;

                           public boolean isAttribute31Specified(){
                               return localAttribute31Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute31(){
                               return localAttribute31;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute31
                               */
                               public void setAttribute31(String param){
                            localAttribute31Tracker = param != null;
                                   
                                            this.localAttribute31=param;
                                    

                               }
                            

                        /**
                        * field for Attribute32
                        */

                        
                                    protected String localAttribute32 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute32Tracker = false ;

                           public boolean isAttribute32Specified(){
                               return localAttribute32Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute32(){
                               return localAttribute32;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute32
                               */
                               public void setAttribute32(String param){
                            localAttribute32Tracker = param != null;
                                   
                                            this.localAttribute32=param;
                                    

                               }
                            

                        /**
                        * field for Attribute33
                        */

                        
                                    protected String localAttribute33 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute33Tracker = false ;

                           public boolean isAttribute33Specified(){
                               return localAttribute33Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute33(){
                               return localAttribute33;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute33
                               */
                               public void setAttribute33(String param){
                            localAttribute33Tracker = param != null;
                                   
                                            this.localAttribute33=param;
                                    

                               }
                            

                        /**
                        * field for Attribute34
                        */

                        
                                    protected String localAttribute34 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute34Tracker = false ;

                           public boolean isAttribute34Specified(){
                               return localAttribute34Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute34(){
                               return localAttribute34;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute34
                               */
                               public void setAttribute34(String param){
                            localAttribute34Tracker = param != null;
                                   
                                            this.localAttribute34=param;
                                    

                               }
                            

                        /**
                        * field for Attribute35
                        */

                        
                                    protected String localAttribute35 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute35Tracker = false ;

                           public boolean isAttribute35Specified(){
                               return localAttribute35Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute35(){
                               return localAttribute35;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute35
                               */
                               public void setAttribute35(String param){
                            localAttribute35Tracker = param != null;
                                   
                                            this.localAttribute35=param;
                                    

                               }
                            

                        /**
                        * field for Attribute36
                        */

                        
                                    protected String localAttribute36 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute36Tracker = false ;

                           public boolean isAttribute36Specified(){
                               return localAttribute36Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute36(){
                               return localAttribute36;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute36
                               */
                               public void setAttribute36(String param){
                            localAttribute36Tracker = param != null;
                                   
                                            this.localAttribute36=param;
                                    

                               }
                            

                        /**
                        * field for Attribute37
                        */

                        
                                    protected String localAttribute37 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute37Tracker = false ;

                           public boolean isAttribute37Specified(){
                               return localAttribute37Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute37(){
                               return localAttribute37;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute37
                               */
                               public void setAttribute37(String param){
                            localAttribute37Tracker = param != null;
                                   
                                            this.localAttribute37=param;
                                    

                               }
                            

                        /**
                        * field for Attribute38
                        */

                        
                                    protected String localAttribute38 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute38Tracker = false ;

                           public boolean isAttribute38Specified(){
                               return localAttribute38Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute38(){
                               return localAttribute38;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute38
                               */
                               public void setAttribute38(String param){
                            localAttribute38Tracker = param != null;
                                   
                                            this.localAttribute38=param;
                                    

                               }
                            

                        /**
                        * field for Attribute39
                        */

                        
                                    protected String localAttribute39 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute39Tracker = false ;

                           public boolean isAttribute39Specified(){
                               return localAttribute39Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute39(){
                               return localAttribute39;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute39
                               */
                               public void setAttribute39(String param){
                            localAttribute39Tracker = param != null;
                                   
                                            this.localAttribute39=param;
                                    

                               }
                            

                        /**
                        * field for Attribute4
                        */

                        
                                    protected String localAttribute4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute4Tracker = false ;

                           public boolean isAttribute4Specified(){
                               return localAttribute4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute4(){
                               return localAttribute4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute4
                               */
                               public void setAttribute4(String param){
                            localAttribute4Tracker = param != null;
                                   
                                            this.localAttribute4=param;
                                    

                               }
                            

                        /**
                        * field for Attribute40
                        */

                        
                                    protected String localAttribute40 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute40Tracker = false ;

                           public boolean isAttribute40Specified(){
                               return localAttribute40Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute40(){
                               return localAttribute40;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute40
                               */
                               public void setAttribute40(String param){
                            localAttribute40Tracker = param != null;
                                   
                                            this.localAttribute40=param;
                                    

                               }
                            

                        /**
                        * field for Attribute41
                        */

                        
                                    protected String localAttribute41 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute41Tracker = false ;

                           public boolean isAttribute41Specified(){
                               return localAttribute41Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute41(){
                               return localAttribute41;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute41
                               */
                               public void setAttribute41(String param){
                            localAttribute41Tracker = param != null;
                                   
                                            this.localAttribute41=param;
                                    

                               }
                            

                        /**
                        * field for Attribute42
                        */

                        
                                    protected String localAttribute42 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute42Tracker = false ;

                           public boolean isAttribute42Specified(){
                               return localAttribute42Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute42(){
                               return localAttribute42;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute42
                               */
                               public void setAttribute42(String param){
                            localAttribute42Tracker = param != null;
                                   
                                            this.localAttribute42=param;
                                    

                               }
                            

                        /**
                        * field for Attribute43
                        */

                        
                                    protected String localAttribute43 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute43Tracker = false ;

                           public boolean isAttribute43Specified(){
                               return localAttribute43Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute43(){
                               return localAttribute43;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute43
                               */
                               public void setAttribute43(String param){
                            localAttribute43Tracker = param != null;
                                   
                                            this.localAttribute43=param;
                                    

                               }
                            

                        /**
                        * field for Attribute44
                        */

                        
                                    protected String localAttribute44 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute44Tracker = false ;

                           public boolean isAttribute44Specified(){
                               return localAttribute44Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute44(){
                               return localAttribute44;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute44
                               */
                               public void setAttribute44(String param){
                            localAttribute44Tracker = param != null;
                                   
                                            this.localAttribute44=param;
                                    

                               }
                            

                        /**
                        * field for Attribute45
                        */

                        
                                    protected String localAttribute45 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute45Tracker = false ;

                           public boolean isAttribute45Specified(){
                               return localAttribute45Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute45(){
                               return localAttribute45;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute45
                               */
                               public void setAttribute45(String param){
                            localAttribute45Tracker = param != null;
                                   
                                            this.localAttribute45=param;
                                    

                               }
                            

                        /**
                        * field for Attribute46
                        */

                        
                                    protected String localAttribute46 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute46Tracker = false ;

                           public boolean isAttribute46Specified(){
                               return localAttribute46Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute46(){
                               return localAttribute46;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute46
                               */
                               public void setAttribute46(String param){
                            localAttribute46Tracker = param != null;
                                   
                                            this.localAttribute46=param;
                                    

                               }
                            

                        /**
                        * field for Attribute47
                        */

                        
                                    protected String localAttribute47 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute47Tracker = false ;

                           public boolean isAttribute47Specified(){
                               return localAttribute47Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute47(){
                               return localAttribute47;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute47
                               */
                               public void setAttribute47(String param){
                            localAttribute47Tracker = param != null;
                                   
                                            this.localAttribute47=param;
                                    

                               }
                            

                        /**
                        * field for Attribute48
                        */

                        
                                    protected String localAttribute48 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute48Tracker = false ;

                           public boolean isAttribute48Specified(){
                               return localAttribute48Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute48(){
                               return localAttribute48;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute48
                               */
                               public void setAttribute48(String param){
                            localAttribute48Tracker = param != null;
                                   
                                            this.localAttribute48=param;
                                    

                               }
                            

                        /**
                        * field for Attribute49
                        */

                        
                                    protected String localAttribute49 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute49Tracker = false ;

                           public boolean isAttribute49Specified(){
                               return localAttribute49Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute49(){
                               return localAttribute49;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute49
                               */
                               public void setAttribute49(String param){
                            localAttribute49Tracker = param != null;
                                   
                                            this.localAttribute49=param;
                                    

                               }
                            

                        /**
                        * field for Attribute5
                        */

                        
                                    protected String localAttribute5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute5Tracker = false ;

                           public boolean isAttribute5Specified(){
                               return localAttribute5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute5(){
                               return localAttribute5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute5
                               */
                               public void setAttribute5(String param){
                            localAttribute5Tracker = param != null;
                                   
                                            this.localAttribute5=param;
                                    

                               }
                            

                        /**
                        * field for Attribute50
                        */

                        
                                    protected String localAttribute50 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute50Tracker = false ;

                           public boolean isAttribute50Specified(){
                               return localAttribute50Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute50(){
                               return localAttribute50;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute50
                               */
                               public void setAttribute50(String param){
                            localAttribute50Tracker = param != null;
                                   
                                            this.localAttribute50=param;
                                    

                               }
                            

                        /**
                        * field for Attribute6
                        */

                        
                                    protected String localAttribute6 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute6Tracker = false ;

                           public boolean isAttribute6Specified(){
                               return localAttribute6Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute6(){
                               return localAttribute6;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute6
                               */
                               public void setAttribute6(String param){
                            localAttribute6Tracker = param != null;
                                   
                                            this.localAttribute6=param;
                                    

                               }
                            

                        /**
                        * field for Attribute7
                        */

                        
                                    protected String localAttribute7 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute7Tracker = false ;

                           public boolean isAttribute7Specified(){
                               return localAttribute7Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute7(){
                               return localAttribute7;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute7
                               */
                               public void setAttribute7(String param){
                            localAttribute7Tracker = param != null;
                                   
                                            this.localAttribute7=param;
                                    

                               }
                            

                        /**
                        * field for Attribute8
                        */

                        
                                    protected String localAttribute8 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute8Tracker = false ;

                           public boolean isAttribute8Specified(){
                               return localAttribute8Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute8(){
                               return localAttribute8;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute8
                               */
                               public void setAttribute8(String param){
                            localAttribute8Tracker = param != null;
                                   
                                            this.localAttribute8=param;
                                    

                               }
                            

                        /**
                        * field for Attribute9
                        */

                        
                                    protected String localAttribute9 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttribute9Tracker = false ;

                           public boolean isAttribute9Specified(){
                               return localAttribute9Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttribute9(){
                               return localAttribute9;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attribute9
                               */
                               public void setAttribute9(String param){
                            localAttribute9Tracker = param != null;
                                   
                                            this.localAttribute9=param;
                                    

                               }
                            

                        /**
                        * field for Batch
                        */

                        
                                    protected String localBatch ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBatchTracker = false ;

                           public boolean isBatchSpecified(){
                               return localBatchTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getBatch(){
                               return localBatch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Batch
                               */
                               public void setBatch(String param){
                            localBatchTracker = param != null;
                                   
                                            this.localBatch=param;
                                    

                               }
                            

                        /**
                        * field for BoxNumber
                        */

                        
                                    protected String localBoxNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBoxNumberTracker = false ;

                           public boolean isBoxNumberSpecified(){
                               return localBoxNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getBoxNumber(){
                               return localBoxNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BoxNumber
                               */
                               public void setBoxNumber(String param){
                            localBoxNumberTracker = param != null;
                                   
                                            this.localBoxNumber=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(String param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for FromLocator
                        */

                        
                                    protected String localFromLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFromLocatorTracker = false ;

                           public boolean isFromLocatorSpecified(){
                               return localFromLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getFromLocator(){
                               return localFromLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromLocator
                               */
                               public void setFromLocator(String param){
                            localFromLocatorTracker = param != null;
                                   
                                            this.localFromLocator=param;
                                    

                               }
                            

                        /**
                        * field for ManufactureCompany
                        */

                        
                                    protected String localManufactureCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localManufactureCompanyTracker = false ;

                           public boolean isManufactureCompanySpecified(){
                               return localManufactureCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getManufactureCompany(){
                               return localManufactureCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ManufactureCompany
                               */
                               public void setManufactureCompany(String param){
                            localManufactureCompanyTracker = param != null;
                                   
                                            this.localManufactureCompany=param;
                                    

                               }
                            

                        /**
                        * field for Material
                        */

                        
                                    protected String localMaterial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaterialTracker = false ;

                           public boolean isMaterialSpecified(){
                               return localMaterialTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getMaterial(){
                               return localMaterial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Material
                               */
                               public void setMaterial(String param){
                            localMaterialTracker = param != null;
                                   
                                            this.localMaterial=param;
                                    

                               }
                            

                        /**
                        * field for OperateBy
                        */

                        
                                    protected String localOperateBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOperateByTracker = false ;

                           public boolean isOperateBySpecified(){
                               return localOperateByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOperateBy(){
                               return localOperateBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OperateBy
                               */
                               public void setOperateBy(String param){
                            localOperateByTracker = param != null;
                                   
                                            this.localOperateBy=param;
                                    

                               }
                            

                        /**
                        * field for OperateDate
                        */

                        
                                    protected String localOperateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOperateDateTracker = false ;

                           public boolean isOperateDateSpecified(){
                               return localOperateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOperateDate(){
                               return localOperateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OperateDate
                               */
                               public void setOperateDate(String param){
                            localOperateDateTracker = param != null;
                                   
                                            this.localOperateDate=param;
                                    

                               }
                            

                        /**
                        * field for OrderNo
                        */

                        
                                    protected String localOrderNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderNoTracker = false ;

                           public boolean isOrderNoSpecified(){
                               return localOrderNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOrderNo(){
                               return localOrderNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderNo
                               */
                               public void setOrderNo(String param){
                            localOrderNoTracker = param != null;
                                   
                                            this.localOrderNo=param;
                                    

                               }
                            

                        /**
                        * field for OrganizationCode
                        */

                        
                                    protected String localOrganizationCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrganizationCodeTracker = false ;

                           public boolean isOrganizationCodeSpecified(){
                               return localOrganizationCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOrganizationCode(){
                               return localOrganizationCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrganizationCode
                               */
                               public void setOrganizationCode(String param){
                            localOrganizationCodeTracker = param != null;
                                   
                                            this.localOrganizationCode=param;
                                    

                               }
                            

                        /**
                        * field for PartNumber
                        */

                        
                                    protected String localPartNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPartNumberTracker = false ;

                           public boolean isPartNumberSpecified(){
                               return localPartNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPartNumber(){
                               return localPartNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PartNumber
                               */
                               public void setPartNumber(String param){
                            localPartNumberTracker = param != null;
                                   
                                            this.localPartNumber=param;
                                    

                               }
                            

                        /**
                        * field for PlineName
                        */

                        
                                    protected String localPlineName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlineNameTracker = false ;

                           public boolean isPlineNameSpecified(){
                               return localPlineNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPlineName(){
                               return localPlineName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlineName
                               */
                               public void setPlineName(String param){
                            localPlineNameTracker = param != null;
                                   
                                            this.localPlineName=param;
                                    

                               }
                            

                        /**
                        * field for ProductDate
                        */

                        
                                    protected String localProductDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductDateTracker = false ;

                           public boolean isProductDateSpecified(){
                               return localProductDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getProductDate(){
                               return localProductDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProductDate
                               */
                               public void setProductDate(String param){
                            localProductDateTracker = param != null;
                                   
                                            this.localProductDate=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        */

                        
                                    protected String localQuantity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuantityTracker = false ;

                           public boolean isQuantitySpecified(){
                               return localQuantityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getQuantity(){
                               return localQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Quantity
                               */
                               public void setQuantity(String param){
                            localQuantityTracker = param != null;
                                   
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for RequisitionNumber
                        */

                        
                                    protected String localRequisitionNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequisitionNumberTracker = false ;

                           public boolean isRequisitionNumberSpecified(){
                               return localRequisitionNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRequisitionNumber(){
                               return localRequisitionNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequisitionNumber
                               */
                               public void setRequisitionNumber(String param){
                            localRequisitionNumberTracker = param != null;
                                   
                                            this.localRequisitionNumber=param;
                                    

                               }
                            

                        /**
                        * field for Site
                        */

                        
                                    protected String localSite ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiteTracker = false ;

                           public boolean isSiteSpecified(){
                               return localSiteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSite(){
                               return localSite;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Site
                               */
                               public void setSite(String param){
                            localSiteTracker = param != null;
                                   
                                            this.localSite=param;
                                    

                               }
                            

                        /**
                        * field for StorageNumberSource
                        */

                        
                                    protected String localStorageNumberSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStorageNumberSourceTracker = false ;

                           public boolean isStorageNumberSourceSpecified(){
                               return localStorageNumberSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getStorageNumberSource(){
                               return localStorageNumberSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StorageNumberSource
                               */
                               public void setStorageNumberSource(String param){
                            localStorageNumberSourceTracker = param != null;
                                   
                                            this.localStorageNumberSource=param;
                                    

                               }
                            

                        /**
                        * field for StorageNumberTarget
                        */

                        
                                    protected String localStorageNumberTarget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStorageNumberTargetTracker = false ;

                           public boolean isStorageNumberTargetSpecified(){
                               return localStorageNumberTargetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getStorageNumberTarget(){
                               return localStorageNumberTarget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StorageNumberTarget
                               */
                               public void setStorageNumberTarget(String param){
                            localStorageNumberTargetTracker = param != null;
                                   
                                            this.localStorageNumberTarget=param;
                                    

                               }
                            

                        /**
                        * field for Supplier
                        */

                        
                                    protected String localSupplier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupplierTracker = false ;

                           public boolean isSupplierSpecified(){
                               return localSupplierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSupplier(){
                               return localSupplier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Supplier
                               */
                               public void setSupplier(String param){
                            localSupplierTracker = param != null;
                                   
                                            this.localSupplier=param;
                                    

                               }
                            

                        /**
                        * field for ToLocator
                        */

                        
                                    protected String localToLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToLocatorTracker = false ;

                           public boolean isToLocatorSpecified(){
                               return localToLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getToLocator(){
                               return localToLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToLocator
                               */
                               public void setToLocator(String param){
                            localToLocatorTracker = param != null;
                                   
                                            this.localToLocator=param;
                                    

                               }
                            

                        /**
                        * field for TrayNumber
                        */

                        
                                    protected String localTrayNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrayNumberTracker = false ;

                           public boolean isTrayNumberSpecified(){
                               return localTrayNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getTrayNumber(){
                               return localTrayNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TrayNumber
                               */
                               public void setTrayNumber(String param){
                            localTrayNumberTracker = param != null;
                                   
                                            this.localTrayNumber=param;
                                    

                               }
                            

                        /**
                        * field for Unit
                        */

                        
                                    protected String localUnit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnitTracker = false ;

                           public boolean isUnitSpecified(){
                               return localUnitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getUnit(){
                               return localUnit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Unit
                               */
                               public void setUnit(String param){
                            localUnitTracker = param != null;
                                   
                                            this.localUnit=param;
                                    

                               }
                            

                        /**
                        * field for WarehousingDate
                        */

                        
                                    protected String localWarehousingDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWarehousingDateTracker = false ;

                           public boolean isWarehousingDateSpecified(){
                               return localWarehousingDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getWarehousingDate(){
                               return localWarehousingDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WarehousingDate
                               */
                               public void setWarehousingDate(String param){
                            localWarehousingDateTracker = param != null;
                                   
                                            this.localWarehousingDate=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":stockOutputOrderObj",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "stockOutputOrderObj",
                           xmlWriter);
                   }

               
                   }
                if (localAreaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "area", xmlWriter);
                             

                                          if (localArea==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("area cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localArea);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute1Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute1", xmlWriter);
                             

                                          if (localAttribute1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute10Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute10", xmlWriter);
                             

                                          if (localAttribute10==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute10 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute10);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute11Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute11", xmlWriter);
                             

                                          if (localAttribute11==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute11 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute11);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute12Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute12", xmlWriter);
                             

                                          if (localAttribute12==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute12 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute12);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute13Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute13", xmlWriter);
                             

                                          if (localAttribute13==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute13 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute13);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute14Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute14", xmlWriter);
                             

                                          if (localAttribute14==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute14 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute14);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute15Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute15", xmlWriter);
                             

                                          if (localAttribute15==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute15 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute15);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute16Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute16", xmlWriter);
                             

                                          if (localAttribute16==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute16 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute16);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute17Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute17", xmlWriter);
                             

                                          if (localAttribute17==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute17 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute17);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute18Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute18", xmlWriter);
                             

                                          if (localAttribute18==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute18 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute18);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute19Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute19", xmlWriter);
                             

                                          if (localAttribute19==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute19 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute19);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute2", xmlWriter);
                             

                                          if (localAttribute2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute20Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute20", xmlWriter);
                             

                                          if (localAttribute20==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute20 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute20);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute21Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute21", xmlWriter);
                             

                                          if (localAttribute21==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute21 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute21);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute22Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute22", xmlWriter);
                             

                                          if (localAttribute22==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute22 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute22);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute23Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute23", xmlWriter);
                             

                                          if (localAttribute23==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute23 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute23);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute24Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute24", xmlWriter);
                             

                                          if (localAttribute24==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute24 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute24);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute25Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute25", xmlWriter);
                             

                                          if (localAttribute25==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute25 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute25);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute26Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute26", xmlWriter);
                             

                                          if (localAttribute26==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute26 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute26);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute27Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute27", xmlWriter);
                             

                                          if (localAttribute27==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute27 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute27);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute28Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute28", xmlWriter);
                             

                                          if (localAttribute28==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute28 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute28);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute29Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute29", xmlWriter);
                             

                                          if (localAttribute29==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute29 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute29);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute3Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute3", xmlWriter);
                             

                                          if (localAttribute3==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute3 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute30Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute30", xmlWriter);
                             

                                          if (localAttribute30==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute30 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute30);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute31Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute31", xmlWriter);
                             

                                          if (localAttribute31==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute31 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute31);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute32Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute32", xmlWriter);
                             

                                          if (localAttribute32==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute32 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute32);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute33Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute33", xmlWriter);
                             

                                          if (localAttribute33==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute33 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute33);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute34Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute34", xmlWriter);
                             

                                          if (localAttribute34==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute34 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute34);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute35Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute35", xmlWriter);
                             

                                          if (localAttribute35==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute35 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute35);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute36Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute36", xmlWriter);
                             

                                          if (localAttribute36==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute36 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute36);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute37Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute37", xmlWriter);
                             

                                          if (localAttribute37==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute37 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute37);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute38Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute38", xmlWriter);
                             

                                          if (localAttribute38==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute38 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute38);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute39Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute39", xmlWriter);
                             

                                          if (localAttribute39==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute39 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute39);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute4Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute4", xmlWriter);
                             

                                          if (localAttribute4==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute4 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute4);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute40Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute40", xmlWriter);
                             

                                          if (localAttribute40==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute40 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute40);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute41Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute41", xmlWriter);
                             

                                          if (localAttribute41==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute41 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute41);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute42Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute42", xmlWriter);
                             

                                          if (localAttribute42==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute42 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute42);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute43Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute43", xmlWriter);
                             

                                          if (localAttribute43==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute43 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute43);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute44Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute44", xmlWriter);
                             

                                          if (localAttribute44==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute44 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute44);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute45Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute45", xmlWriter);
                             

                                          if (localAttribute45==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute45 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute45);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute46Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute46", xmlWriter);
                             

                                          if (localAttribute46==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute46 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute46);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute47Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute47", xmlWriter);
                             

                                          if (localAttribute47==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute47 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute47);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute48Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute48", xmlWriter);
                             

                                          if (localAttribute48==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute48 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute48);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute49Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute49", xmlWriter);
                             

                                          if (localAttribute49==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute49 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute49);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute5Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute5", xmlWriter);
                             

                                          if (localAttribute5==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute5 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute5);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute50Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute50", xmlWriter);
                             

                                          if (localAttribute50==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute50 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute50);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute6Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute6", xmlWriter);
                             

                                          if (localAttribute6==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute6 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute6);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute7Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute7", xmlWriter);
                             

                                          if (localAttribute7==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute7 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute7);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute8Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute8", xmlWriter);
                             

                                          if (localAttribute8==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute8 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute8);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttribute9Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribute9", xmlWriter);
                             

                                          if (localAttribute9==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attribute9 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttribute9);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBatchTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "batch", xmlWriter);
                             

                                          if (localBatch==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("batch cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBatch);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBoxNumberTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "boxNumber", xmlWriter);
                             

                                          if (localBoxNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("boxNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBoxNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFromLocatorTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fromLocator", xmlWriter);
                             

                                          if (localFromLocator==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fromLocator cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFromLocator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localManufactureCompanyTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "manufactureCompany", xmlWriter);
                             

                                          if (localManufactureCompany==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("manufactureCompany cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localManufactureCompany);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaterialTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "material", xmlWriter);
                             

                                          if (localMaterial==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("material cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMaterial);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOperateByTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "operateBy", xmlWriter);
                             

                                          if (localOperateBy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("operateBy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOperateBy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOperateDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "operateDate", xmlWriter);
                             

                                          if (localOperateDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("operateDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOperateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderNoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "orderNo", xmlWriter);
                             

                                          if (localOrderNo==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("orderNo cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrderNo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrganizationCodeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "organizationCode", xmlWriter);
                             

                                          if (localOrganizationCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("organizationCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrganizationCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPartNumberTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "partNumber", xmlWriter);
                             

                                          if (localPartNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("partNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPartNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlineNameTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "plineName", xmlWriter);
                             

                                          if (localPlineName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("plineName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlineName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "productDate", xmlWriter);
                             

                                          if (localProductDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("productDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProductDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuantityTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "quantity", xmlWriter);
                             

                                          if (localQuantity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("quantity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuantity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequisitionNumberTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requisitionNumber", xmlWriter);
                             

                                          if (localRequisitionNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requisitionNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequisitionNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSiteTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "site", xmlWriter);
                             

                                          if (localSite==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("site cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSite);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStorageNumberSourceTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "storageNumberSource", xmlWriter);
                             

                                          if (localStorageNumberSource==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("storageNumberSource cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStorageNumberSource);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStorageNumberTargetTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "storageNumberTarget", xmlWriter);
                             

                                          if (localStorageNumberTarget==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("storageNumberTarget cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStorageNumberTarget);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSupplierTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "supplier", xmlWriter);
                             

                                          if (localSupplier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("supplier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSupplier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToLocatorTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "toLocator", xmlWriter);
                             

                                          if (localToLocator==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("toLocator cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToLocator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTrayNumberTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "trayNumber", xmlWriter);
                             

                                          if (localTrayNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("trayNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTrayNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUnitTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "unit", xmlWriter);
                             

                                          if (localUnit==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("unit cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUnit);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWarehousingDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "warehousingDate", xmlWriter);
                             

                                          if (localWarehousingDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("warehousingDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWarehousingDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAreaTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "area"));
                                 
                                        if (localArea != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArea));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("area cannot be null!!");
                                        }
                                    } if (localAttribute1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute1"));
                                 
                                        if (localAttribute1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute1 cannot be null!!");
                                        }
                                    } if (localAttribute10Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute10"));
                                 
                                        if (localAttribute10 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute10));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute10 cannot be null!!");
                                        }
                                    } if (localAttribute11Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute11"));
                                 
                                        if (localAttribute11 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute11));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute11 cannot be null!!");
                                        }
                                    } if (localAttribute12Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute12"));
                                 
                                        if (localAttribute12 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute12));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute12 cannot be null!!");
                                        }
                                    } if (localAttribute13Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute13"));
                                 
                                        if (localAttribute13 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute13));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute13 cannot be null!!");
                                        }
                                    } if (localAttribute14Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute14"));
                                 
                                        if (localAttribute14 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute14));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute14 cannot be null!!");
                                        }
                                    } if (localAttribute15Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute15"));
                                 
                                        if (localAttribute15 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute15));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute15 cannot be null!!");
                                        }
                                    } if (localAttribute16Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute16"));
                                 
                                        if (localAttribute16 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute16));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute16 cannot be null!!");
                                        }
                                    } if (localAttribute17Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute17"));
                                 
                                        if (localAttribute17 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute17));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute17 cannot be null!!");
                                        }
                                    } if (localAttribute18Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute18"));
                                 
                                        if (localAttribute18 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute18));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute18 cannot be null!!");
                                        }
                                    } if (localAttribute19Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute19"));
                                 
                                        if (localAttribute19 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute19));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute19 cannot be null!!");
                                        }
                                    } if (localAttribute2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute2"));
                                 
                                        if (localAttribute2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute2 cannot be null!!");
                                        }
                                    } if (localAttribute20Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute20"));
                                 
                                        if (localAttribute20 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute20));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute20 cannot be null!!");
                                        }
                                    } if (localAttribute21Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute21"));
                                 
                                        if (localAttribute21 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute21));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute21 cannot be null!!");
                                        }
                                    } if (localAttribute22Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute22"));
                                 
                                        if (localAttribute22 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute22));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute22 cannot be null!!");
                                        }
                                    } if (localAttribute23Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute23"));
                                 
                                        if (localAttribute23 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute23));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute23 cannot be null!!");
                                        }
                                    } if (localAttribute24Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute24"));
                                 
                                        if (localAttribute24 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute24));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute24 cannot be null!!");
                                        }
                                    } if (localAttribute25Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute25"));
                                 
                                        if (localAttribute25 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute25));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute25 cannot be null!!");
                                        }
                                    } if (localAttribute26Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute26"));
                                 
                                        if (localAttribute26 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute26));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute26 cannot be null!!");
                                        }
                                    } if (localAttribute27Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute27"));
                                 
                                        if (localAttribute27 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute27));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute27 cannot be null!!");
                                        }
                                    } if (localAttribute28Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute28"));
                                 
                                        if (localAttribute28 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute28));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute28 cannot be null!!");
                                        }
                                    } if (localAttribute29Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute29"));
                                 
                                        if (localAttribute29 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute29));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute29 cannot be null!!");
                                        }
                                    } if (localAttribute3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute3"));
                                 
                                        if (localAttribute3 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute3));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute3 cannot be null!!");
                                        }
                                    } if (localAttribute30Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute30"));
                                 
                                        if (localAttribute30 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute30));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute30 cannot be null!!");
                                        }
                                    } if (localAttribute31Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute31"));
                                 
                                        if (localAttribute31 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute31));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute31 cannot be null!!");
                                        }
                                    } if (localAttribute32Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute32"));
                                 
                                        if (localAttribute32 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute32));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute32 cannot be null!!");
                                        }
                                    } if (localAttribute33Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute33"));
                                 
                                        if (localAttribute33 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute33));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute33 cannot be null!!");
                                        }
                                    } if (localAttribute34Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute34"));
                                 
                                        if (localAttribute34 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute34));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute34 cannot be null!!");
                                        }
                                    } if (localAttribute35Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute35"));
                                 
                                        if (localAttribute35 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute35));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute35 cannot be null!!");
                                        }
                                    } if (localAttribute36Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute36"));
                                 
                                        if (localAttribute36 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute36));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute36 cannot be null!!");
                                        }
                                    } if (localAttribute37Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute37"));
                                 
                                        if (localAttribute37 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute37));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute37 cannot be null!!");
                                        }
                                    } if (localAttribute38Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute38"));
                                 
                                        if (localAttribute38 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute38));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute38 cannot be null!!");
                                        }
                                    } if (localAttribute39Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute39"));
                                 
                                        if (localAttribute39 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute39));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute39 cannot be null!!");
                                        }
                                    } if (localAttribute4Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute4"));
                                 
                                        if (localAttribute4 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute4));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute4 cannot be null!!");
                                        }
                                    } if (localAttribute40Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute40"));
                                 
                                        if (localAttribute40 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute40));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute40 cannot be null!!");
                                        }
                                    } if (localAttribute41Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute41"));
                                 
                                        if (localAttribute41 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute41));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute41 cannot be null!!");
                                        }
                                    } if (localAttribute42Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute42"));
                                 
                                        if (localAttribute42 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute42));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute42 cannot be null!!");
                                        }
                                    } if (localAttribute43Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute43"));
                                 
                                        if (localAttribute43 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute43));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute43 cannot be null!!");
                                        }
                                    } if (localAttribute44Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute44"));
                                 
                                        if (localAttribute44 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute44));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute44 cannot be null!!");
                                        }
                                    } if (localAttribute45Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute45"));
                                 
                                        if (localAttribute45 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute45));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute45 cannot be null!!");
                                        }
                                    } if (localAttribute46Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute46"));
                                 
                                        if (localAttribute46 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute46));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute46 cannot be null!!");
                                        }
                                    } if (localAttribute47Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute47"));
                                 
                                        if (localAttribute47 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute47));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute47 cannot be null!!");
                                        }
                                    } if (localAttribute48Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute48"));
                                 
                                        if (localAttribute48 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute48));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute48 cannot be null!!");
                                        }
                                    } if (localAttribute49Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute49"));
                                 
                                        if (localAttribute49 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute49));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute49 cannot be null!!");
                                        }
                                    } if (localAttribute5Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute5"));
                                 
                                        if (localAttribute5 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute5));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute5 cannot be null!!");
                                        }
                                    } if (localAttribute50Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute50"));
                                 
                                        if (localAttribute50 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute50));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute50 cannot be null!!");
                                        }
                                    } if (localAttribute6Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute6"));
                                 
                                        if (localAttribute6 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute6));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute6 cannot be null!!");
                                        }
                                    } if (localAttribute7Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute7"));
                                 
                                        if (localAttribute7 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute7));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute7 cannot be null!!");
                                        }
                                    } if (localAttribute8Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute8"));
                                 
                                        if (localAttribute8 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute8));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute8 cannot be null!!");
                                        }
                                    } if (localAttribute9Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribute9"));
                                 
                                        if (localAttribute9 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribute9));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attribute9 cannot be null!!");
                                        }
                                    } if (localBatchTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "batch"));
                                 
                                        if (localBatch != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBatch));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("batch cannot be null!!");
                                        }
                                    } if (localBoxNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "boxNumber"));
                                 
                                        if (localBoxNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBoxNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("boxNumber cannot be null!!");
                                        }
                                    } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
                                        }
                                    } if (localFromLocatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "fromLocator"));
                                 
                                        if (localFromLocator != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromLocator));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("fromLocator cannot be null!!");
                                        }
                                    } if (localManufactureCompanyTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "manufactureCompany"));
                                 
                                        if (localManufactureCompany != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localManufactureCompany));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("manufactureCompany cannot be null!!");
                                        }
                                    } if (localMaterialTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "material"));
                                 
                                        if (localMaterial != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaterial));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("material cannot be null!!");
                                        }
                                    } if (localOperateByTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "operateBy"));
                                 
                                        if (localOperateBy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOperateBy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("operateBy cannot be null!!");
                                        }
                                    } if (localOperateDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "operateDate"));
                                 
                                        if (localOperateDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOperateDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("operateDate cannot be null!!");
                                        }
                                    } if (localOrderNoTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "orderNo"));
                                 
                                        if (localOrderNo != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrderNo));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("orderNo cannot be null!!");
                                        }
                                    } if (localOrganizationCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "organizationCode"));
                                 
                                        if (localOrganizationCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrganizationCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("organizationCode cannot be null!!");
                                        }
                                    } if (localPartNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "partNumber"));
                                 
                                        if (localPartNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("partNumber cannot be null!!");
                                        }
                                    } if (localPlineNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "plineName"));
                                 
                                        if (localPlineName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlineName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("plineName cannot be null!!");
                                        }
                                    } if (localProductDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "productDate"));
                                 
                                        if (localProductDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("productDate cannot be null!!");
                                        }
                                    } if (localQuantityTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "quantity"));
                                 
                                        if (localQuantity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("quantity cannot be null!!");
                                        }
                                    } if (localRequisitionNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requisitionNumber"));
                                 
                                        if (localRequisitionNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequisitionNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requisitionNumber cannot be null!!");
                                        }
                                    } if (localSiteTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "site"));
                                 
                                        if (localSite != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSite));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("site cannot be null!!");
                                        }
                                    } if (localStorageNumberSourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "storageNumberSource"));
                                 
                                        if (localStorageNumberSource != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStorageNumberSource));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("storageNumberSource cannot be null!!");
                                        }
                                    } if (localStorageNumberTargetTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "storageNumberTarget"));
                                 
                                        if (localStorageNumberTarget != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStorageNumberTarget));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("storageNumberTarget cannot be null!!");
                                        }
                                    } if (localSupplierTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "supplier"));
                                 
                                        if (localSupplier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupplier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("supplier cannot be null!!");
                                        }
                                    } if (localToLocatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "toLocator"));
                                 
                                        if (localToLocator != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToLocator));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("toLocator cannot be null!!");
                                        }
                                    } if (localTrayNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "trayNumber"));
                                 
                                        if (localTrayNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrayNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("trayNumber cannot be null!!");
                                        }
                                    } if (localUnitTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "unit"));
                                 
                                        if (localUnit != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnit));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("unit cannot be null!!");
                                        }
                                    } if (localWarehousingDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "warehousingDate"));
                                 
                                        if (localWarehousingDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWarehousingDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("warehousingDate cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderObj parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderObj object =
                new StockOutputOrderObj();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"stockOutputOrderObj".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StockOutputOrderObj)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","area").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"area" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setArea(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute1" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute10").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute10" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute10(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute11").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute11" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute11(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute12").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute12" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute12(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute13").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute13" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute13(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute14").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute14" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute14(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute15").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute15" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute15(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute16").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute16" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute16(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute17").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute17" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute17(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute18").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute18" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute18(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute19").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute19" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute19(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute2" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute20").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute20" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute20(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute21").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute21" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute21(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute22").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute22" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute22(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute23").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute23" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute23(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute24").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute24" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute24(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute25").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute25" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute25(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute26").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute26" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute26(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute27").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute27" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute27(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute28").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute28" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute28(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute29").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute29" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute29(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute3").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute3" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute30").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute30" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute30(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute31").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute31" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute31(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute32").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute32" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute32(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute33").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute33" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute33(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute34").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute34" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute34(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute35").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute35" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute35(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute36").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute36" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute36(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute37").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute37" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute37(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute38").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute38" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute38(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute39").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute39" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute39(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute4").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute4" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute4(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute40").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute40" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute40(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute41").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute41" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute41(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute42").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute42" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute42(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute43").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute43" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute43(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute44").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute44" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute44(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute45").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute45" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute45(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute46").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute46" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute46(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute47").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute47" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute47(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute48").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute48" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute48(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute49").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute49" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute49(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute5").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute5" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute5(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute50").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute50" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute50(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute6").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute6" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute6(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute7").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute7" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute7(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute8").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute8" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute8(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribute9").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribute9" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttribute9(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","batch").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"batch" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setBatch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","boxNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"boxNumber" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setBoxNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","description").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"description" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fromLocator").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fromLocator" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFromLocator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","manufactureCompany").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"manufactureCompany" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setManufactureCompany(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","material").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"material" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setMaterial(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","operateBy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"operateBy" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOperateBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","operateDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"operateDate" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOperateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orderNo").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"orderNo" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrderNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","organizationCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"organizationCode" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrganizationCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","partNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"partNumber" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPartNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","plineName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"plineName" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPlineName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","productDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"productDate" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setProductDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","quantity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"quantity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requisitionNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requisitionNumber" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRequisitionNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","site").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"site" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSite(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","storageNumberSource").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"storageNumberSource" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setStorageNumberSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","storageNumberTarget").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"storageNumberTarget" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setStorageNumberTarget(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","supplier").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"supplier" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSupplier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","toLocator").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"toLocator" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setToLocator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","trayNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"trayNumber" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setTrayNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unit").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"unit" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setUnit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","warehousingDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"warehousingDate" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setWarehousingDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class StockOutputOrderHeaderObj
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = stockOutputOrderHeaderObj
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Attr1
                        */

                        
                                    protected String localAttr1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr1Tracker = false ;

                           public boolean isAttr1Specified(){
                               return localAttr1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr1(){
                               return localAttr1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr1
                               */
                               public void setAttr1(String param){
                            localAttr1Tracker = param != null;
                                   
                                            this.localAttr1=param;
                                    

                               }
                            

                        /**
                        * field for Attr2
                        */

                        
                                    protected String localAttr2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr2Tracker = false ;

                           public boolean isAttr2Specified(){
                               return localAttr2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr2(){
                               return localAttr2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr2
                               */
                               public void setAttr2(String param){
                            localAttr2Tracker = param != null;
                                   
                                            this.localAttr2=param;
                                    

                               }
                            

                        /**
                        * field for Attr3
                        */

                        
                                    protected String localAttr3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr3Tracker = false ;

                           public boolean isAttr3Specified(){
                               return localAttr3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr3(){
                               return localAttr3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr3
                               */
                               public void setAttr3(String param){
                            localAttr3Tracker = param != null;
                                   
                                            this.localAttr3=param;
                                    

                               }
                            

                        /**
                        * field for Attr4
                        */

                        
                                    protected String localAttr4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr4Tracker = false ;

                           public boolean isAttr4Specified(){
                               return localAttr4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr4(){
                               return localAttr4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr4
                               */
                               public void setAttr4(String param){
                            localAttr4Tracker = param != null;
                                   
                                            this.localAttr4=param;
                                    

                               }
                            

                        /**
                        * field for Attr5
                        */

                        
                                    protected String localAttr5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr5Tracker = false ;

                           public boolean isAttr5Specified(){
                               return localAttr5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr5(){
                               return localAttr5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr5
                               */
                               public void setAttr5(String param){
                            localAttr5Tracker = param != null;
                                   
                                            this.localAttr5=param;
                                    

                               }
                            

                        /**
                        * field for EditTime
                        */

                        
                                    protected String localEditTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEditTimeTracker = false ;

                           public boolean isEditTimeSpecified(){
                               return localEditTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEditTime(){
                               return localEditTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EditTime
                               */
                               public void setEditTime(String param){
                            localEditTimeTracker = param != null;
                                   
                                            this.localEditTime=param;
                                    

                               }
                            

                        /**
                        * field for OrgCode
                        */

                        
                                    protected String localOrgCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgCodeTracker = false ;

                           public boolean isOrgCodeSpecified(){
                               return localOrgCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOrgCode(){
                               return localOrgCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgCode
                               */
                               public void setOrgCode(String param){
                            localOrgCodeTracker = param != null;
                                   
                                            this.localOrgCode=param;
                                    

                               }
                            

                        /**
                        * field for RequisitionNumber
                        */

                        
                                    protected String localRequisitionNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequisitionNumberTracker = false ;

                           public boolean isRequisitionNumberSpecified(){
                               return localRequisitionNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRequisitionNumber(){
                               return localRequisitionNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequisitionNumber
                               */
                               public void setRequisitionNumber(String param){
                            localRequisitionNumberTracker = param != null;
                                   
                                            this.localRequisitionNumber=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":stockOutputOrderHeaderObj",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "stockOutputOrderHeaderObj",
                           xmlWriter);
                   }

               
                   }
                if (localAttr1Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr1", xmlWriter);
                             

                                          if (localAttr1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr2", xmlWriter);
                             

                                          if (localAttr2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr3Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr3", xmlWriter);
                             

                                          if (localAttr3==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr4Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr4", xmlWriter);
                             

                                          if (localAttr4==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr4 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr4);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr5Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr5", xmlWriter);
                             

                                          if (localAttr5==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr5 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr5);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEditTimeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "editTime", xmlWriter);
                             

                                          if (localEditTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("editTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEditTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgCodeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "orgCode", xmlWriter);
                             

                                          if (localOrgCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("orgCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequisitionNumberTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requisitionNumber", xmlWriter);
                             

                                          if (localRequisitionNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requisitionNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequisitionNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAttr1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr1"));
                                 
                                        if (localAttr1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                        }
                                    } if (localAttr2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr2"));
                                 
                                        if (localAttr2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                        }
                                    } if (localAttr3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr3"));
                                 
                                        if (localAttr3 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr3));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                        }
                                    } if (localAttr4Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr4"));
                                 
                                        if (localAttr4 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr4));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr4 cannot be null!!");
                                        }
                                    } if (localAttr5Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr5"));
                                 
                                        if (localAttr5 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr5));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr5 cannot be null!!");
                                        }
                                    } if (localEditTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "editTime"));
                                 
                                        if (localEditTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEditTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("editTime cannot be null!!");
                                        }
                                    } if (localOrgCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "orgCode"));
                                 
                                        if (localOrgCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("orgCode cannot be null!!");
                                        }
                                    } if (localRequisitionNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requisitionNumber"));
                                 
                                        if (localRequisitionNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequisitionNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requisitionNumber cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderHeaderObj parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderHeaderObj object =
                new StockOutputOrderHeaderObj();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"stockOutputOrderHeaderObj".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StockOutputOrderHeaderObj)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr1" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr2" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr3").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr3" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr4").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr4" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr4(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr5").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr5" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr5(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","editTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"editTime" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEditTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orgCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"orgCode" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrgCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requisitionNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requisitionNumber" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRequisitionNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ResultInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = resultInfo
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Name
                        */

                        
                                    protected String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(String param){
                            localNameTracker = param != null;
                                   
                                            this.localName=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":resultInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "resultInfo",
                           xmlWriter);
                   }

               
                   }
                if (localNameTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ResultInfo parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            ResultInfo object =
                new ResultInfo();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"resultInfo".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResultInfo)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"name" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class EsbInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = esbInfo
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Attr1
                        */

                        
                                    protected String localAttr1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr1Tracker = false ;

                           public boolean isAttr1Specified(){
                               return localAttr1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr1(){
                               return localAttr1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr1
                               */
                               public void setAttr1(String param){
                            localAttr1Tracker = param != null;
                                   
                                            this.localAttr1=param;
                                    

                               }
                            

                        /**
                        * field for Attr2
                        */

                        
                                    protected String localAttr2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr2Tracker = false ;

                           public boolean isAttr2Specified(){
                               return localAttr2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr2(){
                               return localAttr2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr2
                               */
                               public void setAttr2(String param){
                            localAttr2Tracker = param != null;
                                   
                                            this.localAttr2=param;
                                    

                               }
                            

                        /**
                        * field for Attr3
                        */

                        
                                    protected String localAttr3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr3Tracker = false ;

                           public boolean isAttr3Specified(){
                               return localAttr3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr3(){
                               return localAttr3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr3
                               */
                               public void setAttr3(String param){
                            localAttr3Tracker = param != null;
                                   
                                            this.localAttr3=param;
                                    

                               }
                            

                        /**
                        * field for InstId
                        */

                        
                                    protected String localInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInstIdTracker = false ;

                           public boolean isInstIdSpecified(){
                               return localInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getInstId(){
                               return localInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstId
                               */
                               public void setInstId(String param){
                            localInstIdTracker = param != null;
                                   
                                            this.localInstId=param;
                                    

                               }
                            

                        /**
                        * field for RequestTime
                        */

                        
                                    protected String localRequestTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestTimeTracker = false ;

                           public boolean isRequestTimeSpecified(){
                               return localRequestTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRequestTime(){
                               return localRequestTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestTime
                               */
                               public void setRequestTime(String param){
                            localRequestTimeTracker = param != null;
                                   
                                            this.localRequestTime=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":esbInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "esbInfo",
                           xmlWriter);
                   }

               
                   }
                if (localAttr1Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr1", xmlWriter);
                             

                                          if (localAttr1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr2", xmlWriter);
                             

                                          if (localAttr2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr3Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr3", xmlWriter);
                             

                                          if (localAttr3==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInstIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "instId", xmlWriter);
                             

                                          if (localInstId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestTimeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requestTime", xmlWriter);
                             

                                          if (localRequestTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAttr1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr1"));
                                 
                                        if (localAttr1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                        }
                                    } if (localAttr2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr2"));
                                 
                                        if (localAttr2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                        }
                                    } if (localAttr3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr3"));
                                 
                                        if (localAttr3 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr3));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                        }
                                    } if (localInstIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "instId"));
                                 
                                        if (localInstId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instId cannot be null!!");
                                        }
                                    } if (localRequestTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestTime"));
                                 
                                        if (localRequestTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestTime cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static EsbInfo parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            EsbInfo object =
                new EsbInfo();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"esbInfo".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EsbInfo)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr1" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr2" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr3").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr3" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","instId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"instId" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setInstId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestTime" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRequestTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class EsbInfoRes
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = esbInfoRes
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Attr1
                        */

                        
                                    protected String localAttr1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr1Tracker = false ;

                           public boolean isAttr1Specified(){
                               return localAttr1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr1(){
                               return localAttr1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr1
                               */
                               public void setAttr1(String param){
                            localAttr1Tracker = param != null;
                                   
                                            this.localAttr1=param;
                                    

                               }
                            

                        /**
                        * field for Attr2
                        */

                        
                                    protected String localAttr2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr2Tracker = false ;

                           public boolean isAttr2Specified(){
                               return localAttr2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr2(){
                               return localAttr2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr2
                               */
                               public void setAttr2(String param){
                            localAttr2Tracker = param != null;
                                   
                                            this.localAttr2=param;
                                    

                               }
                            

                        /**
                        * field for Attr3
                        */

                        
                                    protected String localAttr3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttr3Tracker = false ;

                           public boolean isAttr3Specified(){
                               return localAttr3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAttr3(){
                               return localAttr3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attr3
                               */
                               public void setAttr3(String param){
                            localAttr3Tracker = param != null;
                                   
                                            this.localAttr3=param;
                                    

                               }
                            

                        /**
                        * field for InstId
                        */

                        
                                    protected String localInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInstIdTracker = false ;

                           public boolean isInstIdSpecified(){
                               return localInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getInstId(){
                               return localInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstId
                               */
                               public void setInstId(String param){
                            localInstIdTracker = param != null;
                                   
                                            this.localInstId=param;
                                    

                               }
                            

                        /**
                        * field for RequestTime
                        */

                        
                                    protected String localRequestTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestTimeTracker = false ;

                           public boolean isRequestTimeSpecified(){
                               return localRequestTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRequestTime(){
                               return localRequestTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestTime
                               */
                               public void setRequestTime(String param){
                            localRequestTimeTracker = param != null;
                                   
                                            this.localRequestTime=param;
                                    

                               }
                            

                        /**
                        * field for ResponseTime
                        */

                        
                                    protected String localResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseTimeTracker = false ;

                           public boolean isResponseTimeSpecified(){
                               return localResponseTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getResponseTime(){
                               return localResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseTime
                               */
                               public void setResponseTime(String param){
                            localResponseTimeTracker = param != null;
                                   
                                            this.localResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for ReturnCode
                        */

                        
                                    protected String localReturnCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnCodeTracker = false ;

                           public boolean isReturnCodeSpecified(){
                               return localReturnCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getReturnCode(){
                               return localReturnCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCode
                               */
                               public void setReturnCode(String param){
                            localReturnCodeTracker = param != null;
                                   
                                            this.localReturnCode=param;
                                    

                               }
                            

                        /**
                        * field for ReturnMsg
                        */

                        
                                    protected String localReturnMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnMsgTracker = false ;

                           public boolean isReturnMsgSpecified(){
                               return localReturnMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getReturnMsg(){
                               return localReturnMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnMsg
                               */
                               public void setReturnMsg(String param){
                            localReturnMsgTracker = param != null;
                                   
                                            this.localReturnMsg=param;
                                    

                               }
                            

                        /**
                        * field for ReturnStatus
                        */

                        
                                    protected String localReturnStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnStatusTracker = false ;

                           public boolean isReturnStatusSpecified(){
                               return localReturnStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getReturnStatus(){
                               return localReturnStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnStatus
                               */
                               public void setReturnStatus(String param){
                            localReturnStatusTracker = param != null;
                                   
                                            this.localReturnStatus=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":esbInfoRes",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "esbInfoRes",
                           xmlWriter);
                   }

               
                   }
                if (localAttr1Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr1", xmlWriter);
                             

                                          if (localAttr1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr2", xmlWriter);
                             

                                          if (localAttr2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttr3Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "attr3", xmlWriter);
                             

                                          if (localAttr3==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttr3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInstIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "instId", xmlWriter);
                             

                                          if (localInstId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestTimeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requestTime", xmlWriter);
                             

                                          if (localRequestTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseTimeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "responseTime", xmlWriter);
                             

                                          if (localResponseTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("responseTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResponseTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnCodeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "returnCode", xmlWriter);
                             

                                          if (localReturnCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("returnCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnMsgTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "returnMsg", xmlWriter);
                             

                                          if (localReturnMsg==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("returnMsg cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnMsg);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnStatusTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "returnStatus", xmlWriter);
                             

                                          if (localReturnStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("returnStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAttr1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr1"));
                                 
                                        if (localAttr1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr1 cannot be null!!");
                                        }
                                    } if (localAttr2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr2"));
                                 
                                        if (localAttr2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr2 cannot be null!!");
                                        }
                                    } if (localAttr3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attr3"));
                                 
                                        if (localAttr3 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttr3));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("attr3 cannot be null!!");
                                        }
                                    } if (localInstIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "instId"));
                                 
                                        if (localInstId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instId cannot be null!!");
                                        }
                                    } if (localRequestTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestTime"));
                                 
                                        if (localRequestTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestTime cannot be null!!");
                                        }
                                    } if (localResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "responseTime"));
                                 
                                        if (localResponseTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("responseTime cannot be null!!");
                                        }
                                    } if (localReturnCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "returnCode"));
                                 
                                        if (localReturnCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("returnCode cannot be null!!");
                                        }
                                    } if (localReturnMsgTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "returnMsg"));
                                 
                                        if (localReturnMsg != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnMsg));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("returnMsg cannot be null!!");
                                        }
                                    } if (localReturnStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "returnStatus"));
                                 
                                        if (localReturnStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("returnStatus cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static EsbInfoRes parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            EsbInfoRes object =
                new EsbInfoRes();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"esbInfoRes".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EsbInfoRes)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr1" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr2" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attr3").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attr3" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAttr3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","instId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"instId" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setInstId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestTime" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRequestTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","responseTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"responseTime" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","returnCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"returnCode" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setReturnCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","returnMsg").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"returnMsg" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setReturnMsg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","returnStatus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"returnStatus" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setReturnStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class StockOutputOrderInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = stockOutputOrderInfo
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for EsbInfo
                        */

                        
                                    protected EsbInfo localEsbInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEsbInfoTracker = false ;

                           public boolean isEsbInfoSpecified(){
                               return localEsbInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return EsbInfo
                           */
                           public  EsbInfo getEsbInfo(){
                               return localEsbInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EsbInfo
                               */
                               public void setEsbInfo(EsbInfo param){
                            localEsbInfoTracker = param != null;
                                   
                                            this.localEsbInfo=param;
                                    

                               }
                            

                        /**
                        * field for RequestHeaderInfo
                        */

                        
                                    protected StockOutputOrderHeaderObj localRequestHeaderInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestHeaderInfoTracker = false ;

                           public boolean isRequestHeaderInfoSpecified(){
                               return localRequestHeaderInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return StockOutputOrderHeaderObj
                           */
                           public  StockOutputOrderHeaderObj getRequestHeaderInfo(){
                               return localRequestHeaderInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestHeaderInfo
                               */
                               public void setRequestHeaderInfo(StockOutputOrderHeaderObj param){
                            localRequestHeaderInfoTracker = param != null;
                                   
                                            this.localRequestHeaderInfo=param;
                                    

                               }
                            

                        /**
                        * field for RequestInfo
                        * This was an Array!
                        */

                        
                                    protected StockOutputOrderObj[] localRequestInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestInfoTracker = false ;

                           public boolean isRequestInfoSpecified(){
                               return localRequestInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return StockOutputOrderObj[]
                           */
                           public  StockOutputOrderObj[] getRequestInfo(){
                               return localRequestInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestInfo
                               */
                              protected void validateRequestInfo(StockOutputOrderObj[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestInfo
                              */
                              public void setRequestInfo(StockOutputOrderObj[] param){
                              
                                   validateRequestInfo(param);

                               localRequestInfoTracker = param != null;
                                      
                                      this.localRequestInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param StockOutputOrderObj
                             */
                             public void addRequestInfo(StockOutputOrderObj param){
                                   if (localRequestInfo == null){
                                   localRequestInfo = new StockOutputOrderObj[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestInfo);
                               list.add(param);
                               this.localRequestInfo =
                             (StockOutputOrderObj[])list.toArray(
                            new StockOutputOrderObj[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":stockOutputOrderInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "stockOutputOrderInfo",
                           xmlWriter);
                   }

               
                   }
                if (localEsbInfoTracker){
                                            if (localEsbInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("esbInfo cannot be null!!");
                                            }
                                           localEsbInfo.serialize(new javax.xml.namespace.QName("","esbInfo"),
                                               xmlWriter);
                                        } if (localRequestHeaderInfoTracker){
                                            if (localRequestHeaderInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("requestHeaderInfo cannot be null!!");
                                            }
                                           localRequestHeaderInfo.serialize(new javax.xml.namespace.QName("","requestHeaderInfo"),
                                               xmlWriter);
                                        } if (localRequestInfoTracker){
                                       if (localRequestInfo!=null){
                                            for (int i = 0;i < localRequestInfo.length;i++){
                                                if (localRequestInfo[i] != null){
                                                 localRequestInfo[i].serialize(new javax.xml.namespace.QName("","requestInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("requestInfo cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localEsbInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "esbInfo"));
                            
                            
                                    if (localEsbInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("esbInfo cannot be null!!");
                                    }
                                    elementList.add(localEsbInfo);
                                } if (localRequestHeaderInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestHeaderInfo"));
                            
                            
                                    if (localRequestHeaderInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("requestHeaderInfo cannot be null!!");
                                    }
                                    elementList.add(localRequestHeaderInfo);
                                } if (localRequestInfoTracker){
                             if (localRequestInfo!=null) {
                                 for (int i = 0;i < localRequestInfo.length;i++){

                                    if (localRequestInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "requestInfo"));
                                         elementList.add(localRequestInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("requestInfo cannot be null!!");
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderInfo parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderInfo object =
                new StockOutputOrderInfo();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"stockOutputOrderInfo".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StockOutputOrderInfo)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","esbInfo").equals(reader.getName())){
                                
                                                object.setEsbInfo(EsbInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestHeaderInfo").equals(reader.getName())){
                                
                                                object.setRequestHeaderInfo(StockOutputOrderHeaderObj.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(StockOutputOrderObj.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","requestInfo").equals(reader.getName())){
                                                                    list3.add(StockOutputOrderObj.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRequestInfo((StockOutputOrderObj[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                StockOutputOrderObj.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class StockOutputOrderInfoResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = stockOutputOrderInfoResponse
                Namespace URI = http://materialreturn.server.wms.service.webservice.longi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for StockOutputOrderInfo
                        */

                        
                                    protected ResponseBody localStockOutputOrderInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStockOutputOrderInfoTracker = false ;

                           public boolean isStockOutputOrderInfoSpecified(){
                               return localStockOutputOrderInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return ResponseBody
                           */
                           public  ResponseBody getStockOutputOrderInfo(){
                               return localStockOutputOrderInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StockOutputOrderInfo
                               */
                               public void setStockOutputOrderInfo(ResponseBody param){
                            localStockOutputOrderInfoTracker = param != null;
                                   
                                            this.localStockOutputOrderInfo=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://materialreturn.server.wms.service.webservice.longi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":stockOutputOrderInfoResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "stockOutputOrderInfoResponse",
                           xmlWriter);
                   }

               
                   }
                if (localStockOutputOrderInfoTracker){
                                            if (localStockOutputOrderInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("stockOutputOrderInfo cannot be null!!");
                                            }
                                           localStockOutputOrderInfo.serialize(new javax.xml.namespace.QName("","stockOutputOrderInfo"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localStockOutputOrderInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "stockOutputOrderInfo"));
                            
                            
                                    if (localStockOutputOrderInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("stockOutputOrderInfo cannot be null!!");
                                    }
                                    elementList.add(localStockOutputOrderInfo);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderInfoResponse parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderInfoResponse object =
                new StockOutputOrderInfoResponse();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"stockOutputOrderInfoResponse".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StockOutputOrderInfoResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","stockOutputOrderInfo").equals(reader.getName())){
                                
                                                object.setStockOutputOrderInfo(ResponseBody.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class StockOutputOrderInfoE
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://materialreturn.server.wms.service.webservice.longi.com/",
                "stockOutputOrderInfo",
                "ns1");

            

                        /**
                        * field for StockOutputOrderInfo
                        */

                        
                                    protected StockOutputOrderInfo localStockOutputOrderInfo ;
                                

                           /**
                           * Auto generated getter method
                           * @return StockOutputOrderInfo
                           */
                           public  StockOutputOrderInfo getStockOutputOrderInfo(){
                               return localStockOutputOrderInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StockOutputOrderInfo
                               */
                               public void setStockOutputOrderInfo(StockOutputOrderInfo param){
                            
                                            this.localStockOutputOrderInfo=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                
                //We can safely assume an element has only one type associated with it
                
                                 if (localStockOutputOrderInfo==null){
                                   throw new org.apache.axis2.databinding.ADBException("stockOutputOrderInfo cannot be null!");
                                 }
                                 localStockOutputOrderInfo.serialize(MY_QNAME,xmlWriter);
                            

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://materialreturn.server.wms.service.webservice.longi.com/")){
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
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
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                
                //We can safely assume an element has only one type associated with it
                return localStockOutputOrderInfo.getPullParser(MY_QNAME);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static StockOutputOrderInfoE parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            StockOutputOrderInfoE object =
                new StockOutputOrderInfoE();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://materialreturn.server.wms.service.webservice.longi.com/","stockOutputOrderInfo").equals(reader.getName())){
                                
                                                object.setStockOutputOrderInfo(StockOutputOrderInfo.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
            private  org.apache.axiom.om.OMElement  toOM(StockOutputOrderInfoE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(StockOutputOrderInfoE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(StockOutputOrderInfoResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(StockOutputOrderInfoResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, StockOutputOrderInfoE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(
                                                                    StockOutputOrderInfoE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  Object fromOM(
        org.apache.axiom.om.OMElement param,
        Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (StockOutputOrderInfoE.class.equals(type)){
                
                           return StockOutputOrderInfoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (StockOutputOrderInfoResponseE.class.equals(type)){
                
                           return StockOutputOrderInfoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   