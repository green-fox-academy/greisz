import java.util.HashMap;

public class MapIntroduction {
  public static void main(String[] args) {
    HashMap<Integer, Character> ASCII = new HashMap<>();
    System.out.println(ASCII.isEmpty());
    ASCII.put(97, 'a');
    ASCII.put(98, 'b');
    ASCII.put(99, 'c');
    ASCII.put(65, 'A');
    ASCII.put(66, 'B');
    ASCII.put(67, 'C');
    System.out.println(ASCII.keySet());
    System.out.println(ASCII.values());
    ASCII.put(68, 'D');
    System.out.println(ASCII.size());
    System.out.println(ASCII.get(99));
    ASCII.remove(97);
    System.out.println(ASCII.containsValue(100));
    ASCII.clear();
  }
}
