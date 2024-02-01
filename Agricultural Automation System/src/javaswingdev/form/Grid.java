
package javaswingdev.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class Grid extends JPanel {

        protected static final int ROWS = 720;
        protected static final int COLS = 300;
        protected static final int BOX_SIZE = 10;

        private List<Color> colors;

        public Grid() {
            int rand;
            int length = ROWS * COLS;
            colors = new ArrayList<>(length);
            for (int i = 0; i < ROWS; i++)
                for (int j = 0; j < COLS; j++) {
                    rand= (int) (Math.random() * 255);
                    int r = (int) (255);
                    int g = (int) ( rand);
                    int b = (int) ( rand);
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

            System.out.println("...");
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