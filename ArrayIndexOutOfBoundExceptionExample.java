package ANP_D0453;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args)
	{
		try
		{
	  int arr[]=new int[10];
	  arr[20]=111;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	  System.out.println("hii");

	}

}
