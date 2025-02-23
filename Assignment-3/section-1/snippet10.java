/*Snippet 10:  
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?

ans:
Assignment (=) instead of Comparison (==) used here.
num = 10 assigns the value 10 to num, instead of checking if num is equal to 10.

----------------------------------------
corrected code:*/

public class snippet10 { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) {  // == used for comparison
            System.out.println(num); 
            num--;   
        } 
    } 
}
