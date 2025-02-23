/*Snippet 9:  
public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update expression be corrected?

ans:The given loop does not actually run infinitely, but it may produce unexpected results.
The loop starts with i = 0.
 i increments by 2 each iteration (i += 2) means i.e 0 2 4 6 but
The loop condition i < 5 allows execution as long as i is less than 5.
----------------------------------*/


public class snippet9 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {  // Change i += 2 to i++
            System.out.println(i); 
        } 
    } 
}

