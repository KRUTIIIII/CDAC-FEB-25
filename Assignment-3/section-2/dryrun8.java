//Snippet 8:  
public class dryrun8 { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
 
 
} 
// Guess the output of this code snippet.

/* ans:
        i 	i++ 	         ++i 	        (i++ - ++i)	New count Value  final i
1	0	0 → i = 1     2 (i = 2)	       0 - 2 = -2  	0 + (-2) = -2	 i = 3
2	3	3 → i = 4	5 (i = 5)	3 - 5 = -2	-2 + (-2) = -4	 i = 6

After i = 6, the loop condition i < 4 is false, so the loop stops.

op: -4 */