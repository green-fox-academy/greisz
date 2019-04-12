import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Enter a word: ");
    String originalText = "axxz";
    String newText = changeXesToYs(originalText);
    System.out.println(newText);
  }
  
  public static String changeXesToYs(String originalText) {
    if (originalText.length() == 1) {
      if (originalText.equals("x")) {
        return "y";
      }else {
        return originalText;
      }
    } else if (originalText.substring(0,1).equals("x")) {
      return "y" + changeXesToYs(originalText.substring(1));
    } else {
      return originalText.substring(0,1) + changeXesToYs(originalText.substring(1)) ;
    }
  }
}