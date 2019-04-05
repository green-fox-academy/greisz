import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String args []) {
  
    Scanner scanner = new Scanner(System.in);
    int guessThis = new Random().nextInt(99) + 1;
    int lives;
  
    System.out.println("How lucky you feel today?");
    System.out.println("I am a Green Fox-Otter-ish creature, are you kidding me? Press: 3");
    System.out.println("Kinda... I guess. Press: 2");
    System.out.println("Not really. Press: 1");
    System.out.println("I just wanna die. Press: 0");
    lives = scanner.nextInt();
  
    System.out.println("I've the number between 1-100. You have " + lives +" lives.");
  
    // For testing:
    System.out.println("This is here for testing. Number to guess is: " + guessThis);
 
      for (int i = lives; i > 0; i-- ) {
        int guess = scanner.nextInt();
        if (guess == guessThis) {
          System.out.println("Congratulations. You won!");
          break;
        } else if (guess > guessThis) {
          System.out.println("Too high. You have " + (i - 1) + " lives left.");
        } else {
          int j = i--;
          System.out.println("Too low. You have " + j + " lives left.");
      }
    }
    //I want to jump here if 0 lives set, but it seems there is no goto in Java :(
    // System.out.println("Game over. The number was: " + guessThis);
    //Jump here if won.
    }
}
