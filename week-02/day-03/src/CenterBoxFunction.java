import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
  
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameter:
    // the square size and the graphics
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.
    
    int size = 50;
    for (int i = 0; i < 3; i++) {
      drawCenteredSquare(size, graphics);
      size += 30;
    }
    
  }
  public static void drawCenteredSquare(int size, Graphics g) {
    int squareOffset = size /2;
    int centerTop = HEIGHT / 2;
    int centerLeft = WIDTH /2;
    g.drawRect(centerLeft - squareOffset, centerTop - squareOffset, size, size);
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