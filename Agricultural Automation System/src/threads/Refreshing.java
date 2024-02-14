
package threads;

import agricultural.automation.system.*;


public class Refreshing extends Thread  {
    private MainF  father;
 

   public  Refreshing(MainF  father){
       this.father = father;
      
   }
   
   @Override
   public void run(){
      while(true)
       try{
           Thread.sleep(1000);
            father.refresh();
           // System.out.println("hi");
       }catch(Exception e){
       
       }
  
   
   }
    
}
