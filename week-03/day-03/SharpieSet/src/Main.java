public class Main {
  public static void main(String[] args) {
    
    Sharpie sharpie1 = new Sharpie("blue", 2, 3);
    System.out.println("Sharpie1 ink amount: " + sharpie1.getInkAmount());
    
    Sharpie sharpie2 = new Sharpie("yellow", 1, 5);
    System.out.println("Sharpie2 ink amount: " + sharpie2.getInkAmount());
    
    SharpieSet set1 = new SharpieSet();
    set1.add(sharpie1);
    set1.add(sharpie2);
    System.out.println("Usable sharpies in set1: " + set1.countUsable());
    
    System.out.println("Let's use sharpie1 until it works.");
    for (int i = 0; i < 14; i++) {
      sharpie1.use();
      System.out.println("Sharpie1 ink amount: " + sharpie1.getInkAmount());
    }
    
    System.out.println("Usable sharpies in set1: " + set1.countUsable());
    System.out.println("All sharpies in set1: " + set1.getPencilbox().size());
    
    set1.removeTrash();
    System.out.println("Empty sharpies removed.");
    
    System.out.println("Usable sharpies in set1: " + set1.countUsable());
    System.out.println("All sharpies in set1: " + set1.getPencilbox().size());
    
  }
}
