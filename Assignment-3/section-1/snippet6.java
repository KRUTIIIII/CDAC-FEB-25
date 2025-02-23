/*public class snippet6 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
} 
Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to include all statements within the loop?

------------------------------------------
ans:
The issue is with the lack of curly braces {} around the loop body.
In Java, if a loop has no curly braces {}, only the first statement after it is considered part of the loop.
Here, only System.out.println(i); is inside the loop.
System.out.println("Done"); is outside the loop and executes only once after the loop completes.

corrected code:*/
public class snippet6 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { // we have Used curly braces to include all loop statements
            System.out.println(i); 
            System.out.println("Done"); 
        } 
    } 
}
//----------------------------------------

//Adding {} ensures both System.out.println(i); and System.out.println("Done"); run on each iteration.
