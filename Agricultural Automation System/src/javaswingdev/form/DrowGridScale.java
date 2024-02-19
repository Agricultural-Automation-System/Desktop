
package javaswingdev.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javaswingdev.system.Sensable;

public class DrowGridScale extends JPanel implements Sensable {

    protected static final int ROWS = 15;
    protected static final int COLS = 1;
    protected static final int BOX_SIZE = 20;
   

    private short[] CLORE_R;
    private short[] CLORE_G;
    private short[] CLORE_B;

   


    public DrowGridScale(int index, int indexSubMenu) {
       
 
        switch (index) {

            case Sensable.PH:
                CLORE_R = PH_SCALE_R.clone();
                CLORE_G = PH_SCALE_G.clone();
                CLORE_B = PH_SCALE_B.clone();
                break;

            case Sensable.NPK:
                case Sensable.CROP:
                case Sensable.FOUR_IN_ONE:
                CLORE_R = NPK_SCALE_R.clone();
                CLORE_G = NPK_SCALE_G.clone();
                CLORE_B = NPK_SCALE_B.clone();
                break;
        }

        
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(COLS * BOX_SIZE, ROWS * BOX_SIZE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int xOffset = (getWidth() - (COLS * BOX_SIZE)) / 2;
        int yOffset = (getHeight() - (ROWS * BOX_SIZE)) / 2;

        // System.out.println("...");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                

                g2d.setColor(new Color( CLORE_R[row], CLORE_G[row], CLORE_B[row]));

                g2d.fillRect(xOffset + (col * BOX_SIZE),
                        yOffset + (row * BOX_SIZE),
                        BOX_SIZE, BOX_SIZE);
            }
        }
        g2d.dispose();
    }

}