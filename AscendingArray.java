package ANP;
import java.util.Arrays;
public class AscendingArray 
{

	public static void main(String[] args) 
	{
		 // array of integers
        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};
        
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
/*Output:
Original Array: [45, 35, 56, 67, 78, 89, 78, 12, 20]
Sorted Array: [12, 20, 35, 45, 56, 67, 78, 78, 89]

 */




	
		       