public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;
  
  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
  
  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
  
  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  
  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() +
            ", a " + this.getAge() + " year old " +
            this.getGender() +
            " from " + this.previousOrganization +
            ", who skipped " + this.skippedDays + " days from the course already.");
  }
  
  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
  
  public Student clone() {
    return new Student(this.getName(), this.getAge(), this.getGender(), this.previousOrganization);
  }
  
}

