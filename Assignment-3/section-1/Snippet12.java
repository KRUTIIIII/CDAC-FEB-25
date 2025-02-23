/*Snippet 12:  
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

----------------------------------------
ans:
x is declared inside the {} of the for loop.
In Java, a variable declared inside a block {} is only accessible within that block.
When the loop ends, x is destroyed and does not exist outside the loop.
hence it shows a compilation error.
to fix the error ,we have to declare x outside the loop so it remains accessible after the loop.
----------------------------------*/
public class Snippet12 { 
    public static void main(String[] args) { 
        int x = 0;  // Declare x outside the loop
        for (int i = 0; i < 5; i++) { 
            x = i * 2;  // Assign values inside the loop
        } 
        System.out.println(x);  // Now x is accessible
    } 
}

