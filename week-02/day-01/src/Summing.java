import java.util.Scanner;

public class Summing {
  
  public static int sum(int addUpToThis) {
    int sumOfNumbers =0;
    for (int i = 1; i < addUpToThis +1; i++ ) {
      sumOfNumbers += i;
    }
    return sumOfNumbers;
  }
  
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
   
    System.out.println("Enter an integer!");
    int addUpToThis = scanner.nextInt();
  
    System.out.println("Sum of integers up to " + addUpToThis + " is " + sum(addUpToThis) + ".");
    }
}
