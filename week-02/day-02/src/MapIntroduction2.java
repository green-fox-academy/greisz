import java.awt.print.Book;
import java.util.HashMap;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> Books = new HashMap<>();
    Books.put("978-1-60309-452-8", "A Letter to Jo");
    Books.put("978-1-60309-459-7", "Lupus");
    Books.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    Books.put("978-1-60309-461-0", "The Lab");
    for (String key : Books.keySet()) {
      System.out.println(Books.get(key) + " ISBN: (" + key + ")");
    }
    Books.remove("978-1-60309-444-3");
    for (String i : Books.keySet()) {
      if (Books.get(i) == "The Lab"){
        Books.remove(i);
      }
    }
    Books.put("978-1-60309-450-4", "They Called Us Enemy");
    Books.put("978-1-60309-453-5", "Why Did We Trust Him?");
    System.out.println(Books.containsValue("478-0-61159-424-8"));
    System.out.println(Books.get("978-1-60309-453-5"));
  }
}
