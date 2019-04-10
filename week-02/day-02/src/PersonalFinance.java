import java.util.*;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> Expenses =new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
    
    Integer totalExpenses =0;
    for (int i : Expenses) {
      totalExpenses = totalExpenses +i;
    }
    System.out.println("Total expenses: " + totalExpenses);
    System.out.println("Greatest expense: " + Collections.max(Expenses));
    System.out.println("Cheapest spending: " + Collections.min(Expenses));
    System.out.println("Average of expenses: " + totalExpenses / (Expenses.size()));
  }
}
