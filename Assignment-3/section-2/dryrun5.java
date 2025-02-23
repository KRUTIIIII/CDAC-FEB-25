//Snippet 5:  
public class dryrun5 { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 
// Guess the output of this loop.The loop runs from i = 1 to i = 4 (inclusive).

/*ans: If i is even (i % 2 == 0), add i to num.
If i is odd, subtract i from num.
Initial value of num is 1.

dryrun:
	i    Even/Odd?	   Operation             New Value 
1	1	Odd	num = num - 1 → 1 - 1	 0
2	2	Even	num = num + 2 → 0 + 2	 2
3	3	Odd	num = num - 3 → 2 - 3	 -1
4	4	Even	num = num + 4 → -1 + 4	 3

o/p: 3*/
