//5. Write a program to print the Fibonacci sequence up to the number 21. 

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1; // First two numbers
        System.out.print("Fibonacci sequence up to 21: " + a + ", " + b);

        int next = a + b; // Calculate next number
        while (next <= 21) {
            System.out.print(", " + next);
            a = b;  // Shift values
            b = next;
            next = a + b;  // Compute next Fibonacci number
        }
    }
}

//op:Fibonacci sequence up to 21: 0, 1, 1, 2, 3, 5, 8, 13, 21