//Snippet 6:  
public class dryrun6 { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
} 
// Guess the output of this code snippet.

/*ans:
Pre-increment (++x) → First increment, then use the updated value.
Post-increment (x++) → First use the current value, then increment afterward.
Pre-decrement (--x) → First decrement, then use the updated value.
Post-decrement (x--) → First use the current value, then decrement afterward.

++x (Pre-increment x)

x = 6 (Increment first, then use)
So, ++x → 6

x-- is Post-decrement :
Use x = 6 first, then decrement.
So, x-- → 6, but now x = 5

--x is Pre-decrement :
x = 4 (Decrement first, then use)
So, --x → 4

x++ is Post-increment :
Use x = 4 first, then increment.
So, x++ → 4, but now x = 5

now,
y = (6 - 6) + 4 + 4;
y = 0 + 4 + 4;
so op: y = 8*/