import java.util.Scanner;

public class GreatestCommonDevisor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter larger number: ");
    int largerNumber = scanner.nextInt();
    System.out.println("Enter smaller number: ");
    int smallerNumber = scanner.nextInt();
    int greatestCommonDevisor = calculateGCD(largerNumber, smallerNumber);
    System.out.println("Geatest common devisor of " + largerNumber + " and " + smallerNumber + " is " + greatestCommonDevisor);
  }
  
  public static int calculateGCD (int largerNumber, int smallerNumber) {
    if (largerNumber % smallerNumber == 0){
      return smallerNumber;
    } else {
      return calculateGCD(smallerNumber, largerNumber % smallerNumber);
    }
  }
}
