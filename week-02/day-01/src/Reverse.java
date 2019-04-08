import java.util.Arrays;

public class Reverse {
  
  public static int[] reverse(int[] toBeReversed) {
    
    int[] reversed = new int[toBeReversed.length];
    int reversedIndex = toBeReversed.length - 1;
    
    for (int i = 0; i < toBeReversed.length; i++) {
      reversed[reversedIndex] = toBeReversed[i];
      reversedIndex--;
    }
    return reversed;
  }
  
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7,};
    System.out.println(Arrays.toString(reverse(aj)));
  }
}
