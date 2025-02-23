/*Snippet 11:  
public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 
 Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the desired result?

-----------------------------------
ans:the statement i += 2;  which lies inside the while loop which may cause unexpected results in output .
The loop skips odd numbers (1 and 3) because i increments by 2 each time.
-----------------------------------------*/


public class Snippet11 { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i++;  // Change i += 2 to i++
        } 
    } 
}

 
 