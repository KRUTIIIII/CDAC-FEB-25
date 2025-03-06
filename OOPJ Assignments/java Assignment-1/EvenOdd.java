//7. Create a Java program to check whether a given number is even or odd using 
//command-line arguments. 


import java.util.Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;

        if (args.length > 0) {
            // Validate if command-line argument is a number
            if (isNumeric(args[0])) {
                number = Integer.parseInt(args[0]);
            } else {
                System.out.println("Invalid input");
                return;
            }
        } else {
            // Use Scanner only if no command-line argument is provided
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid input");
                return;
            }
        }

        // Checks even or odd
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int num) {
        System.out.println(num + " is an " + (num % 2 == 0 ? "Even" : "Odd") + " number.");
    }

    // Method to check if a string is a valid integer
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}

