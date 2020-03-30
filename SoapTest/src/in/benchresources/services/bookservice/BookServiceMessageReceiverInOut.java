
/**
 * BookServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package in.benchresources.services.bookservice;

        /**
        *  BookServiceMessageReceiverInOut message receiver
        */

        public class BookServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BookServiceSkeleton skel = (BookServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getBookByISDNRequestNumber".equals(methodName)){
                
                in.benchresources.entities.book.BookResponseType bookResponseType10 = null;
	                        in.benchresources.entities.book.BookRequestType wrappedParam =
                                                             (in.benchresources.entities.book.BookRequestType)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    in.benchresources.entities.book.BookRequestType.class);
                                                
                                               bookResponseType10 =
                                                   
                                                   
                                                         skel.getBookByISDNRequestNumber(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bookResponseType10, false,
                                                    new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookResponseType"));
                                    } else 

            if("getBookDetailsByBookName".equals(methodName)){
                
                in.benchresources.entities.book.BookResponseType bookResponseType12 = null;
	                        in.benchresources.entities.book.BookNameRequestType wrappedParam =
                                                             (in.benchresources.entities.book.BookNameRequestType)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    in.benchresources.entities.book.BookNameRequestType.class);
                                                
                                               bookResponseType12 =
                                                   
                                                   
                                                         skel.getBookDetailsByBookName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bookResponseType12, false,
                                                    new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookResponseType"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(in.benchresources.entities.book.BookRequestType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(in.benchresources.entities.book.BookRequestType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(in.benchresources.entities.book.BookResponseType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(in.benchresources.entities.book.BookResponseType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(in.benchresources.entities.book.BookNameRequestType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(in.benchresources.entities.book.BookNameRequestType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, in.benchresources.entities.book.BookResponseType param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(in.benchresources.entities.book.BookResponseType.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private in.benchresources.entities.book.BookResponseType wrapgetBookByISDNRequestNumber(){
                                in.benchresources.entities.book.BookResponseType wrappedElement = new in.benchresources.entities.book.BookResponseType();
                                return wrappedElement;
                         }
                    
                         private in.benchresources.entities.book.BookResponseType wrapgetBookDetailsByBookName(){
                                in.benchresources.entities.book.BookResponseType wrappedElement = new in.benchresources.entities.book.BookResponseType();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (in.benchresources.entities.book.BookNameRequestType.class.equals(type)){
                
                        return in.benchresources.entities.book.BookNameRequestType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (in.benchresources.entities.book.BookRequestType.class.equals(type)){
                
                        return in.benchresources.entities.book.BookRequestType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (in.benchresources.entities.book.BookResponseType.class.equals(type)){
                
                        return in.benchresources.entities.book.BookResponseType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    