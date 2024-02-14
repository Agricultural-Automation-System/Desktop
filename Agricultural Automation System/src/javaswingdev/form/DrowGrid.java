
package javaswingdev.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javaswingdev.system.Sensable;

public class DrowGrid extends JPanel implements Sensable {

    protected static int ROWS = 300;
    protected static int COLS = 720;
    protected static int BOX_SIZE = 1;
    
    private short[] CLORE_R;
    private short[] CLORE_G;
    private short[] CLORE_B;
    private int[][] Data;

    

    public DrowGrid(int[][] Data, int index, int indexSubMenu) {
        ROWS = Data.length;
        COLS = Data[0].length;
        this.Data= Data.clone();
        switch (index) {

            case Sensable.PH:
                CLORE_R = PH_SCALE_R.clone();
                CLORE_G = PH_SCALE_G.clone();
                CLORE_B = PH_SCALE_B.clone();
                break;

            case Sensable.NPK:
                case Sensable.FOUR_IN_ONE:
                CLORE_R = NPK_SCALE_R.clone();
                CLORE_G = NPK_SCALE_G.clone();
                CLORE_B = NPK_SCALE_B.clone();
                break;
           
        }
  
    }

    public DrowGrid(int[][] Data) {
        ROWS = Data.length;
        COLS = Data[0].length;
 this.Data= Data.clone();
        CLORE_R = PH_SCALE_R.clone();
        CLORE_G = PH_SCALE_G.clone();
        CLORE_B = PH_SCALE_B.clone();

        
    }

    public void setArr(int[][] Data) {
        ROWS = Data.length;
        COLS = Data[0].length;
 this.Data= Data.clone();
                repaint();
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
               
                g2d.setColor(new Color( CLORE_R[Data[row][col]], CLORE_G[Data[row][col]], CLORE_B[Data[row][col]]));
                g2d.fillRect(xOffset + (col * BOX_SIZE),
                        yOffset + (row * BOX_SIZE),
                        BOX_SIZE, BOX_SIZE);
            }
        }
        g2d.dispose();
    }

}