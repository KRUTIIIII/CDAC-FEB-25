/*13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1 
--------------------------------------*/
public class Numberstarpattern {
    public static void main(String[] args) {
        int n = 5; // Maximum number in the pattern

        // First half (1 to 5)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print number
                if (j < i) { // Print '*' except for the last number in the row
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to next line
        }

        // Second half (5 to 1)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print number
                if (j < i) { // Print '*' except for the last number in the row
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
