import java.util.Scanner;

public class Bunnies {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of bunnies : ");
    int bunnies = scanner.nextInt();
    System.out.println("Enter number of ears per bunny: ");
    int ears = scanner.nextInt();
    int totalears = countEars(bunnies, ears);
    System.out.println(bunnies + " bunnies with " + ears + " ears each, has " + totalears + " ears in total.");
  }
  
  public  static int countEars(int bunnies, int ears) {
    if (bunnies == 1){
      return ears;
    } else  {
      return countEars(bunnies - 1, ears) + ears;
    }
  }
}
