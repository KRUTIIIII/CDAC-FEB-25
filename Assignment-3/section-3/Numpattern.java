/*23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555*/

public class Numpattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i); // Print the row number
            }
            System.out.println(); // Move to the next line
        }
    }
}
