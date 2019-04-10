import java.util.Collections;
import java.util.HashMap;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String,Integer> products = new HashMap<>() {{
      put("Eggs",200);
      put("Milk",200);
      put("Fish",400);
      put("Apples",150);
      put("Bread",50);
      put("Chicken",550);
    }};
  
    System.out.println("How much is the fish? " + products.get("Fish"));
    
    for (String i : products.keySet()) {
      if (products.get(i) == Collections.max(products.values())){
        System.out.println("The most expensive product is: " + i);
      }
    }
    
    double sum = 0;
    for (Integer i : products.values()) {
      sum += i;
    }
    System.out.println("What is the average price? " + (sum / products.size()));
    
    int below300 =0;
    for (String i : products.keySet()) {
      if (products.get(i) < 300) {
        below300++;
      }
    }
    System.out.println("Number of product that are cheaper than 300 is: " + below300);
  
    System.out.println("Is there anything for exactly 125? " + products.containsValue(125));
  
    for (String i : products.keySet()) {
      if (products.get(i) == Collections.min(products.values())){
        System.out.println("The cheapest product is: " + i);
      }
    }
  }
}
