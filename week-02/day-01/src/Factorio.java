import java.util.Scanner;

public class Factorio {
  
  public static int factorio(int base) {
    int factorial = 1;
    for (int i = 1; i < base +1; i++) {
      factorial = factorial *i;
    }
    return factorial;
  }
  
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
  
    System.out.println("Enter an integer!");
    int base = scanner.nextInt();
  
    System.out.println(base + "! = " + factorio(base));
  }
}
