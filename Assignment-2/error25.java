Snippet 25:  
public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work? 
----------------------------------------------

error: incompatible types: possible lossy conversion from double to int
    switch(score) {
           ^
it will show compiler error becoz  switch(score) uses a double (85.0), but Java does not allow floating-point types (float or double) in switch statements.

In Java, a switch statement only works with certain data types: byte, short, char, int, String, and enum

double and float are not allowed because they can have precision issues 
-------------------------------------------------------------------
corrected code:
public class Switch { 
    public static void main(String[] args) { 
        int score = 85;  // Changed from double to int
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}


