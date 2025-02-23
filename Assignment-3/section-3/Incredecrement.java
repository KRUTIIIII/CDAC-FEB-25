/* 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression */

public class Incredecrement {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int result = ++a + b--; // Pre-increment 'a', Post-decrement 'b'

        System.out.println("Result: " + result);
        System.out.println("Updated a: " + a);
        System.out.println("Updated b: " + b);
    }
}

/*op:Result: 16
Updated a: 6       (here ++a means a becomes 6 before use )
Updated b: 9     (here b-- means b is used as 10,then decreases to 9 afterwards)*/ 