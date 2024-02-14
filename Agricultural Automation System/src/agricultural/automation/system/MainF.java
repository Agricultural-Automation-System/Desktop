package agricultural.automation.system;

import java.awt.Component;
import javaswingdev.form.*;
import javaswingdev.menu.EventMenuSelected;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.system.Sensable;
import java.awt.Desktop;
import java.net.URI;


public class MainF extends javax.swing.JFrame implements Sensable {

    public MainF(String authentication) {
        super("Agricultural Automation System");
        initComponents();
        init();
    }

    private void init() {

        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {

                List<Integer> scores = new ArrayList<Integer>();

                try {
                    switch (index) {
                        case Sensable.WATER_FLOW:
                            showForm(new BodyLineChart(scores, 20));

                            break;
                        case Sensable.PH:
                        case Sensable.NPK:
                        case Sensable.FOUR_IN_ONE:
                            showForm(new BodyGrid(fetchDataFromAPI(index, indexSubMenu), index, indexSubMenu));
                            break;
                            
                        case Sensable.IRRIGATION:
                        case Sensable.FERTILIZER:
                        case Sensable.PEST:
                            showForm(new BodyControl(index,getFromAPIBattary()));
                            break;
                         case Sensable.EMAIL:
                           Desktop.getDesktop().browse(new URI("mailto:abd0.humadna@gmail.com"));
                            break; 
                         case Sensable.HELP:
                           Desktop.getDesktop().browse(new URI("http://www.google.com"));
                            break;
                        default:
                            break;
                    }

                } catch (Exception e) {
                }
            }
        });
        menu.setSelectedIndex(0, 0);// set the defult mode
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();

    }

    private int[][] fetchDataFromAPI(int index, int indexSubMenu) {

        int[][] Data = new int[300][720];
        // return from API
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[0].length; j++) {
                Data[i][j] = (int) (Math.random() * 14);
            }

        }

        return Data;

    }
private int getFromAPIBattary(){
    //todo get from API
return (int)(Math.random()*100); 
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainF("00000").setVisible(true);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );
        menuContainerLayout.setVerticalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        body.setBackground(new java.awt.Color(255, 0, 204));
        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menuContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
