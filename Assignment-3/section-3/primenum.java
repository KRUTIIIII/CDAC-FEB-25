//6. Write a program to find and print the first 5 prime numbers.

public class primenum{
    public static void main(String[] args) {
        int count = 0; // Counter for prime nos.
        int num = 2;   // Start from number 2 i.e first prime no.

        System.out.println("First 5 Prime Numbers:");

        while (count < 5) { // Keep finding primes until we have 5 nos.
            boolean isPrime = true; // Assume the number is prime

            // Check if num is prime (divisible only by 1 and itself)
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // If num is divisible by any number, it's not prime
                    isPrime = false;
                    break; // Stop checking if we already know it's not prime
                }
            }

            if (isPrime) { // If the number is still prime
                System.out.print(num + " "); // Print it
                count++; // Increase the prime count
            }

            num++; // Move to the next number
        }
    }
}

//op:First 5 Prime Numbers:
2 3 5 7 11