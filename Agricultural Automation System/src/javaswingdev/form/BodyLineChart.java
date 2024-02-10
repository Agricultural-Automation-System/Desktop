package javaswingdev.form;

import java.awt.Color;
import java.awt.Component;
import java.util.*;
import javaswingdev.menu.EventMenuSelected;

public class BodyLineChart extends javax.swing.JPanel {

    public BodyLineChart(int[][] PH,String name) {
        
        initComponents();
        init(PH);
       //lb.setText("Form " + name);

    }

    private void init(int[][] PH) {
        List<Integer> scores=new  ArrayList<Integer>() ;
        
        for(int i =0;i<100;i++){
        scores.add(i);
        }
       
        showGrid(new DrowLinechart(scores));
        showWeather(new WeatherPresen());

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
        jPanel2 = new javax.swing.JPanel();
        grid1 = new javax.swing.JPanel();
        weather = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(255, 204, 204));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        grid.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        grid.add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(grid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(weather, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weather, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JPanel grid1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel weather;
    // End of variables declaration//GEN-END:variables
}
