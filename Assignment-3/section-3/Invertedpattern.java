/*17. Write a program to print the following pattern: 
***** 
 **** 
  *** 
   ** 
    *

--------------------------------*/
public class Invertedpattern{
  public static void main(String[] args){
      int n=5;
for(int i = n; i >= 1; i--){ //rows
   for(int j = 0; j < n - i; j++){ //spaces
     System.out.print(" ");
    }
   for(int k = 1; k <= i; k++){ //prints * and number of stars decreases as i decreases.
     System.out.print("*");
   }
  System.out.println(); //move to next line
  }
 }
}
