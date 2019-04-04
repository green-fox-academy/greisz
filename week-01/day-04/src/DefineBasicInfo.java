public class DefineBasicInfo {
  public static void main(String[] args){
    String name = "Reisz Gábor";
    int age = 31;
    double height = 1.77;
    boolean married = false;
  
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    if (married == true) {
      System.out.println("Marital status: married");
    } else {
      System.out.println("Marital status: single");
    }
  }
}
