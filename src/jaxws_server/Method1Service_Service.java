/**
 * Method1Service_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxws_server;

public interface Method1Service_Service extends javax.xml.rpc.Service {
    public java.lang.String getMethod1PortAddress();

    public jaxws_server.Method1Service_PortType getMethod1Port() throws javax.xml.rpc.ServiceException;

    public jaxws_server.Method1Service_PortType getMethod1Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
