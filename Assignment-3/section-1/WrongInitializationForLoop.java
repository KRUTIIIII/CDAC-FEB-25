/*Snippet 5:  
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} 
Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?
----------------------------------
ans:
problem is i++ increases i instead of decreasing it.
The loop starts at i = 10, and i++ makes i increase to 11 on the first iteration.
Since the condition i >= 0 is always true when i is increasing, this results in an infinite loop instead of counting down.
Since we want to print numbers from 10 down to 0, the loop should decrement i instead of incrementing it.
Corrected Code:*/

public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { // Change i++ to i--
            System.out.println(i); 
        } 
    } 
}
