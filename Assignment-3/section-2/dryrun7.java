//Snippet 7:  
public class dryrun7 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
} 
// Guess the output of this code snippet.
/*ans: ++a (Pre-increment a)

a = 11 (Increment first, then use)
So, ++a → 11

b-- (Post-decrement b)
Use b = 5 first, then decrement.
So, b-- → 5, but now b = 4

First operation: ++a * b--
= 11 * 5 = 55

--a (Pre-decrement a)
a = 10 (Decrement first, then use)
So, --a → 10

Second operation: - --a
= 55 - 10 = 45

b++ (Post-increment b)
Use b = 4 first, then increment.
So, b++ → 4, but now b = 5

Final operation: + b++
= 45 + 4 = 49

op:49*/