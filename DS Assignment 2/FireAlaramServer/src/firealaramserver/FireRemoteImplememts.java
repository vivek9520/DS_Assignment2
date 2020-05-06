/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firealaramserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class FireRemoteImplememts extends UnicastRemoteObject implements FireRemoteInterface{
    
    ArrayList<Object> senList = new ArrayList<>();
    
    public FireRemoteImplememts() throws RemoteException{
        super();
    }

    @Override
    public boolean login(int userID, int password) {
        try {
            if (userID == 1234 && password == 1234) {
            
            return true;
        }
       
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return false;
        
    }

    @Override
    public void setSenseorArray(ArrayList list) throws RemoteException {
            senList = list;
    }
    
    public List getSenList(){
        return  senList;
    }
         
    
}


