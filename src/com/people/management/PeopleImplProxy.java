package com.people.management;

public class PeopleImplProxy implements com.people.management.PeopleImpl {
  private String _endpoint = null;
  private com.people.management.PeopleImpl peopleImpl = null;
  
  public PeopleImplProxy() {
    _initPeopleImplProxy();
  }
  
  public PeopleImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPeopleImplProxy();
  }
  
  private void _initPeopleImplProxy() {
    try {
      peopleImpl = (new com.people.management.PeopleImplServiceLocator()).getPeopleImpl();
      if (peopleImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)peopleImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)peopleImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (peopleImpl != null)
      ((javax.xml.rpc.Stub)peopleImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.people.management.PeopleImpl getPeopleImpl() {
    if (peopleImpl == null)
      _initPeopleImplProxy();
    return peopleImpl;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (peopleImpl == null)
      _initPeopleImplProxy();
    return peopleImpl.getName();
  }
  
  public void setName(java.lang.String name) throws java.rmi.RemoteException{
    if (peopleImpl == null)
      _initPeopleImplProxy();
    peopleImpl.setName(name);
  }
  
  public int getAge() throws java.rmi.RemoteException{
    if (peopleImpl == null)
      _initPeopleImplProxy();
    return peopleImpl.getAge();
  }
  
  public java.lang.String getGender() throws java.rmi.RemoteException{
    if (peopleImpl == null)
      _initPeopleImplProxy();
    return peopleImpl.getGender();
  }
  
  
}