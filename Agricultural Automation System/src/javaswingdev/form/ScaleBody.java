package javaswingdev.form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javaswingdev.system.Sensable;

public class ScaleBody extends javax.swing.JPanel {

    public ScaleBody(int index, int indexSubMenu) {

        initComponents();
        init(index, indexSubMenu);

    }

    private void init(int index, int indexSubMenu) {

        showGridScale(new DrowGridScale(index, indexSubMenu));
        if (index == Sensable.NPK) {
            Sc1.setText("0      - 133.33 mg/kg");
            Sc2.setText("133.33 - 266.67 mg/kg");
            Sc3.setText("266.67 - 400 mg/kg   ");
            Sc4.setText("400    - 533.33 mg/kg");
            Sc5.setText("533.33 - 666.67 mg/kg");
            Sc6.setText("666.67 - 800 mg/kg   ");
            Sc7.setText("800    - 933.33 mg/kg");
            Sc8.setText("933.33 - 1066.6 mg/kg");
            Sc9.setText("1066.67- 1200 mg/kg  ");
            Sc10.setText("1200  - 1333.3 mg/kg");
            Sc11.setText("1333.3- 1466.6 mg/kg");
            Sc12.setText("1466.6- 1600   mg/kg");
            Sc13.setText("1600  - 1733.3 mg/kg");
            Sc14.setText("1733.3- 1866.6 mg/kg");
            Sc15.setText("1866.6- 2000   mg/kg");

        } else if (index == Sensable.FOUR_IN_ONE && indexSubMenu == Sensable.EC) {
            Sc1.setText("0      - 133.33 us/cm");
            Sc2.setText("133.33 - 266.67 us/cm");
            Sc3.setText("266.67 - 400 us/cm   ");
            Sc4.setText("400    - 533.33 us/cm");
            Sc5.setText("533.33 - 666.67 us/cm");
            Sc6.setText("666.67 - 800 us/cm  ");
            Sc7.setText("800    - 933.33 us/cm");
            Sc8.setText("933.33 - 1066.6 us/cm");
            Sc9.setText("1066.67- 1200 us/cm  ");
            Sc10.setText("1200  - 1333.3 us/cm");
            Sc11.setText("1333.3- 1466.6 us/cm");
            Sc12.setText("1466.6- 1600   us/cm");
            Sc13.setText("1600  - 1733.3 us/cm");
            Sc14.setText("1733.3- 1866.6 us/cm");
            Sc15.setText("1866.6- 2000  us/cm");

        } else if (index == Sensable.FOUR_IN_ONE && indexSubMenu == Sensable.SALINITY) {
            Sc1.setText("0    -  666.7 ppm");
            Sc2.setText("666.7 - 1333.3 ppm");
            Sc3.setText("1333.3 - 2000 ppm   ");
            Sc4.setText("2000    - 2666.7 ppm");
            Sc5.setText("2666.7 - 3333.3 ppm");
            Sc6.setText("3333.3 - 4000 ppm  ");
            Sc7.setText("4000    - 4666.7 ppm");
            Sc8.setText("4666.7 - 5333.3 ppm");
            Sc9.setText("5333.3- 6000 ppm  ");
            Sc10.setText("6000  - 6666.7 ppm");
            Sc11.setText("6666.7- 7333.3 ppm");
            Sc12.setText("7333.3- 8000   ppm");
            Sc13.setText("8000  - 8666.6 ppm");
            Sc14.setText("8666.6- 9333.3 ppm");
            Sc15.setText("9333.3 - 10000  ppm");

        } else if (index == Sensable.FOUR_IN_ONE && indexSubMenu == Sensable.MOISTURE) {
            Sc1.setText("0    -  6.667 %");
            Sc2.setText("6.667 - 13.333 %");
            Sc3.setText("13.333 - 20 %   ");
            Sc4.setText("20    - 26.667 %");
            Sc5.setText("26.667 - 33.333 %");
            Sc6.setText("33.333 - 40 %  ");
            Sc7.setText("40    - 46.667 %");
            Sc8.setText("46.667 - 53.333 %");
            Sc9.setText("53.333- 60 %  ");
            Sc10.setText("60  - 66.667 %");
            Sc11.setText("66.667- 73.333 %");
            Sc12.setText("73.333- 80   %");
            Sc13.setText("80  - 86.66 %");
            Sc14.setText("86.66- 93.33 %");
            Sc15.setText("93.33 - 100  %");

        } else if (index == Sensable.FOUR_IN_ONE && indexSubMenu == Sensable.TEMPERATURE) {
            Sc1.setText("0    -  6.667 C° ");
            Sc2.setText("6.667 - 13.333 C° ");
            Sc3.setText("13.333 - 20 C°    ");
            Sc4.setText("20    - 26.667 C° ");
            Sc5.setText("26.667 - 33.333 C° ");
            Sc6.setText("33.333 - 40 C°   ");
            Sc7.setText("40    - 46.667 C° ");
            Sc8.setText("46.667 - 53.333 C° ");
            Sc9.setText("53.333- 60 C°   ");
            Sc10.setText("60  - 66.667 C° ");
            Sc11.setText("66.667- 73.333 C° ");
            Sc12.setText("73.333- 80   C° ");
            Sc13.setText("80  - 86.66 C° ");
            Sc14.setText("86.66- 93.33 C° ");
            Sc15.setText("93.33 - 100  C° ");

        }

    }

    public void showGridScale(Component com) {
        gridScale.removeAll();
        gridScale.add(com);
        gridScale.repaint();
        gridScale.revalidate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i = 1; i < 15; i++)
            g.drawLine(0, i * 20 - 2, getWidth(), i * 20 - 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridScale = new javax.swing.JPanel();
        Sc14 = new javax.swing.JLabel();
        Sc15 = new javax.swing.JLabel();
        Sc13 = new javax.swing.JLabel();
        Sc12 = new javax.swing.JLabel();
        Sc11 = new javax.swing.JLabel();
        Sc10 = new javax.swing.JLabel();
        Sc5 = new javax.swing.JLabel();
        Sc4 = new javax.swing.JLabel();
        Sc6 = new javax.swing.JLabel();
        Sc7 = new javax.swing.JLabel();
        Sc8 = new javax.swing.JLabel();
        Sc9 = new javax.swing.JLabel();
        Sc1 = new javax.swing.JLabel();
        Sc2 = new javax.swing.JLabel();
        Sc3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        gridScale.setBackground(new java.awt.Color(255, 255, 255));
        gridScale.setLayout(new java.awt.BorderLayout());

        Sc14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc14.setText("PH = 1");

        Sc15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc15.setText("PH = 0");

        Sc13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc13.setText("PH = 2");

        Sc12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc12.setText("PH = 3");

        Sc11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc11.setText("PH = 4");

        Sc10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc10.setText("PH = 5");

        Sc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc5.setText("PH = 10");

        Sc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc4.setText("PH = 11");

        Sc6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc6.setText("PH = 9");

        Sc7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc7.setText("PH = 8");

        Sc8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc8.setText("PH = 7");

        Sc9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc9.setText("PH = 6");

        Sc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc1.setText("PH = 14");

        Sc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc2.setText("PH = 13");

        Sc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sc3.setText("PH = 12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Sc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sc4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(gridScale, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Sc15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(gridScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sc1;
    private javax.swing.JLabel Sc10;
    private javax.swing.JLabel Sc11;
    private javax.swing.JLabel Sc12;
    private javax.swing.JLabel Sc13;
    private javax.swing.JLabel Sc14;
    private javax.swing.JLabel Sc15;
    private javax.swing.JLabel Sc2;
    private javax.swing.JLabel Sc3;
    private javax.swing.JLabel Sc4;
    private javax.swing.JLabel Sc5;
    private javax.swing.JLabel Sc6;
    private javax.swing.JLabel Sc7;
    private javax.swing.JLabel Sc8;
    private javax.swing.JLabel Sc9;
    private javax.swing.JPanel gridScale;
    // End of variables declaration//GEN-END:variables
}
