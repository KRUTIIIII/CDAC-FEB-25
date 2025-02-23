/*19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5
----------------------------*/
public class Numberstar {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for numbers in each row
                System.out.print(j); // Prints number
                if (j < i) { // Adds '*' between numbers, but not at the end
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
