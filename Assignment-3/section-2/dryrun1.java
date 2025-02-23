//Snippet 1:  
public class dryrun1 { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
 
 
        } 
    } 
} 
// Guess the output of this nested loop.

/*ans:
-The outer loop (i) starts from 1 and runs up to 3.
i = 1 → Enters inner loop (j = 1 to 2)

j = 1 → prints 1 1
j = 2 → prints 1 2
Inner loop ends → New Line
i = 2 → Enters inner loop (j = 1 to 2)

j = 1 → prints 2 1
j = 2 → prints 2 2
Inner loop ends → New Line
i = 3 → Enters inner loop (j = 1 to 2)

j = 1 → prints 3 1
j = 2 → prints 3 2
Inner loop ends → New Line
-The inner loop (j) starts from 1 and runs up to 2.

Outer Loop (i)	Inner Loop (j)	Printed O/P	
    1	             1	            1 1
    1	             2	            1 2
    2	             1	            2 1	
    2	             2	            2 2	
    3	             1	            3 1	
    3	             2	            3 2	    
 
o/p:
1 1 1 2
2 1 2 2
3 1 3 2




*/