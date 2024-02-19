package javaswingdev.form;


import java.awt.Component;
import API.APIFetcher;

public class BodyCrop extends javax.swing.JPanel {

  

    public BodyCrop(int index, int indexSubMenu) {

        initComponents();
        init(index, indexSubMenu);
            typeOfMaterialCompo.addItem("wheat");
            typeOfMaterialCompo.addItem("corn");
            typeOfMaterialCompo.addItem("barley");
    }

    public void init(int index, int indexSubMenu) {
        showWeather(new WeatherPresen());

        showGrid(new DrowGrid(typeOfMaterialCompo.getItemAt(0)));
        showScale(new ScaleBody(index, indexSubMenu));
        
                jLabel1.setText("The last amont of the crops");
             

        

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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        scale = new javax.swing.JPanel();
        weather = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        typeOfMaterialCompo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(102, 102, 0));
        grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        grid.setLayout(new java.awt.BorderLayout());

        scale.setBackground(new java.awt.Color(255, 255, 255));
        scale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.lightGray, java.awt.Color.lightGray));
        scale.setLayout(new java.awt.BorderLayout());

        weather.setBackground(new java.awt.Color(255, 255, 255));
        weather.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("jLabel1");

        typeOfMaterialCompo.setBackground(new java.awt.Color(51, 255, 51));
        typeOfMaterialCompo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        typeOfMaterialCompo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeOfMaterialCompoItemStateChanged(evt);
            }
        });

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(typeOfMaterialCompo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfMaterialCompo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfMaterialCompoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeOfMaterialCompoItemStateChanged
            showGrid(new DrowGrid( evt.getItem().toString() ));
     // TODO add your handling code here:
    }//GEN-LAST:event_typeOfMaterialCompoItemStateChanged

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_gridMouseClicked
       
                jLabel3.setText("the vale is " +  (14 - APIFetcher.dataGrid[evt.getY()][evt.getX()]) * 100 / 14 + " Ton");

    }// GEN-LAST:event_gridMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel scale;
    private javax.swing.JComboBox<String> typeOfMaterialCompo;
    private javax.swing.JPanel weather;
    // End of variables declaration//GEN-END:variables
}
