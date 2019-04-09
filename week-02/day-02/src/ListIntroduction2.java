import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    List<String> listB = new ArrayList<>(listA);
    listB.remove("Durian");
    listA.add(4,"Kiwifruit");
    if (listA.size() > listB.size()) {
      System.out.println("ListA has more elements.");
    } else if (listA.size() < listB.size()) {
      System.out.println("ListB has more elements.");
    }
    System.out.println("ListA and ListB have the same number of elements.");
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));
    listB.addAll(Arrays.asList("Passion Fruit", "Pummelo"));
    System.out.println(listA.get(2));
  
  
  
    System.out.println(listA);
    System.out.println(listB);
  
  }
}
