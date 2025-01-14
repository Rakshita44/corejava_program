package ANP;

import java.util.Scanner;

public class Square_perimeter {
	public static void main(String [] args) {
		 // Create a Scanner object for user input
		Scanner scanner =new Scanner(System.in);
		  // Declare a variable for the side length of the square
		double side;
		System.out.println("Enter the side length of the square");
		side = scanner.nextDouble();
		// Calculate the perimeter of the square
		double perimiter =4* side;
		// Display the result
		System.out.println("The perimiter of the square is :"+perimiter);
		scanner.close();
	}

}
/* Output:
Enter the side length of the square
4
The perimiter of the square is :16.0
*/
