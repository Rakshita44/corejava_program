package ANP;

public class Unboxing {
	 public static void main(String[] args) {
	        
	        // For Integer (wrapper class)
	        Integer integerValue = 10;
	        int intValue = integerValue;  // unboxing
	        System.out.println("Unboxing of Integer: " + intValue);
	        
	        
	        // For Float  
	        Float floatObj = 25.75f;
	        float floatValue = floatObj;  // unboxing
	        System.out.println("Unboxing of Float: " + floatValue);
	        

	        // For Character 
	        Character charObj = 'A';
	        char charValue = charObj;  // unboxing
	        System.out.println("Unboxing of Character: " + charValue);
	        
	        // For Double 
	        Double doubleObj = 15.5;
	        double doubleValue = doubleObj;  // unboxing
	        System.out.println("Unboxing of Double: " + doubleValue);
	           
	     // For Long 
	        Long longObj = 100L;
	        long longValue = longObj;  // unboxing
	        System.out.println("Unboxing of Long: " + longValue);
	        
	     // For Boolean 
	        Boolean booleanObj = true;
	        boolean booleanValue = booleanObj;  // unboxing
	        System.out.println("Unboxing of Boolean: " + booleanValue);
	       
	        // For Short
	        Short shortObject = 20;
	        short shortValue = shortObject;  // unboxing
	        System.out.println("Unboxing of Short: " + shortValue);
	        
	        
	    }

}
/*Output:
 Unboxing of Integer: 10
Unboxing of Float: 25.75
Unboxing of Character: A
Unboxing of Double: 15.5
Unboxing of Long: 100
Unboxing of Boolean: true
Unboxing of Short: 20
*/
