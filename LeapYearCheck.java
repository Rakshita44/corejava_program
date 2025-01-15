package ANP;
import java.util.Scanner;
public class LeapYearCheck {
	    public static boolean isLeapYear(int year) {
	        //if the year is divisible by 4
	        if (year % 4 == 0) {
	            // If the year is divisible by 100, it should be divisible by 400
	            if (year % 100 == 0) {
	                // If divisible by 400, it is a leap year
	                if (year % 400 == 0) {
	                    return true;
	                }else {
	                    return false;
	                }
	            }else {
	                return true;  // Year divisible by 4 but not by 100 is a leap year
	            }
	        }else {
	            return false; // Year not divisible by 4 is not a leap year
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	  
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        
	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	       
	        scanner.close();
	    }
	}

/*Output:
Enter a year: 2025
2025 is not a leap year.

Enter a year: 2024
2024 is a leap year.

*/
