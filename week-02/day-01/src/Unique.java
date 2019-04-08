import java.util.Arrays;

public class Unique {
  
  public static int[] uniqueElements(int[] inputArray) {
   
    int uniqueElementsCounter = 1;
    Arrays.sort(inputArray);
    
    for (int i = 0; i < inputArray.length - 1; i++) {
      if (inputArray[i] != inputArray[i + 1]) {
        uniqueElementsCounter++;
      }
    }
    
    int[] uniqueArray = new int[uniqueElementsCounter];
    int uniqueArrayElement = 0;
    
    for (int i = 0; i < inputArray.length - 1; i++) {
      if (inputArray[i] != inputArray[i + 1]) {
        uniqueArray[uniqueArrayElement] = inputArray[i];
        uniqueArrayElement++;
      }
      
      if (i == inputArray.length - 2 && inputArray[i] != inputArray[i + 1]) {
        uniqueArray[uniqueArrayElement] = inputArray[i + 1];
      }
    }
    return uniqueArray;
  }
    
  public static void main(String[] args) {
    int[] uniqueThis = {1, 11, 34, 11, 52, 61, 1, 34};
    System.out.println(Arrays.toString(uniqueElements(uniqueThis)));
  }
}
