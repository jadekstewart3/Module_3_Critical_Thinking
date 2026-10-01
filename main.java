import java.util.Scanner;

public class Main {

  public static void main(String [] args){
    String income;
    double taxRate = 0.0;
    double weeklyTax; 
    double intIncome;
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter your income for the week in dollars and cents: ");
    income = scnr.nextLine().trim();
    try {
        intIncome = Double.parseDouble(income);
    } catch (NumberFormatException e){
        System.out.println("Error: please ensure you enter a numeric value");
        scnr.close();
        return;
    }

    if(intIncome <= 0){
      System.out.println("Income must be greater than 0 to compute tax");
      return;
    } else if(intIncome < 500) {
      taxRate =  0.10;
    } else if(intIncome >= 500 && intIncome < 1500){
      taxRate = 0.15;
    } else if(intIncome >= 1500 && intIncome < 2500){
      taxRate = 0.20;
    } else{
      taxRate = 0.30;
    }

    weeklyTax = intIncome * taxRate;
    System.out.println("Your weekly tax amount is: " + weeklyTax);
  }
}