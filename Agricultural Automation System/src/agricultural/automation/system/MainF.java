package agricultural.automation.system;

import java.awt.Component;
import javaswingdev.form.*;
import javaswingdev.menu.EventMenuSelected;
//import java.util.ArrayList;
//import java.util.List;
import javaswingdev.system.Sensable;
import java.awt.Desktop;
import java.net.URI;
import threads.Refreshing;
import API.APIFetcher;
import javax.swing.JOptionPane;

public class MainF extends javax.swing.JFrame implements Sensable {
    public static int index, indexSubMenu;
    private BodyGrid bodyGrid;
    public static MainF me;
   
    
    
    public MainF() {
        super("Agricultural Automation System");
        initComponents();

        init();
        Refreshing refreshing = new Refreshing(this);
        refreshing.start();
        me = this;
    }
    

    private void init() {

        menu.addEvent(new EventMenuSelected() {
            
            @Override
            public void menuSelected(int index, int indexSubMenu) {
         
                
                try {

                    switch (index) {
                        case Sensable.WATER_FLOW:
                            MainF.index = index;
                            MainF.indexSubMenu = indexSubMenu;
                            showForm(new BodyLineChart());
                           
                            break;
                        case Sensable.PH:
                        case Sensable.NPK:
                        case Sensable.FOUR_IN_ONE:
                             MainF.index = index;
                            MainF.indexSubMenu = indexSubMenu;
                            bodyGrid = new BodyGrid(index, indexSubMenu);
                            showForm(bodyGrid);

                           
                            break;
                        case Sensable.IRRIGATION:
                        case Sensable.FERTILIZER:
                        case Sensable.PEST:
                            if (APIFetcher.isFarmer()){
                             MainF.index = index;
                            MainF.indexSubMenu = indexSubMenu;
                            showForm(new BodyControl(index));
                            }else{
                                        JOptionPane.showMessageDialog(null, "you are oner the access is denied");

                            }
                           
                            break;
                        case Sensable.EMAIL:
                            Desktop.getDesktop().browse(new URI("mailto:abd0.humadna@gmail.com"));
                            break;
                        case Sensable.HELP:
                            Desktop.getDesktop().browse(new URI("http://www.google.com"));
                            break;
                        case Sensable.CROP:
                             MainF.index = index;
                            MainF.indexSubMenu = indexSubMenu;
                               showForm(new BodyCrop(index, indexSubMenu));
                            break;
                    }

                } catch (Exception e) {
                }
            }
        });
        menu.setSelectedIndex(0, 0);// set the defult mode
    }

    public void refresh() {
       

        try {

            switch (index) {
                case Sensable.WATER_FLOW:
                    showForm(new BodyLineChart());

                    break;
                case Sensable.PH:
                case Sensable.NPK:
                case Sensable.FOUR_IN_ONE:
                    bodyGrid.init(index, indexSubMenu);
                    break;

                default:
                    break;
            }

        } catch (Exception e) {
        }
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();

    }

   

    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainF().setVisible(true);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menuContainer = new javax.swing.JPanel();
        menu = new javaswingdev.menu.Menu();
        body = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menuContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuContainerLayout = new javax.swing.GroupLayout(menuContainer);
        menuContainer.setLayout(menuContainerLayout);
        menuContainerLayout.setHorizontalGroup(
                menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE));
        menuContainerLayout.setVerticalGroup(
                menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE));

        body.setBackground(new java.awt.Color(255, 0, 204));
        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)));
        backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(menuContainer, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 51));

        jMenu1.setText("File");

        jMenuItem1.setLabel("Extract");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javaswingdev.menu.Menu menu;
    private javax.swing.JPanel menuContainer;
    // End of variables declaration//GEN-END:variables
}
