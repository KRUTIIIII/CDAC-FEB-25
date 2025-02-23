/*Snippet 1:  
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? */

/*
----------------------------------------
ans: The loop decreases i with i-- instead of increasing it.
This means i will keep decreasing (0, -1, -2, -3, ...) and will never reach 10, making the condition (i < 10) always true.
As a result, the loop never terminates and runs infinitely.
the increment should be i++ instead of i--.
-----------------------------------
corrected code:*/

public class ForloopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // Corrected: Use i++ to increase i
            System.out.println(i);
        }
    }
}
