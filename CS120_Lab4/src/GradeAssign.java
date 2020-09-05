import java.util.Scanner;
//*************************************************
// GradeAssign.java
//
// Reads a user's numerical grade and translates
// it into a letter grade.
//*************************************************
public class GradeAssign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your numerical grade: ");
		double grade = input.nextDouble();
		if (grade < 0 || grade > 100) {
			System.out.println("Please enter a valid grade (between 0 and 100).");
			System.exit(0);
		}
		
		System.out.println("");
		
		// checks if user's grade is A, B, C, D, E or F
		if (grade >= 93) {
			System.out.println("Your grade is: A");
		} else if (grade >= 90 && grade <= 92.99) {
			System.out.println("Your grade is: A-");
		} else if (grade >= 87 && grade <= 89.99) {
			System.out.println("Your grade is: B+");
		} else if (grade >= 83 && grade <= 86.99) {
			System.out.println("Your grade is: B");
		} else if (grade >= 80 && grade <= 82.99) {
			System.out.println("Your grade is: B-");
		} else if (grade >= 77 && grade <= 79.99) {
			System.out.println("Your grade is: C+");
		} else if (grade >= 73 && grade <= 76.99) {
			System.out.println("Your grade is: C");
		} else if (grade >= 70 && grade <= 72.99) {
			System.out.println("Your grade is: C-");
		} else if (grade >= 67 && grade <= 69.99) {
			System.out.println("Your grade is: D+");
		} else if (grade >= 63 && grade <= 66.99) {
			System.out.println("Your grade is: D");
		} else if (grade >= 60 && grade <= 62.99) {
			System.out.println("Your grade is: D-");
		} else if (grade >= 0 && grade <= 59.99) {
			System.out.println("Your grade is: F");
		}
	}

}
