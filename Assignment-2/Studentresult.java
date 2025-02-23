/*Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.
----------------------------------------*/
 
import java.util.Scanner;

public class Studentresult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//take user ip 
        
        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        
        // Count the number of failed subjects
        int failedSubjects = 0;
        failedSubjects += (subject1 < 40) ? 1 : 0;
        failedSubjects += (subject2 < 40) ? 1 : 0;
        failedSubjects += (subject3 < 40) ? 1 : 0;
        
        // Determine pass or fail using nested switch
        switch (failedSubjects) {
            case 0:
                System.out.println("Student Passed!");
                break;
            default:
                System.out.println("Student Failed in " + failedSubjects + " subject(s).");
                break;
        }
        
        scanner.close();
    }
}
