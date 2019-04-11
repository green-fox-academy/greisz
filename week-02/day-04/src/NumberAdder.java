import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number!");
    int number = scanner.nextInt();
    int sum = numberAdder(number);
    
    System.out.println("Sum of numbers up to " + number + " is: " + sum);
  }
  
  public static int numberAdder(int n) {
    if (n == 0) {
      return 0;
    } else {
      return numberAdder(n - 1) + n;
    }
  }
}
