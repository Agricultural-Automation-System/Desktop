
package javaswingdev.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javaswingdev.system.Sensable;
import API.APIFetcher;

/**
 * draw the grid by 2D array
 * @author AbdElrahman Humadna Allah 
 */
public class DrawGrid extends JPanel implements Sensable {

    protected static int ROWS = 300;
    protected static int COLS = 720;
    protected static int BOX_SIZE = 1;
    
    private short[] CLORE_R;
    private short[] CLORE_G;
    private short[] CLORE_B;
    private int[][] Data;

 /**
  * constructor to set the 2D array and select the mode color 
* @param index - number of the item in the menu
 * @param indexSubMenu number of the  subitem in the menu
 */
    public DrawGrid( int index, int indexSubMenu) {
        
        int[][] Data = APIFetcher.getDataGrid(index,indexSubMenu);
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
                case Sensable.CROP:
                CLORE_R = NPK_SCALE_R.clone();
                CLORE_G = NPK_SCALE_G.clone();
                CLORE_B = NPK_SCALE_B.clone();
                break;
           
        }
  
    }
    
    /**
     * constructor to set the 2D array and select the mode color for crop
     * @param TypeCrop 
     */
    public DrawGrid(  String TypeCrop) {
        
        int[][] Data = APIFetcher.getDataGrid( TypeCrop);
        ROWS = Data.length;
        COLS = Data[0].length;
        this.Data= Data.clone();
        
                CLORE_R = NPK_SCALE_R.clone();
                CLORE_G = NPK_SCALE_G.clone();
                CLORE_B = NPK_SCALE_B.clone();
               
           
        
  
    }
 /**
  * constructor to update the data grid for control body
  * @param Data - the new data
  */
    public DrawGrid(int[][] Data) {
        ROWS = Data.length;
        COLS = Data[0].length;
        this.Data= Data.clone();
        CLORE_R = PH_SCALE_R.clone();
        CLORE_G = PH_SCALE_G.clone();
        CLORE_B = PH_SCALE_B.clone();

        
    }
/**
  * function to update the data grid refreshing data sensors
  * @param Data - the new data
  */
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
/**
 * paint the 2D array
 * @param g the current graphics
 */
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