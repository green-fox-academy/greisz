import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    
    int unitSize = HEIGHT / 8;
    int left = 0;
    int top = 0;
    for (int y = 0; y < 8; y++) {
      if (y % 2 == 0) {
        for (int x = 0; x < 4; x++) {
          drawCheckerboardWhite(unitSize * 2 * x, unitSize * y, graphics);
        }
      } else {
        left = unitSize;
        for (int x = 0; x < 4; x++) {
          drawCheckerboardWhite(unitSize * 2 * x + unitSize, unitSize * y, graphics);
        }
      }
      
    }
  }
  
  public static void drawCheckerboardWhite(int left, int top, Graphics g) {
    int unitSize = HEIGHT / 8;
    g.setColor(Color.WHITE);
    g.fillRect(left, top, unitSize, unitSize);
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
