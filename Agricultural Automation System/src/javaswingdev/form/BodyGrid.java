package javaswingdev.form;

import javaswingdev.system.Sensable;
import java.awt.Component;

public class BodyGrid extends javax.swing.JPanel {

    // private void upDate() {
    // // body.upDate();
    //
    // }

    public BodyGrid(int[][] Data, int index, int indexSubMenu) {

        initComponents();

        init(Data, index, indexSubMenu);
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
                    case Sensable.Moisture:
                        jLabel1.setText("Moisture percentage in the soil");
                        break;
                    case Sensable.Salinity:
                        jLabel1.setText("Salinity percentage in the soil");
                        break;
                    case Sensable.Temperature:
                        jLabel1.setText("Temperature of the soil");
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }

    }

    private void init(int[][] Data, int index, int indexSubMenu) {
        showWeather(new WeatherPresen());

        showGrid(new DrowGrid(Data, index, indexSubMenu));
        showScale(new ScaleBody(index, indexSubMenu));

    }

    public void showGrid(Component com) {
        grid.removeAll();
        grid.add(com);
        grid.repaint();
        grid.revalidate();
    }

    public void showWeather(Component com) {
        weather.removeAll();
        weather.add(com);
        weather.repaint();
        weather.revalidate();
    }

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        scale = new javax.swing.JPanel();
        weather = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(102, 102, 0));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        grid.setLayout(new java.awt.BorderLayout());

        scale.setBackground(new java.awt.Color(255, 255, 255));
        scale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.lightGray, java.awt.Color.lightGray));
        scale.setLayout(new java.awt.BorderLayout());

        weather.setBackground(new java.awt.Color(255, 255, 255));
        weather.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weather, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(weather, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel scale;
    private javax.swing.JPanel weather;
    // End of variables declaration//GEN-END:variables
}
