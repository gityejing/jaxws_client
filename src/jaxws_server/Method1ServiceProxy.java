package jaxws_server;

public class Method1ServiceProxy implements jaxws_server.Method1Service_PortType {
  private String _endpoint = null;
  private jaxws_server.Method1Service_PortType method1Service_PortType = null;
  
  public Method1ServiceProxy() {
    _initMethod1ServiceProxy();
  }
  
  public Method1ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMethod1ServiceProxy();
  }
  
  private void _initMethod1ServiceProxy() {
    try {
      method1Service_PortType = (new jaxws_server.Method1Service_ServiceLocator()).getMethod1Port();
      if (method1Service_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)method1Service_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)method1Service_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (method1Service_PortType != null)
      ((javax.xml.rpc.Stub)method1Service_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jaxws_server.Method1Service_PortType getMethod1Service_PortType() {
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType;
  }
  
  public int getCount2(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount2(arg0);
  }
  
  public int getCount6(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount6(arg0);
  }
  
  public int getCount(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount(arg0);
  }
  
  public int getCount3(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount3(arg0);
  }
  
  public int getCount1(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount1(arg0);
  }
  
  public int getCount4(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount4(arg0);
  }
  
  public int getCountX(int arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCountX(arg0);
  }
  
  public int getCount5(java.lang.String arg0) throws java.rmi.RemoteException{
    if (method1Service_PortType == null)
      _initMethod1ServiceProxy();
    return method1Service_PortType.getCount5(arg0);
  }
  
  
}