//Snippet 2:  
public class dryrun2 { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
// Guess the output of this loop.

/*ans: The loop starts at i = 5 and decrements to 1.
The total starts at 0 and updates in each iteration.
 and, If i == 3, the continue statement skips the total -= 1
dryrun: 

        i        add i (+=)                   if (i==3)   -=1                  total
                                             continue?   subtract 1
    
	5	total = 0 + 5 = 5	5	No	total = 5 - 1 = 4	4
	4	total = 4 + 4 = 8	8	No	total = 8 - 1 = 7	7
	3	total = 7 + 3 = 10	10	Yes 
                                              (Skip -1)	    (Skipped)	        10
	2	total = 10 + 2 = 12	12	No	total = 12 - 1 = 11	11
	1	total = 11 + 1 = 12	12	No	total = 12 - 1 = 11	11

o/p:11
