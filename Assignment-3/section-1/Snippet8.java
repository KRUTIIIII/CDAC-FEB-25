/*Snippet 8:  
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
 Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5?

ans:
The loop starts with num = 1.
It prints 1 and decreases num to 0.
The condition num > 0 fails, so the loop stops immediately after one iteration.
Thus, only 1 is printed, instead of counting up to 5.

----------------------------*/

public class snippet8 { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++;  // Incrementing instead of decrementing
        } while (num <= 5); // Adjust condition to stop at 5
    } 
}


