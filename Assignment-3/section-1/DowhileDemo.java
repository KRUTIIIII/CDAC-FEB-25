/*public class DowhileDemo { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
 
    } 
} */
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the do-while loop? 

/*ans:
-The loop executes only once because of the condition in the do-while loop:
                    while (num > 0);
-Initially, num = 0. The loop runs and increments num to 1.
-The condition num > 0 is now true, so the loop runs again, printing 1 and incrementing num to 2, and continues to execute.
-The loop will keep running indefinitely instead of stopping after the first iteration.*/

// corrected code:

public class DowhileDemo { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 5); // Loop runs while num is less than 5
    } 
}


