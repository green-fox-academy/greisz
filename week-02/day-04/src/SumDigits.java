import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number!");
    int digitsToAdd = scanner.nextInt();
    int sumOfDigits = sumDigits(digitsToAdd);
    System.out.println("The sum of the digits of " + digitsToAdd + " is " + sumOfDigits);
  }
  
  public static int sumDigits(int digitsToAdd) {
    if (digitsToAdd / 10 == 0) {
      return digitsToAdd;
    } else {
      return sumDigits(digitsToAdd / 10) + digitsToAdd % 10;
    }
  }
}
