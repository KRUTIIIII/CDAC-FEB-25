/*Write a program that uses a nested switch statement to print out the day of the week based on an integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend.
-----------------------------------*/
import java.util.Scanner; 

public class Dayofweek { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        // Taking user input
        System.out.print("Enter a number (1-7) for the day of the week: "); 
        int day = scanner.nextInt(); 
        
        // Outer switch for day selection
        switch (day) { 
            case 1: 
                System.out.println("Monday");
                breakCheck(day);
                break;
            case 2: 
                System.out.println("Tuesday");
                breakCheck(day);
                break;
            case 3: 
                System.out.println("Wednesday");
                breakCheck(day);
                break;
            case 4: 
                System.out.println("Thursday");
                breakCheck(day);
                break;
            case 5: 
                System.out.println("Friday");
                breakCheck(day);
                break;
            case 6: 
                System.out.println("Saturday");
                breakCheck(day);
                break;
            case 7: 
                System.out.println("Sunday");
                breakCheck(day);
                break;
            default: 
                System.out.println("Invalid input! Please enter a number between 1 and 7."); 
        } 
        
        scanner.close(); 
    }

    // Nested switch to determine if it's a weekday or weekend
    public static void breakCheck(int day) {
        switch (day) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5:
                System.out.println("It is a weekday.");
                break;
            case 6: 
            case 7:
                System.out.println("It is a weekend.");
                break;
        }
    }
}
