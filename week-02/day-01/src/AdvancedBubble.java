import java.util.Arrays;

public class AdvancedBubble {
  
  public static int[] reverse(int[] toBeReversed) {
    
    int[] reversed = new int[toBeReversed.length];
    int reversedIndex = toBeReversed.length - 1;
    
    for (int i = 0; i < toBeReversed.length; i++) {
      reversed[reversedIndex] = toBeReversed[i];
      reversedIndex--;
    }
    return reversed;
  }
  
  public static int[] advancedBubble(int[] arrayToBeSorted, boolean descending) {
    
    int[] sortedArray;
    
    if (descending == true) {
      sortedArray = Arrays.copyOf(arrayToBeSorted, arrayToBeSorted.length);
      Arrays.sort(sortedArray);
      sortedArray = reverse(sortedArray);
    } else {
      sortedArray = Arrays.copyOf(arrayToBeSorted, arrayToBeSorted.length);
      Arrays.sort(sortedArray);
    }
    return sortedArray;
  }
  
  public static void main(String[] args) {
    System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
    System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, false)));
  }
}
