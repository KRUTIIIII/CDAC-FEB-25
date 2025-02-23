/*Snippet 4:  
public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
 Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output?

ans:
The loop starts at i = 1 and continues while i <= 10, meaning it includes 10 in the output.
However, the expected output is only 1 to 9.
Since i is incremented after each iteration, it reaches 10 and prints it before stopping.

corrected code:*/

public class LoopDemo { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { // Change condition to i < 10
            System.out.println(i); 
        } 
    } 
}

