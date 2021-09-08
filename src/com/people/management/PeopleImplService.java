/**
 * PeopleImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.people.management;

public interface PeopleImplService extends javax.xml.rpc.Service {
    public java.lang.String getPeopleImplAddress();

    public com.people.management.PeopleImpl getPeopleImpl() throws javax.xml.rpc.ServiceException;

    public com.people.management.PeopleImpl getPeopleImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
