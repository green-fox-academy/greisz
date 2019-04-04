import java.util.Scanner;

public class FavoriteNumber {
  public  static  void main(String[] args){
    
    int favoriteNumber = 8;
    
    System.out.println("Enter your favorite number:");
    Scanner scan = new Scanner(System.in);
    favoriteNumber = scan.nextInt();
    System.out.println("Your favorite number is " + favoriteNumber);
  }
}
