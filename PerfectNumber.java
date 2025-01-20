package ANP;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not perfect numbers
        }
        
        int sum = 0;
        
        // all divisors of num excluding the number itself
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // If the sum of divisors equals the number, it is a perfect number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check and display if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }
}

/*Output:
Enter a number: 6
6 is a perfect number.

Enter a number: 12
12 is not a perfect number.

 */
