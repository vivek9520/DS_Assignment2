/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firealaramserver;





import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author mac
 */
public class FireAlaramServer {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
           
            FireRemoteImplememts implememts = new FireRemoteImplememts();
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("AlaramServer", new FireRemoteImplememts());
            System.out.println("Alaram Server ready");
            
            
            
            
            Timer timer = new Timer();
            int begin = 0;
            int timeInterval = 1000;
            timer.schedule(new TimerTask() {
                int counter = 0;
                     @Override
                    public void run() {
                         //call the method
                         
                         System.out.println(implememts.getSenList());
                         
                    counter++;
                    
                }
            }, begin, timeInterval);
            
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }
    
}
