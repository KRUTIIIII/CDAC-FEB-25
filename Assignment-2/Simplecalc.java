/*Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if else to check if division by zero is attempted and display an error message.
-----------------------------------------------*/

import java.util.Scanner;

public class Simplecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Simple calculations using if-else
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        } else {
            System.out.println("Error: Invalid operator! Use +, -, *, or /.");
        }

        scanner.close();
    }
}
