import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  
  static boolean isAnagram(char[] array1, char[] array2) {
    
    int length1 = array1.length;
    int length2 = array2.length;
    if (length1 != length2){
      return false;
    }
  
    Arrays.sort(array1);
    Arrays.sort(array2);
    for (int i = 0; i < length1; i++ )
      if (array1[1] != array2[1]){
        return false;
      }
    return true;
  }
  
  public static void main(String args []) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first word");
    String word1 = scanner.next();
    System.out.println("Enter second word");
    String word2 = scanner.next();
    
    char[] array1 = word1.toCharArray();
    char[] array2 = word2.toCharArray();

    System.out.println("The first word is: " + word1);
    System.out.println("The second word is: " + word2);
    if (isAnagram(array1, array2)) {
      System.out.println("The 2 words are anagrams!");
    } else {
      System.out.println("The 2 words are not anagrams!");
    }
  }
}
