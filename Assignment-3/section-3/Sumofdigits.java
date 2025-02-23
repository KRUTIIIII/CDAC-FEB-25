/*7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). */

public class Sumofdigits {
    public static void main(String[] args) {
        int number = 9876;  //given
        int sum = 0;        // Variable to store sum of digits

        while (number > 0) {
            int digit = number % 10; // Extract last digit
            sum += digit;            // Add digit to sum
            number /= 10;            // Remove last digit
        }

        // Print the result
        System.out.println("Sum of digits: " + sum);
    }
}

//op:Sum of digits: 30