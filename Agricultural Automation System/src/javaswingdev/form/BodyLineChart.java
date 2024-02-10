package javaswingdev.form;

import java.awt.Color;
import java.awt.Component;
import java.util.*;
import javaswingdev.menu.EventMenuSelected;

public class BodyLineChart extends javax.swing.JPanel {
private double max;
    public BodyLineChart(int[][] PH,String name) {
        initComponents();
        init(PH);
       //lb.setText("Form " + name);

    }

    private void init(int[][] PH) {
        List<Integer> scores=new  ArrayList<Integer>() ;
       
        for(int i =0;i<30;i++){
        scores.add((int)(Math.random()*30));
        }
       max = (Collections.max(scores)+1)/10.0;
        showGrid(new DrowLinechart(scores));
        showWeather(new WeatherPresen());
        
        jLabel1.setText((int)(max*1)+"m/s");
        jLabel2.setText((int)(max*2)+"m/s");
        jLabel3.setText((int)(max*3)+"m/s");
        jLabel4.setText((int)(max*4)+"m/s");
        jLabel5.setText((int)(max*5)+"m/s");
        jLabel6.setText((int)(max*6)+"m/s");
        jLabel7.setText((int)(max*7)+"m/s");
        jLabel8.setText((int)(max*8)+"m/s");
        jLabel9.setText((int)(max*9)+"m/s");
        
        

    }

    public void showGrid(Component com) {
        grid1.removeAll();
        grid1.add(com);
        grid1.repaint();
        grid1.revalidate();
    }
    public void showWeather(Component com) {
        weather.removeAll();
        weather.add(com);
        weather.repaint();
        weather.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        grid1 = new javax.swing.JPanel();
        weather = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(255, 204, 204));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        grid.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(50, 248));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel1");

        jLabel3.setText("jLabel1");

        jLabel4.setText("jLabel1");

        jLabel5.setText("jLabel1");

        jLabel6.setText("jLabel1");

        jLabel7.setText("jLabel1");

        jLabel8.setText("jLabel1");

        jLabel9.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        grid.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLabel10.setText("23 Feb 2024");

        jLabel11.setText("23 Feb 2024");

        jLabel12.setText("23 Feb 2024");

        jLabel13.setText("23 Feb 2024");

        jLabel14.setText("23 Feb 2024");

        jLabel15.setText("23 Feb 2024");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(84, 84, 84)
                .addComponent(jLabel11)
                .addGap(84, 84, 84)
                .addComponent(jLabel12)
                .addGap(84, 84, 84)
                .addComponent(jLabel13)
                .addGap(84, 84, 84)
                .addComponent(jLabel14)
                .addGap(84, 84, 84)
                .addComponent(jLabel15)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        grid.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        grid1.setLayout(new java.awt.BorderLayout());
        grid.add(grid1, java.awt.BorderLayout.CENTER);

        weather.setBackground(new java.awt.Color(255, 255, 255));
        weather.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weather, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weather, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JPanel grid1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel weather;
    // End of variables declaration//GEN-END:variables
}
