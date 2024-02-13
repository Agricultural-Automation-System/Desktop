
package javaswingdev.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javaswingdev.system.Sensable;

public class DrowGridScale extends JPanel implements Sensable {

    protected static final int ROWS = 15;
    protected static final int COLS = 1;
    protected static final int BOX_SIZE = 20;
    protected static final int WIGHTNESS = 30;

    private short[] CLORE_R;
    private short[] CLORE_G;
    private short[] CLORE_B;

    private final List<Color> colors;

    public DrowGridScale(int index, int indexSubMenu) {
        int rand;
        int length = ROWS * COLS;

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

        colors = new ArrayList<>(length);
        int r, g, b;
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++) {
                rand = (int) (i) % 15;
                if (CLORE_R[rand] < 255 - WIGHTNESS)
                    r = (CLORE_R[rand] + WIGHTNESS);
                else
                    r = (CLORE_R[rand]);

                if (CLORE_G[rand] < 255 - WIGHTNESS)
                    g = (CLORE_G[rand] + WIGHTNESS);
                else
                    g = (CLORE_G[rand]);

                if (CLORE_B[rand] < 255 - WIGHTNESS)
                    b = (CLORE_B[rand] + WIGHTNESS);
                else
                    b = (CLORE_B[rand]);

                colors.add(new Color(r, g, b));
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
                int index = (row * COLS) + col;

                g2d.setColor(colors.get(index));
                g2d.fillRect(xOffset + (col * BOX_SIZE),
                        yOffset + (row * BOX_SIZE),
                        BOX_SIZE, BOX_SIZE);
            }
        }
        g2d.dispose();
    }

}