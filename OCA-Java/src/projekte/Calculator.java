package projekte;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n********************************");
        System.out.println("Welcome to the Basic Calculator!");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, operator, num2);
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operator, num2, result);

            System.out.println("********************************");
            System.out.print("Do you want to continue? (y/n): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Calculator closed. Goodbye!");
    }

    private static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
