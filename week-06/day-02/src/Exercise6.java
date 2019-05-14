import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isUpperCase;

public class Exercise6 {
  public static void main(String[] args) {
    String text = "aBcDeFgH";
    
    List<Character> listOfText = text
            .chars()
            .mapToObj(i -> (char) i)
            .filter(c -> isUpperCase(c))
            .collect(Collectors.toList());
    
    System.out.println(listOfText);
  }
}
