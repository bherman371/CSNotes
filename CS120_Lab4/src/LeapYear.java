import java.util.Scanner;
//*********************************
// LeapYear.java
//
// Reads a year from the user and
// determines if it is a leap year.
//*********************************
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year (after 1582): ");
		int year = input.nextInt();
		if (year < 1582) {
			System.out.println("Please enter a valid year (greater than or equal to 1582).");
			System.exit(0);
		}
		
		System.out.println("");
		
		// checks if entered year is a leap year
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year.");
			}
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
