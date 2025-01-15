package ANP;
import java.util.Scanner;
public class VotingEligibil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
			int age = scanner.nextInt();
			
			if (age >=18) {
				System.out.println("Your are eligibal for vote.");
			}else {
				System.out.println("Your are not eligibale for vote");
			}
			scanner.close();
		}
	

	}

/*Output:
Enter your age:
15
Your are not eligibale for vote

Enter your age:
21
Your are eligibal for vote.

 */
