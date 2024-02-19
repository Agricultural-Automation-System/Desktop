
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
          
            father.refresh();
            Thread.sleep(5000);
           // System.out.println("hi");
       }catch(Exception e){
       
       }
  
   
   }
    
}
