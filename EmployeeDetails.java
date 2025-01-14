package ANP;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner scanner= new Scanner(System.in);
		// Declare variables to store employee information
		int employeeId;
		String employeeName;
		String employeeAddress;
		double employeeSalary;
		// Take employee details as input from the user
		System.out.println("Enter Employee ID");
		employeeId= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Employee Name");
		employeeName= scanner.nextLine();// Read the employee name
		
		System.out.println("Enter Employee Address");
		employeeAddress= scanner.nextLine();
		
		System.out.println("Enter Employee Salary");
		employeeSalary= scanner.nextDouble();
		
		// Display the employee details
		System.out.println("\nEmployee Deatils");
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Address:"+employeeAddress);
		System.out.println("Employee Salary:"+employeeSalary);
		
		scanner.close();
		
	}

}
/*Output:
 Enter Employee ID
101
Enter Employee Name
rakshita
Enter Employee Address
Solapur
Enter Employee Salary
1200

Employee Deatils
Employee ID:101
Employee Name:rakshita
Employee Address:Solapur
Employee Salary:1200.0
*/






