import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    int divisor;
    try (Scanner scanner = new Scanner(System.in)) {
      divisor = scanner.nextInt();
      int result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}