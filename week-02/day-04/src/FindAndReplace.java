import java.util.Scanner;

public class FindAndReplace {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Enter a word: ");
    String originalText = "x Some test stuff xXx yyyy xxx";
    //System.out.println("Enter what to replace: ");
    String changeThis = "x";
    //System.out.println("Enter new value: ");
    String newValue = "y";
    int counter = 0;
    String newText = changeCharacters(originalText, changeThis, newValue, counter);
    System.out.println(newText);
  }
  
  public static String changeCharacters(String originalText, String changeThis, String newValue, int counter) {
    //int length = changeThis.length() - 1;
    if (counter == (originalText.length() - 1)) {
      
      if ((originalText.substring(counter)).equals(changeThis)) {
        return newValue;
      } else {
        return (originalText.substring(counter));
      }
      
    } else if ((originalText.substring(counter, counter)).equals(changeThis)) {
      return newValue + (changeCharacters(originalText.substring(counter, counter), changeThis, newValue, counter +1 ));
    } else {
      return originalText.substring(counter, counter) + changeCharacters(originalText.substring(counter, counter), changeThis, newValue, counter + 1);
    }
  }
}
