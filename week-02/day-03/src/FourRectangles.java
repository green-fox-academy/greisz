import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  
  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    // avoid code duplication.
    
    int howMany = 4;
    
    for (int i = 0; i < howMany; i++) {
      int randomRed = (int) (Math.random() * 256);
      int randomGreen = (int) (Math.random() * 256);
      int randomBlue = (int) (Math.random() * 256);
      int randomTop = (int) (Math.random() * HEIGHT + 1);
      int randomLeft = (int) (Math.random() * WIDTH + 1);
      int randomSize = (int) ((Math.random() * 30) + 20);
      
      graphics.setColor(new Color(randomRed, randomGreen, randomBlue));
      graphics.fillRect(randomLeft, randomTop, randomSize, randomSize);
    }
    
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