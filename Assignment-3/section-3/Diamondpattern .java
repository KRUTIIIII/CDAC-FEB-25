18. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    * 
----------------------*/
public class Diamondpattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the upper half  

        // Upper half (including middle row)
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) { //spaces
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) { //star prints
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half (excluding middle row)
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) { // gives spaces
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
