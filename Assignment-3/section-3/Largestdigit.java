//9. Write a program to find and print the largest digit in the number 4825. 

public class Largestdigit {
    public static void main(String[] args) {
        int number = 4825;  // Given number
        int largest = 0;    // Variable to store the largest digit

        while (number > 0) {
            int digit = number % 10; // Extract last digit
            if (digit > largest) {   // Compare with largest digit so far
                largest = digit;
            }
            number /= 10; // Remove last digit
        }

        // Print the largest digit
        System.out.println("Largest digit: " + largest);
    }
}

//op: Largest digit: 8
