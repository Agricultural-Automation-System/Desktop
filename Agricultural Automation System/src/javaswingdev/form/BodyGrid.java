package javaswingdev.form;

import javaswingdev.system.Sensable;
import java.awt.Component;
import java.awt.Color;
import API.APIFetcher;
/**
 * this the item or form used to present the sensors Data
 * @author AbdElrahman Humadna Allah
 */
public class BodyGrid extends javax.swing.JPanel {

    private static int index;
    private static int indexSubMenu;

    public BodyGrid(int index, int indexSubMenu) {

        this.indexSubMenu = indexSubMenu;
        this.index = index;

        initComponents();

        init(index, indexSubMenu);

    }
/**
 * select the sensor data to be presented  and set the battary value
 * @param index
 * @param indexSubMenu 
 */
    public void init(int index, int indexSubMenu) {
        showWeather(new WeatherPresen());

        showGrid(new DrawGrid(index, indexSubMenu));
        showScale(new ScaleBody(index, indexSubMenu));
        switch (index) {
            case Sensable.PH:
                jLabel1.setText("Potential of Hydrogen (PH)");
                break;
            case Sensable.NPK:
                switch (indexSubMenu) {
                    case Sensable.N:
                        jLabel1.setText("Nitrogen percentage in the soil");
                        break;
                    case Sensable.P:
                        jLabel1.setText("Phosphorus percentage in the soil");
                        break;
                    case Sensable.K:
                        jLabel1.setText("Potassium percentage in the soil");
                        break;

                    default:
                        break;
                }
                break;
            case Sensable.FOUR_IN_ONE:
                switch (indexSubMenu) {
                    case Sensable.EC:
                        jLabel1.setText("Soil electrical conductivity");
                        break;
                    case Sensable.MOISTURE:
                        jLabel1.setText("Moisture percentage in the soil");
                        break;
                    case Sensable.SALINITY:
                        jLabel1.setText("Salinity percentage in the soil");
                        break;
                    case Sensable.TEMPERATURE:
                        jLabel1.setText("Temperature of the soil");
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }

        int battary = APIFetcher.getBattary();
        jLabel2.setText("the battary charge is " + battary + "%");
        jProgressBar1.setValue(battary);
        if (battary < 15)
            jProgressBar1.setForeground(Color.RED);
        else if (battary < 20)
            jProgressBar1.setForeground(Color.YELLOW);
        else
            jProgressBar1.setForeground(Color.GREEN);

    }

   /**
     * delete the current Grid and insert the new Grid
     * @param com the selected form to be presented
     */
    public void showGrid(Component com) {
        grid.removeAll();
        grid.add(com);
        grid.repaint();
        grid.revalidate();
    }
/**
     * delete the current Weather and insert the new Weather
     * @param com the selected Weather to be presented
     */
    public void showWeather(Component com) {
        weather.removeAll();
        weather.add(com);
        weather.repaint();
        weather.revalidate();
    }
/**
     * delete the current Scale and insert the new Scale
     * @param com the selected Scale to be presented
     */
    public void showScale(Component com) {
        scale.removeAll();
        scale.add(com);
        scale.repaint();
        scale.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        scale = new javax.swing.JPanel();
        weather = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(102, 102, 0));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0),
                new java.awt.Color(102, 102, 0)));
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        grid.setLayout(new java.awt.BorderLayout());

        scale.setBackground(new java.awt.Color(255, 255, 255));
        scale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.lightGray,
                java.awt.Color.lightGray));
        scale.setLayout(new java.awt.BorderLayout());

        weather.setBackground(new java.awt.Color(255, 255, 255));
        weather.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 720,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 157,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weather, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(285, 285, 285)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(278, 278, 278)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(334, 334, 334)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(153, 153, 153)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(weather, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_gridMouseClicked
        switch (index) {
            case Sensable.PH:
                jLabel3.setText("the vale is " + APIFetcher.dataGrid[evt.getY()][evt.getX()] + " PH");

                break;
            case Sensable.NPK:
                jLabel3.setText(
                        "the vale is " + (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 2000 / 14 + " mg/kg");

                break;

            default:
                switch (indexSubMenu) {
                    case Sensable.EC:
                        jLabel3.setText("the vale is " + (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 2000 / 14  + " us/cm");

                        break;
                    case Sensable.MOISTURE:
                        jLabel3.setText("the vale is " + (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 100 / 14 + " %");

                        break;
                        case Sensable.SALINITY:
                        jLabel3.setText("the vale is " + (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 10000 / 14
                                + " ppm");

                        break;
                         case Sensable.TEMPERATURE:
                        jLabel3.setText("the vale is " + (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 100 / 14+ " C°");

                        break;

                    default:

                        break;
                }
                break;
        }
    }// GEN-LAST:event_gridMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel scale;
    private javax.swing.JPanel weather;
    // End of variables declaration//GEN-END:variables
}
