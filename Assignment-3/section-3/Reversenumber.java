//4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class Reversenumber {
    public static void main(String[] args) {
        int number = 1234;  
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  // Get last digit by %10
            reversed = reversed * 10 + digit;  // adds digit to reversed number
            number /= 10;  // Removes last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}

//op:Reversed number: 4321
