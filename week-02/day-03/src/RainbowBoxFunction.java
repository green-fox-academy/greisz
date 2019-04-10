
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
    
    Color[] rainbowColors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE};
    int size = HEIGHT;
    int sizeJump = 40;
    
    for (int i = rainbowColors.length - 1; i > -1; i--){
      Color currentColor = rainbowColors[i];
      drawColoredSquare(size, currentColor, graphics);
      size -= sizeJump;
    }
  }
  
  public static void drawColoredSquare(int size, Color fillColor, Graphics g){
    int squareOffset = size /2;
    int centerTop = HEIGHT / 2;
    int centerLeft = WIDTH /2;
    g.setColor(fillColor);
    g.fillRect(centerLeft - squareOffset, centerTop - squareOffset, size, size);
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