
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // An array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    
    int[][] boxCoordinates = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] foxCoordinates = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    Color otters = new Color(7,126,37);
    
    drawPolygon(boxCoordinates, graphics);
    graphics.setColor(otters);
    drawPolygon(foxCoordinates, graphics);
  }
  
  public static void drawPolygon(int[][] points, Graphics g) {
    int[] xValues = new int[points.length];
    for (int i = 0 ; i < points.length; i++) {
      xValues[i] = points [i][0];
    }
    int[] yValues = new int[points.length];
    for (int i = 0 ; i < points.length; i++) {
      yValues[i] = points [i][1];
    }
    g.drawPolygon(xValues, yValues, points.length);
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