Snippet 24:  
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation?

------------------------------------------------------------


ans: The problem is that there are no break; statements after each case. This causes fall-through, means once a match is found, the program keeps running the next cases instead of stopping.

level = 1, so case 1 runs and prints "Level 1".

But since there’s no break;, it keeps going to case 2, then case 3, and even the default case!
-----------------------------------------------
corrected code:
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break;  // Stops here if level = 1
            case 2: 
                System.out.println("Level 2"); 
                break;  // Stops here if level = 2
            case 3: 
                System.out.println("Level 3"); 
                break;  // Stops here if level = 3
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}













