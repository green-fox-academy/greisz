import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
  
  static final int WIDTH = 729;
  static final int HEIGHT = 729;
  
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
  
  public static void mainDraw(Graphics graphics) {
    int size = HEIGHT;
    int left = 0;
    int top = 0;
    graphics.setColor(Color.yellow);
    graphics.fillRect(0,0, size, size);
    drawRecursiveSquares(left, top, size, graphics);
  }
  
  public static void drawRecursiveSquares(int left, int top, int size, Graphics graphics) {
    graphics.setColor(Color.black);
    if (size < 5) {
      graphics.drawRect(left, top, size, size);
    } else {
      graphics.drawRect(left, top, size, size);
      drawRecursiveSquares(left + size / 3, top, size / 3, graphics);
      drawRecursiveSquares(left, top + size / 3, size / 3, graphics);
      drawRecursiveSquares(left + 2 * size / 3, top + size / 3, size / 3, graphics);
      drawRecursiveSquares(left + size / 3, top + 2 * size / 3, size / 3, graphics);
    }
    
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}