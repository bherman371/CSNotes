import java.util.Scanner;
//***************************************
// EvenSum.java
//
// Reads a number from the user. Sums up
// all even numbers less than or equal
// the number entered.
//***************************************
public class EvenSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int limit;
		
		System.out.print("Enter a number (greater than 1): ");
		limit = input.nextInt();
		
		// exits program if number entered isn't greater than 1
		if (limit <= 1) {
			System.out.println("Please enter a number greater than 1.");
			System.exit(0);
		}
		
		// sums up all even numbers less than or equal to number entered
		for (int mult = 2; mult <= limit; mult += 2) {
			num += mult;
		}
		
		System.out.println();
		System.out.println("The sum of all even numbers less than or equal to " + limit + " is " + num);
	}
}
