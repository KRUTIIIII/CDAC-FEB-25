/*public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?
------------------------------------------------------------
The code does not compile because there are two case 5: statements inside the same switch block.
In a switch statement, each case label must be unique.
If Java allowed duplicate cases, the program wouldn’t know which case 5: to execute which will lead to confusion.
-------------------------------
corrected code:*/

public class error26 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 6: // Changed from duplicate "case 5" to "case 6"
                System.out.println("This is case 6"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}
