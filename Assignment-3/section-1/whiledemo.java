/*Snippet 2:  
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop?*/

/*ans:
The condition while (count = 0) is incorrect because:
= is an assignment operator, not a comparison operator.
This tries to assign 0 to count, which is not a valid condition for while().
In Java, while(condition) expects a boolean (true or false), but count = 0 is an integer assignment, which causes a compilation error. */

public class whiledemo {
    public static void main(String[] args) {
        int count = 5;
        while (count > 0) {  //  Use `count > 0 for a valid condition
            System.out.println(count);
            count--;  // Decrement count so the loop should terminate
        }
    }
}


