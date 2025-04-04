package ANP;
import java.util.Arrays;
import java.util.Collections;
public class DescendingArray 
{
	public static void main(String[] args) 
	  {
	        //array of strings
	        String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};
	        
	        // Print the original array
	        System.out.println("Original Array: " + Arrays.toString(letters));
	        
	        // Sort the array in descending order
	        Arrays.sort(letters, Collections.reverseOrder());
	        
	        // Print the sorted array
	        System.out.println("Sorted Array:" + Arrays.toString(letters));
	   }
}
/*Output:
Original Array: [A, X, D, Z, Y, C, W, B]
Sorted Array: [Z, Y, X, W, D, C, B, A]
*/