
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    int position = 10;
    int numberOfSquares = 6;
    int sizeOfSquares = 10;
    double sizeMultiplyer = 1.5;
  
    for (int i = 0; i < numberOfSquares; i++) {
      purpleSquares(position, sizeOfSquares, graphics);
      position = position + sizeOfSquares;
      double newsize = sizeOfSquares * sizeMultiplyer;
      sizeOfSquares = (int) newsize;
    }
  }
  
  public static void purpleSquares(int position, int size, Graphics g) {
    g.setColor(new Color(177, 69, 234));
    g.fillRect(position, position, size, size);
  }
  
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}