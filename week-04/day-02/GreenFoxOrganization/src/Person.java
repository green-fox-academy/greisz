public class Person {
  private String name;
  private int age;
  private String gender;
  
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getGender() {
    return gender;
  }
  
  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
  
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() +
            ", a " + this.getAge() + " year old " +
            this.getGender() + ".");
  }
}
