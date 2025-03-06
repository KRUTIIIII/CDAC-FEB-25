//5. Write a Java program to swap two numbers using a temporary variable and without 
//using a temporary variable. 

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();  
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();  

        // Swapping using a temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (Using Temp): a = " + a + ", b = " + b);

        // Swapping without using a temp variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (Without Temp): a = " + a + ", b = " + b);

        scanner.close();  
    }
}
