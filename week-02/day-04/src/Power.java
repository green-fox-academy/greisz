import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the base!");
    int base = scanner.nextInt();
    System.out.println("Enter the exponent!");
    int exponent = scanner.nextInt();
    int power = calculatePower(base, exponent);
  
    System.out.println(base + " to the power of " + exponent + " is " + power);
  }
  
  public static int calculatePower(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return calculatePower(base, exponent - 1) * base;
    }
  }
}
