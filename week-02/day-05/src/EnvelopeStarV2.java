import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStarV2 {
  
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
    
    int size = HEIGHT;
    int raster = 20;
    graphics.setColor(Color.green);
    drawEnvelopeStar(size, raster, graphics);
  }
  
  public static void drawEnvelopeStar(int size, int raster, Graphics graphics) {
    int half = size /2;
    for (int i = 0; i < half; i += raster) {
      graphics.drawLine(i, half, half, half - raster - i);
      graphics.drawLine(half, i, half + i, half);
      graphics.drawLine(half, size - i, half + i, half);
      graphics.drawLine(i, half, half, half + raster + i);
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