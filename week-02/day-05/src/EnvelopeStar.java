import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  
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
    
    graphics.setColor(Color.green);
    
    for (int i = 0; i < 16; i++) {
      graphics.drawLine(20 * i, 320, 320, 340 + 20 * i);
    }
    
    for (int i = 0; i < 16; i++) {
      graphics.drawLine(320, 20 * i, 320 + 20 * i, 320);
    }
    
      for (int i = 0; i < 16; i++) {
      graphics.drawLine(20 * i, 320, 320, 300 - 20 * i);
    }

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(320, 640 - 20 * i, 320 + 20 * i, 320);
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