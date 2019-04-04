public class CodingHours {
  public static void main(String[] args) {
  
  int semesterWeek = 17;
  int weeklyDays = 5;
  double weeklyHours = 52;
  double dailyHours = 6;
  double codingHours;
  double codingPercentage;
  
  codingHours = semesterWeek * weeklyDays * dailyHours;
  codingPercentage = Math.round ((100 * codingHours / ( weeklyHours * semesterWeek )) * 100. ) / 100. ;
  
  System.out.println("An average Green Fox attendee codes " + codingHours + " hours in a semester.");
  System.out.println("An average Green Fox attendee spends " + codingPercentage + " % of his/her time on actual coding.");
  }
}
