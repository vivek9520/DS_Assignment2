/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firealaramserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public interface FireRemoteInterface extends Remote{
    
    public boolean login(int userID , int password) throws RemoteException;
    public void setSenseorArray(ArrayList list) throws RemoteException;
    
}
