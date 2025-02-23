/*12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****
--------------------------*/
public class Starpattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Loop for 5 rows
            for (int j = 1; j <= 5; j++) { // Loop for 5 stars in each row
                System.out.print("*"); // Print star without newline
            }
            System.out.println(); // Move to the next line after printing 5 stars
        }
    }
}

