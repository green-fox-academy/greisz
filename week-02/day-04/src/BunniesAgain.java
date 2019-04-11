import java.util.Scanner;

public class BunniesAgain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of bunnies : ");
    int bunnies = scanner.nextInt();
    System.out.println("Enter number of ears for odd bunnies: ");
    int oddEars = scanner.nextInt();
    System.out.println("Enter number of ears for even bunnies: ");
    int evenEars = scanner.nextInt();
    int totalears = countEars(bunnies, oddEars, evenEars);
    System.out.println("These bunnies have " + totalears + " ears in total.");
  }
  
  public static int countEars(int bunnies, int oddEars, int evenEars) {
    if (bunnies == 1) {
      return oddEars;
    } else if (bunnies % 2 == 1) {
      return countEars(bunnies - 1, oddEars, evenEars) + oddEars;
    } else {
      return countEars(bunnies - 1, oddEars, evenEars) + evenEars;
    }
  }
}
