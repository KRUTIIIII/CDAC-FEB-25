public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?
-------------------------------------------------------------
error:
there is no break statements after each case in the switch statement.
-------------------------------------------------------
explaination:
value = 2, so case 2 is matched.
Since there is no break;, execution continues to case 3 and then to the default case.
"Value is 2"is printed but it also prints "Value is 3" and "Default case" becoz there is no break statement after the cases.
-------------------------------------
Corrected Code:
public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break; 
            case 2: 
                System.out.println("Value is 2"); 
                break; // Prevents execution from continuing to case 3
            case 3: 
                System.out.println("Value is 3"); 
                break;
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
---------------------------------
Now, only "Value is 2" will print when value = 2.