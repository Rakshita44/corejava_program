package ANP;

public class Autoboxing {
	 public static void main(String[] args) {
	       
	        // For int 
	        int intValue = 10;
	        Integer integerValue = intValue;  // autoboxing
	        System.out.println("Autoboxing of int: " + integerValue);
	        
	     // For float 
	        float floatValue = 25.75f;
	        Float floatObject = floatValue;  // autoboxing
	        System.out.println("Autoboxing of float: " + floatObject);
	        
	     // For char 
	        char charValue = 'A';
	        Character charObject = charValue;  // autoboxing
	        System.out.println("Autoboxing of char: " + charObject);
	        
	        // For double 
	        double doubleValue = 15.5;
	        Double doubleObject = doubleValue;  // autoboxing
	        System.out.println("Autoboxing of double: " + doubleObject);
	        
	     // For long 
	        long longValue = 100L;
	        Long longObject = longValue;  // autoboxing
	        System.out.println("Autoboxing of long: " + longObject);
	        
	        // For boolean  
	        boolean booleanValue = true;
	        Boolean booleanObject = booleanValue;  // autoboxing
	        System.out.println("Autoboxing of boolean: " + booleanObject);
	        
	        // Short 
	        short shortValue = 25;
	        Short shortObj = shortValue;  // Autoboxing
	        System.out.println("Short value: " + shortObj);

	     
	        
	    }

}
/* Output:
Autoboxing of int: 10
Autoboxing of float: 25.75
Autoboxing of char: A
Autoboxing of double: 15.5
Autoboxing of long: 100
Autoboxing of boolean: true
Short value: 25
*/

