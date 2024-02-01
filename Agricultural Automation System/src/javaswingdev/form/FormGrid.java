package javaswingdev.form;


import java.awt.Component;
import javaswingdev.menu.EventMenuSelected;


public class FormGrid extends javax.swing.JPanel {

    public FormGrid(String name) {
        initComponents();
        init();
        lb.setText("Form " + name);
       
    }
    
    private void init() {
                    showForm(new Grid() );
              
    }
    
    
     
    public void showForm(Component com) {
        grid.removeAll();
        grid.add(com);
        grid.repaint();
        grid.revalidate();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setEnabled(false);
        grid.setOpaque(false);
        grid.setLayout(new java.awt.BorderLayout());

        lb.setText("jLabel1");
        lb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb)
                        .addGap(445, 445, 445))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
