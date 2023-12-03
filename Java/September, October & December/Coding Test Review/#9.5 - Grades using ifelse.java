import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Grade: ");
	int grade = scanner.nextInt();

		if ((grade >= 90) && (grade <= 105)) {
			System.out.println("You got an A+!");
		} else if (grade <= 90) {
			System.out.println("You got an A-!");
		} else if (grade <= 80) {
			System.out.println("You got a B!");
		} else if (grade <= 70) {
				System.out.println("You got a C!");
		}  else if (grade <= 60) {
				System.out.println("You got a D!");
		}  else if ((grade < 50) && (grade >= 0)) {
				System.out.println("You failed!");
		} else {
			System.out.println("Invalid Grade");
		}
	scanner.close(); 
	}    
}
