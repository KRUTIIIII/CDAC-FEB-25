//4. Create a Java program that converts a given integer to a double and vice versa using 
//wrapper classes. 

public class WrapperConversion {
    public static void main(String[] args) {
	 
	 Integer intObj = 50;
	 Double doubleObj = intObj.doubleValue();
	 System.out.println("Integer to Double: " + doubleObj);
	 
	 Double dObj = 99.99;
	 Integer intValue = dObj.intValue();
	 System.out.println("Double to Integer: " + intValue);
    }
}	

/*op: Integer to Double: 50.0
      Double to Integer: 99   */