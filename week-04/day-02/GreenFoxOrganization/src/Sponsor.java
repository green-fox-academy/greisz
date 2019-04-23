public class Sponsor extends Person {
  String company;
  int hiredStudents;
  
  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }
  
  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
  
  public void hire() {
    this.hiredStudents++;
  }
  
  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
  
  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name +
            ", a " + age + " year old " +
            gender +
            " who represents " + company +
            " and hired " + hiredStudents + " students so far.");
  }
}
