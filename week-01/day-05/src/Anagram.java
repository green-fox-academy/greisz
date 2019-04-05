import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  
  static boolean isAnagram(char[] str1, char [] str2) {
    
    int n1 = str1.length;
    int n2 = str2.length;
    if (n1 != n2){
      return false;
    }
  
    Arrays.sort(str1);
    Arrays.sort(str2);
    for (int i = 0; i < n1; i++ )
      if (str1[1] != str2[1]){
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
    
    char[] str1 = word1.toCharArray();
    char[] str2 = word2.toCharArray();

    System.out.println("The first word is: " + word1);
    System.out.println("The second word is: " + word2);
    if (isAnagram(str1, str2)) {
      System.out.println("The 2 words are anagrams!");
    } else {
      System.out.println("The 2 words are not anagrams!");
    }
  }
}
