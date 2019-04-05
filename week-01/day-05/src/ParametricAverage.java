import java.util.Scanner;

public class ParametricAverage {
  public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
  
    System.out.println("How many numbers do you have?");
    int num =sc.nextInt();
    
    int[] integers = new int[num];
    int sum = 0;
    double avg;
    
    for(int i = 0; i < num; i++) {
      switch (i + 1){
        case 1:
          System.out.println("Enter 1st integer: ");
          integers[i] = sc.nextInt();
          break;
        case 2:
          System.out.println("Enter 2nd integer: ");
          integers[i] = sc.nextInt();
          break;
        case 3:
          System.out.println("Enter 3rd integer: ");
          integers[i] = sc.nextInt();
          break;
        default:
          System.out.println("Enter " + (i + 1) + "th integer: ");
          integers[i] = sc.nextInt();
      }
    }
   
    for(int i = 0; i < num; i++) {
      sum = sum + integers[i];
    }
    avg = sum / num;
  
    System.out.println("Sum: " + sum);
    System.out.println("Average " + avg);
  }
}
