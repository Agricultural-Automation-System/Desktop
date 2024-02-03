package javaswingdev.form;

import java.awt.Component;
import javaswingdev.menu.EventMenuSelected;

public class FormGrid extends javax.swing.JPanel {

    public FormGrid(int[][] PH,String name) {
        
        initComponents();
        init(PH);
       lb.setText("Form " + name);

    }

    private void init(int[][] PH) {
         

        showGrid(new Grid(PH));
        showScale(new Scale());

    }

    public void showGrid(Component com) {
        grid.removeAll();
        grid.add(com);
        grid.repaint();
        grid.revalidate();
    }

    public void showScale(Component com) {
        scale.removeAll();
        scale.add(com);
        scale.repaint();
        scale.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();
        scale = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(102, 102, 0));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0),
                new java.awt.Color(102, 102, 0)));
        grid.setLayout(new java.awt.BorderLayout());

        lb.setText("jLabel1");
        lb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        scale.setBackground(new java.awt.Color(255, 255, 255));
        scale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.lightGray,
                java.awt.Color.lightGray));
        scale.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb)
                                .addGap(445, 445, 445))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 720,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62,
                                        Short.MAX_VALUE)
                                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel lb;
    private javax.swing.JPanel scale;
    // End of variables declaration//GEN-END:variables
}
