import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String text = "aaabbc";
    
    List<Character> listOfText = text
            .chars()
            .mapToObj(i -> (char) i)
            .collect(Collectors.toList());
    
    Map<Character, Integer> counts = listOfText.parallelStream().
            collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
    
    System.out.println(counts);
  }
}
