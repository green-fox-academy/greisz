import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  
  static final int WIDTH = 640;
  static final int HEIGHT = 640;
  
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
    double root3 = Math.sqrt(3);
    int size = 300;
    int raster = size / 6;
    
    for (int i = 0; i < size / 2 + 1; i += raster) {
      graphics.drawLine(i, (int) (HEIGHT - i * root3), size - i, (int) (HEIGHT - i * root3));
      graphics.drawLine(i, (int) (HEIGHT - i * root3), 2 * i, HEIGHT);
      graphics.drawLine(2 * i, HEIGHT, size / 2 + i, (int) ((HEIGHT - (size / 2) * root3) + root3 * i));
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