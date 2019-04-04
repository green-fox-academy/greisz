import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;    //default value quite useless here
    int currentMinutes = 34;  //here
    int currentSeconds = 42;  //and here as well
   
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat hours = new SimpleDateFormat("HH");
    SimpleDateFormat mins = new SimpleDateFormat("mm");
    SimpleDateFormat secs = new SimpleDateFormat("ss");
    
    currentHours = Integer.parseInt(hours.format(cal.getTime()));
    currentMinutes = Integer.parseInt(mins.format(cal.getTime()));
    currentSeconds = Integer.parseInt(secs.format(cal.getTime()));
  
    System.out.println((86400 - (3600 * currentHours) - (60 * currentMinutes) - currentSeconds) + " seconds to midnight.");
    
     // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
  }
}