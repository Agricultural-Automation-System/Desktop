package javaswingdev.form;

import java.awt.Graphics;
import java.awt.Component;

public class BodyControl extends javax.swing.JPanel {
    private int edditColor;
    private int[][] water;
    private DrowGrid myGrid;

    public BodyControl(int type ) {
        initComponents();
        switch (type) {
            case 4:
                edditColor = 9;

                break;
            case 5:
                edditColor = 14;
                break;
            case 6:
                edditColor = 0;
                break;
            default:
                break;
        }

        water = new int[300][720];
        for (int i = 0; i < water.length; i++) {
            for (int j = 0; j < water[0].length; j++) {
                water[i][j] = 7;
            }

        }

        myGrid = new DrowGrid(water);
        showGrid(myGrid);
        if (edditColor == 14) {

            jComboBox2.addItem("Nitrogen fertilizers");
            jComboBox2.addItem("Inorganic fertilizers");
            jComboBox2.addItem("Phosphorus fertilizers");

        } else if (edditColor == 0) {

            jComboBox2.addItem("Pesticides");
            jComboBox2.addItem("Chemical pest control");
            jComboBox2.addItem("Biological pest control");

        }
       
    }

    private void buildWater(int x, int y) {
        for (int i = (y - 10); i < (y + 10); i++) {
            for (int j = (x - 10); j < (x + 10); j++) {
                try {
                    water[i][j] = edditColor;
                } catch (Exception e) {

                }

            }

        }

    }

    public void showGrid(Component com) {
        grid.removeAll();
        grid.add(com);
        grid.repaint();
        grid.revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        logButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(102, 102, 0));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        grid.setLayout(new java.awt.BorderLayout());

        logButton.setBackground(new java.awt.Color(51, 255, 51));
        logButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("Take Action");
        logButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logButtonMouseClicked(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(51, 255, 51));
        clearButton.setText("Cleare");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(51, 255, 51));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("Select the area where you want to issue an order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        logButton.getAccessibleContext().setAccessibleName("postAPI");
    }// </editor-fold>//GEN-END:initComponents

    private void logButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logButtonMouseClicked
        // todo post the arr to API
        clearButtonMouseClicked(evt);
    }// GEN-LAST:event_logButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_clearButtonMouseClicked
        water = new int[300][720];
        for (int i = 0; i < water.length; i++) {
            for (int j = 0; j < water[0].length; j++) {
                water[i][j] = 7;
            }

        }
        myGrid.setArr(water);
    }// GEN-LAST:event_clearButtonMouseClicked

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (edditColor == 9) {
            this.remove(jComboBox2);
            this.revalidate();
        }
    }

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_gridMouseClicked
        buildWater(evt.getX(), evt.getY());

        myGrid.setArr(water);
    }// GEN-LAST:event_gridMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel grid;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logButton;
    // End of variables declaration//GEN-END:variables
}
