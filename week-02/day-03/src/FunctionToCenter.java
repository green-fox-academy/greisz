
import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int left = 0;
    int top = 0;
    int raster = 20;
    
    for (int x = 0; x < WIDTH + 1; x = x + raster) {
      lineToCenter(x, 0, graphics);
    }
    for (int x = 0; x < WIDTH + 1; x = x + raster) {
      lineToCenter(x, HEIGHT, graphics);
    }
    for (int y = raster; y < HEIGHT; y = y + raster) {
      lineToCenter(0, y, graphics);
    }
    for (int y = raster; y < HEIGHT; y = y + raster) {
      lineToCenter(WIDTH, y, graphics);
    }
    
  }
  
  public static void lineToCenter(int left, int top, Graphics g) {
    g.drawLine(left, top, WIDTH / 2, HEIGHT / 2);
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