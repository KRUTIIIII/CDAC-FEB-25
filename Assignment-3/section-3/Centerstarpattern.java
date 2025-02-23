/*15. Write a program to print the following pattern: 
 * 
 ** 
 *** 
 **** 
 *****

---------------------------*/
public class Centerstarpattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
