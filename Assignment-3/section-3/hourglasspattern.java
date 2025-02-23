/*22. Write a program to print the following pattern: 
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
*********
*/
public class hourglasspattern {
    public static void main(String[] args) {
        int n = 5; // Maximum number of stars in the first row

        // Upper half  
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half  
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
