package org.jboss.narayana.performance.jts.service.first;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

public interface FirstEJB extends EJBObject {

    void execute() throws RemoteException;

}
