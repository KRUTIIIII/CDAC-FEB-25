//Snippet 4:  
public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
// Guess the output of this do-while loop.
/*ans: A do-while loop always executes at least once, even if the condition is false.
The loop prints i, then increments i (i++).
The condition while (i < 5) controls when the loop stops.
After exiting the loop, System.out.println(i); prints the final value of i.

dryrun:
 	i    Output	i++   (i < 5)	
	1	1	2	Yes
	2	2	3	Yes	
	3	3	4	Yes
	4	4	5	No

o/p:1 2 3 4 5 */