import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  
  static final int WIDTH = 320;
  static final int HEIGHT = 320;
  
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
    graphics.setColor(new Color(186,85,211));
    for (int i = 0; i < 16; i++) {
        graphics.drawLine(20 * i, 0, 320, 20 + 20 * i);
    }
    graphics.setColor(Color.green);
    for (int i = 0; i < 16; i++) {
      graphics.drawLine(0, 20 * i, 20 + +20 * i, 320);
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