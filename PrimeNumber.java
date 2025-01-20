package ANP;

import java.util.Scanner;

public class PrimeNumber {
	// If number is less than 2, it's not prime
	public static boolean isPerfectNumber(int num) {
		if (num<= 1) {
			return false;
		}
		// Check divisibility from 2 to sqrt(num)
		for (int i = 2; i<=Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;// Number is divisible by i, so it's not prime
			}
		}
		return true;// Number is prime if no divisors were found

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//user input
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		// Check and display if the number is prime
		if (isPerfectNumber(number)) {
			System.out.println(number+"is a prime number.");
		}else {
			System.out.println(number +"is not a prime number.");
		}
		scanner.close();
	}

}
/*Output:
Enter a number:
5
5is a prime number.

Enter a number:
10
10is not a prime number.

 */
