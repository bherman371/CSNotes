import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arrayLimit, numInput;
		
		System.out.println("Hello World!");
		
		System.out.print("Please enter an integer (1 to 10): ");
		arrayLimit = input.nextInt();
		
		while (arrayLimit < 1 || arrayLimit > 10) {
			System.out.println("The number must be between 1 and 10.");
			
			System.out.print("\nPlease enter an integer (1 to 10): ");
			arrayLimit = input.nextInt();
		}
		
		int[] integers = new int[arrayLimit];
		
		System.out.println();
		
		for (int i = 0; i < integers.length; i++) {
			System.out.print("Enter a number from 1 to 5 (" + (i + 1) + " of " + arrayLimit + "): ");
			numInput = input.nextInt();
			while (numInput < 1 || numInput > 5) {
				System.out.print("\nThe number must be between 1 and 5.");
				
				System.out.print("\nEnter a number from 1 to 5 (" + (i + 1) + " of " + arrayLimit + "): ");
				numInput = input.nextInt();
			}
			integers[i] = numInput;
		}
		
		System.out.println();
		
		for (int i = 0; i < integers.length; i++) {
			if (i < integers.length - 1) {
				System.out.print(integers[i] + ", ");
			} else {
				System.out.print(integers[i]);
			}
		}
	}
}
