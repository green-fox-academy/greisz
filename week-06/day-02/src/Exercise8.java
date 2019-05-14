import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> charactersOfText = Arrays.asList('S', 't', 'r', 'i', 'n', 'g');
    
    String text = (charactersOfText.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining()));
    
    System.out.println(text);
  }
}
