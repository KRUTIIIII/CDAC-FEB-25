/*Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.
----------------------------------------------*/
 import java.util.Scanner;

public class Discountcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for purchase amount
        System.out.print("Enter the total purchase amount (Rs): ");
        double totalAmount = scanner.nextDouble();

        // Asking if the user has a membership card
        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembership = scanner.next().toLowerCase();

        double discount = 0; // Variable to store discount percentage

        // Applying discount based on purchase amount
        if (totalAmount >= 1000) {
            discount = 20;
        } else if (totalAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        // Applying extra 5% discount if user has a membership card
        if (hasMembership.equals("yes")) {
            discount += 5;
        }

        // Calculating final price after discount
        double discountAmount = (totalAmount * discount) / 100;
        double finalAmount = totalAmount - discountAmount;

        // Displaying results
        System.out.println("Total Purchase Amount: Rs. " + totalAmount);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);

        scanner.close(); // Closing scanner to prevent resource leaks
    }
}

