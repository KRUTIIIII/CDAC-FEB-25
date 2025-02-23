//Snippet 3:  
public class dryrun3 { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this while loop.

/*ans:
The while loop runs as long as count < 5.
The value of count is printed In each iteration
Then, count is incremented (count++)
If count == 3, the break statement terminates the loop immediately.
The loop does not continue to count = 4 or beyond.
After the loop ends, the final value of count is printed.

o/p: 0 1 2 3 */

