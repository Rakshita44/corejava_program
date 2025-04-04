package ANP;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
        try {
            // Attempting to access an invalid index in the array 
            int arr[] = new int[10];
            arr[20] = 111;

        } 
        catch (ArithmeticException e) {
            // Catches division by zero errors
            System.out.println(e);
        }
        catch (NullPointerException e) {
            // Catches null pointer exceptions
            System.out.println("Null pointer exception");
        }
        catch (NumberFormatException e) {
            // Catches invalid number format exceptions
            System.out.println("NumberFormatException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Catches out-of-bounds array access errors
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e) {
            // Catches any other exception not handled 
            System.out.println("Global Exception");
        }
        finally {
            // This block always runs
            System.out.println("Finally block");
        }
    }

}/*Output:
ArrayIndexOutOfBoundsException
Finally block
*/
