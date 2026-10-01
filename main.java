/*
 * Name: Jade Stewart
 * Course: CSC320
 * Assignment: Module 3 Critical Thinking, Option #1
 * Date: October 1, 2026
 *
 * Description: Prompts the user for their weekly income and calculates
 * the weekly tax withholding based on the following brackets:
 *   Less than $500:              10%
 *   $500 to less than $1500:     15%
 *   $1500 to less than $2500:    20%
 *   $2500 or more:               30%
 */

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String incomeInput;
    double weeklyIncome;
    double taxRate;
    double weeklyTax;
    Scanner scnr = new Scanner(System.in);

    // Get the weekly income from the user
    System.out.println("Please enter your income for the week in dollars and cents: ");
    incomeInput = scnr.nextLine().trim();
    scnr.close();

    // Convert input to a number, exit if the input is not numeric
    try {
      weeklyIncome = Double.parseDouble(incomeInput);
    } catch (NumberFormatException e) {
      System.out.println("Error: please ensure you enter a numeric value");
      return;
    }

    // Determine the tax rate based on the income bracket
    if (weeklyIncome <= 0) {
      System.out.println("Income must be greater than 0 to compute tax");
      return;
    } else if (weeklyIncome < 500) {
      taxRate = 0.10;
    } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
      taxRate = 0.15;
    } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
      taxRate = 0.20;
    } else {
      taxRate = 0.30;
    }

    // Calculate and display the weekly tax withholding
    weeklyTax = weeklyIncome * taxRate;
    System.out.printf("Your weekly tax amount is: $%.2f%n", weeklyTax);
  }
}