/**
 * Method1Service_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxws_server;

public class Method1Service_ServiceLocator extends org.apache.axis.client.Service implements jaxws_server.Method1Service_Service {

    public Method1Service_ServiceLocator() {
    }


    public Method1Service_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Method1Service_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Method1Port
    private java.lang.String Method1Port_address = "http://localhost:8081/aswebservice";

    public java.lang.String getMethod1PortAddress() {
        return Method1Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Method1PortWSDDServiceName = "Method1Port";

    public java.lang.String getMethod1PortWSDDServiceName() {
        return Method1PortWSDDServiceName;
    }

    public void setMethod1PortWSDDServiceName(java.lang.String name) {
        Method1PortWSDDServiceName = name;
    }

    public jaxws_server.Method1Service_PortType getMethod1Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Method1Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMethod1Port(endpoint);
    }

    public jaxws_server.Method1Service_PortType getMethod1Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jaxws_server.Method1PortBindingStub _stub = new jaxws_server.Method1PortBindingStub(portAddress, this);
            _stub.setPortName(getMethod1PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMethod1PortEndpointAddress(java.lang.String address) {
        Method1Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jaxws_server.Method1Service_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                jaxws_server.Method1PortBindingStub _stub = new jaxws_server.Method1PortBindingStub(new java.net.URL(Method1Port_address), this);
                _stub.setPortName(getMethod1PortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Method1Port".equals(inputPortName)) {
            return getMethod1Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxws_server/", "Method1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxws_server/", "Method1Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Method1Port".equals(portName)) {
            setMethod1PortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
