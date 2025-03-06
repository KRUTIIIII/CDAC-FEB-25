//6. Develop a program that takes user input for a character and prints whether it is a 
//vowel or consonant. 

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
         
        if("AEIOUaeiou".indexOf(ch) != -1){
            System.out.println(ch + " is a vowel. ");
        }else{
            System.out.println(ch + " is a consonant. ");
        }
         sc.close();
        }
}