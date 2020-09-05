//*******************************************************
// Name: Benjamin Herman
// Course Name: CS120 - Computer Programming I
// Date: 11/13/19
// Semester: 1
//
// Diamonds.java
//
// Reads a size from the user and makes sure it's odd.
// Uses that size to print X's in certain places to
// create a diamond.
//*******************************************************
import java.util.Scanner;
public class Diamonds {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the diamond (odd number, -1 to exit): ");
		int size = input.nextInt();
		
		// exits the program if size = -1
		if (size == -1) {
			System.out.println("Goodbye.");
		}
		
		// asks the user for another size if they enter an even number
		while (size % 2 == 0 || size < 0 && size != -1) {
			System.out.println("Invalid diamond size --- must be an odd number.");
			System.out.println();
			System.out.print("Reenter the size of the diamond: ");
			size = input.nextInt();
		}
		
		while (size != -1) {
			for (int row = 0; row < size; row++) {
				for (int col = 0; col <= size; col++) {
					// checks where to print the X's
					if ((row + col) == (size / 2)) {
						System.out.print("X");
					} else if ((col - row) == (size / 2) + 1) {
						System.out.print("X");
					} else if ((row - col) == (size / 2)) {
						System.out.print("X");
					} else if (((row + col) - size) == (size / 2)) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
			
			System.out.println();
			System.out.print("Enter the size of the diamond (odd number, -1 to exit): ");
			size = input.nextInt();
			
			// asks the user for another size if they enter an even number
			while (size % 2 == 0 || size < 0 && size != -1) {
				System.out.println("Invalid diamond size --- must be an odd number.");
				System.out.println();
				System.out.print("Reenter the size of the diamond: ");
				size = input.nextInt();
			}
		}
		
		// exits the program if size = -1
		System.out.println("Goodbye!");
	}

}
