//2. Write a Java program that takes two integers as input and performs all arithmetic 
//operations on them. 

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        scanner.close();
    }
}

/*output: Enter first number: 5
Enter second number: 10
Addition: 15
Subtraction: -5
Multiplication: 50
Division: 0
Modulus: 5 */
