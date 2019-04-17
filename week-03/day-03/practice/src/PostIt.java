import java.awt.*;

public class PostIt {
  Color backgroundcolor;
  String text;
  Color textcolor;
  
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt(Color.orange, "Idea 1", Color.blue);
    PostIt postIt2 = new PostIt(Color.pink, "Awesome", Color.black);
    PostIt postIt3 = new PostIt(Color.yellow, "Superb!", Color.green);
  }
  
  public PostIt(Color backgroundcolor, String text, Color textcolor) {
    this.backgroundcolor = backgroundcolor;
    this.text = text;
    this.textcolor = textcolor;
  }
}
