import java.util.Arrays;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    
    numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(i -> i)
            .average()
            .ifPresent(avg -> System.out.println("Average is " + Math.round(avg * 100) / 100.0));
  }
}
