/*16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********
-------------------------------*/
public class Pyramidpattern{
 public static void main(String[] args){
    int rows=5; //no. of rows

for(int i = 1; i <= rows; i++){
       for(int j = 1; j <= rows - i; j++){ // printing spaces
          System.out.print(" ");
        }

       for(int k = 1; k <= ( 2 * i - 1); k++){ //printing odd nos. 1,3,5,7
          System.out.print("*");
        }
            System.out.println(); //move to next line
      }
   }
}


/*op: *
   ***
  *****
 *******
*********  */


