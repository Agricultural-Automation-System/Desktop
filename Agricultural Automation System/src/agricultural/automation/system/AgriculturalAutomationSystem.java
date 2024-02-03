/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agricultural.automation.system;

/**
 *
 * @author AbdElrahman
 */
public class AgriculturalAutomationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame f= new MainFrame();
                f.setVisible(true);
            }
        });
    }
    
}
