//Q.2. Write a program to compute the factorial of the number 10. 

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1;  // Using long to handle large values
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply each number from 1 to 10 i.e 10x9x8x7..x1
        }
        
        System.out.println("Factorial of 10 is: " + factorial);
    }
}


//op:Factorial of 10 is: 3628800
