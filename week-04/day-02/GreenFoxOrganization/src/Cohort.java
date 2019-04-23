import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student> studentList;
  List<Mentor> mentorList;
  
  public Cohort(String name) {
    this.name = name;
    this.studentList = new ArrayList<>();
    this.mentorList = new ArrayList<>();
  }
  
  public void addStudent(Student newStudent) {
    this.studentList.add(newStudent);
  }
  
  public void addMentor(Mentor newMentor) {
    this.mentorList.add(newMentor);
  }
  
  public void info() {
    System.out.println("The " + this.name + " cohort has " +
            this.studentList.size() + " students, and " +
            this.mentorList.size() + " mentors.");
  }
}
