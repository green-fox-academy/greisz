import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
  public static void main(String[] args) {
    
    List<String> name = new ArrayList<>();
    System.out.println(name.size());
    name.add("William");
    System.out.println(name.isEmpty());
    name.add("John");
    name.add("Amanda");
    System.out.println(name.size());
    System.out.println(name.get(2));
    for (int i = 0; i < name.size(); i++) {
      System.out.println(name.get(i));
    }
    for (int i = 0; i < name.size(); i++) {
      System.out.println((i + 1) + ". " + name.get(i));
    }
    name.remove(1);
    for (int i = name.size() - 1; i > -1; i--) {
      System.out.println(name.get(i));
    }
  }
}


