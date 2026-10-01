import java.util.Scanner;

public class Main {

  public static void main(String [] args){
    String income;
    double taxRate;
    double weeklyTax; 
    int intIncome;
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter your income for the week in dollars: ");
    income = scnr.nextLine().trim();
    try {
        intIncome = Integer.parseInt(income);
    } catch (NumberFormatException e){
        System.out.println("Error: please ensure you enter a whole number");
    }

    if(intIncome <= 0){
      System.out.println("Income must be greater than 0 to compute tax")
      break;
    } 
  }
}