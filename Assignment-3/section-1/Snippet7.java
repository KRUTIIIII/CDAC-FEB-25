/*Snippet 7:  
public class snippet7 { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop variable properly?


ans: here,
-int count; is declared but not initialised means it is not given any value.
-In Java, local variables must be initialized before they are used.
-Since count is declared but not assigned any value, the compiler does not know what value it holds.
-This leads to the compilation error:
"Variable 'count' might not have been initialized."

corrected code: */

public class snippet7 { 
    public static void main(String[] args) { 
        int count = 0;  // public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0;  // count Initialized

        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
 count

        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
