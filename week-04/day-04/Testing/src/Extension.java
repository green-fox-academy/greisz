import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return 5;
  }
  
  int maxOfThree(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }
  
  double median(List<Integer> pool) {
    Collections.sort(pool);
    double median;
    if (pool.size() % 2 == 0) {
      double medianLow = pool.get(pool.size() / 2 - 1);
      double medianHigh = pool.get(pool.size() / 2);
      median = (medianHigh + medianLow) / 2;
    } else {
      median = pool.get((pool.size() - 1) / 2);
    }
    return median;
  }
  
  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }
  
  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}