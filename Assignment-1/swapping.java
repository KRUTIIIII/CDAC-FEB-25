class swapping{
public static void main(String args[]){
 int x = 10;
int y = 20;
  
System.out.println("Before swapping:");
System.out.println("x: " + x);
System.out.println("y: " + y);


x = x + y; /*10+20=30*/
y = x - y; /*30-20=10*/
x = x - y; /*30-10=20*/

System.out.println("after swapping:");
System.out.println("x: " + x);
System.out.println("y: " + y);

}
}
