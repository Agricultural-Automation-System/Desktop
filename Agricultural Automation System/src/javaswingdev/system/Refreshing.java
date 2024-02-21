
package javaswingdev.system;

import agricultural.automation.system.*;

/**
 * thread to refresh the data
 * @author AbdElrahman Humadna Allah
 */
public class Refreshing extends Thread  {
    private MainF  father;
 
    /**
     * set the main frame to br refresh 
     * @param father the frame
     */
   public  Refreshing(MainF  father){
       this.father = father;
      
   }
   
   @Override
   public void run(){
      while(true)
       try{
          
            father.refresh();
            Thread.sleep(5000);
           // System.out.println("hi");
       }catch(Exception e){
       
       }
  
   
   }
    
}
