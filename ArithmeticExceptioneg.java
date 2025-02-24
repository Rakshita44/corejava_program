package ANP;

public class ArithmeticExceptioneg
{   
	// perform division
	// It takes two integers as input and throw an ArithmeticException 
		public static void divide(int a,int b) throws ArithmeticException
		{
			int ans;
			ans=a/b;// Attempt to divide 'a' by 'b'
			System.out.println(ans);
		}
		
		public static void main(String[] args)
		{
			// The 'try' block is used to execute the divide method that throw an exception
			try
			{
				divide(20,0);
			}
			 // Catch block to handle ArithmeticException if it is thrown
			catch(ArithmeticException ae)
			{
				System.out.println("Number divide by zero");// Print error message
			}
			 
	}
	}
/*Output: 
  Number divide by zero
 */
