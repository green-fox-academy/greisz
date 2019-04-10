
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)
    
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
  
    int numberOfStars = 200;
    
    int randomGrayValue = (int) (Math.random() * 256);
    Color randomGray = new Color(randomGrayValue,randomGrayValue, randomGrayValue);

  
    for (int i = 0; i < numberOfStars; i++) {
      int randomTop = (int) (Math.random() * HEIGHT + 1);
      int randomLeft = (int) (Math.random() * WIDTH + 1);
      int randomSize = (int) ((Math.random() * 3) + 1);
      graphics.setColor(randomGray);
      graphics.fillRect(randomLeft, randomTop, randomSize, randomSize);
    }
    
  }
  
  public
  
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