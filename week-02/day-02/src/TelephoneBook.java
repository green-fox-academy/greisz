import java.util.HashMap;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String,String> telephoneBook = new HashMap<>();
    telephoneBook.put("William A. Lathan", "405-709-1865");
    telephoneBook.put("John K. Miller", "402-247-8568");
    telephoneBook.put("Hortensia E. Foster", "606-481-6467");
    telephoneBook.put("Amanda D. Newland", "319-243-5613");
    telephoneBook.put("Brooke P. Askew", "307-687-2982");
  
    System.out.println("Phone number of John K. Miller is: " + telephoneBook.get("John K. Miller"));
    for (String i : telephoneBook.keySet()) {
      if (telephoneBook.get(i) == "307-687-2982") {
        System.out.println("307-687-2982 is the number of: " + i);
      }
    }
    System.out.println("Do we know Chris E. Myers' phone number? " + telephoneBook.containsKey("Chris E. Myers"));
    }
}
