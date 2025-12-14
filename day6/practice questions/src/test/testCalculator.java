package test;

import java.util.Scanner;
import beans.Calculator;
import exception.WrongOperatorException;

public class testCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Perform Calculation");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();

                    System.out.print("Enter operator (+, -, *, /, %): ");
                    String op = sc.next();

                    try {
                        int result = Calculator.calculate(num1, num2, op);
                        System.out.println("Result: " + result);
                    } catch (WrongOperatorException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (ArithmeticException e) {
                        System.out.println("Math Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting Calculator... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 2);

        sc.close();
    }
}