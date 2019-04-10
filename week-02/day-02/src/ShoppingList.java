import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
    
    if (shoppingList.contains("milk")) {
      System.out.println("We do have milk on the list.");
    } else {
      System.out.println("We don't have milk on the list.");
      }
  
    if (shoppingList.contains("bananas")) {
      System.out.println("We do have bananas on the list.");
    } else {
      System.out.println("We don't have bananas  on the list.");
    }
  }
}
