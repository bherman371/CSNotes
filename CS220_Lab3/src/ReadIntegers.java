import java.util.Scanner;

public class ReadIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int RANGE = 11;
		int sum = 0;
		
		String numString;
		int num;
		double average;
		
		// takes in 10 integers from the user
		for (int i = 1; i < RANGE; i++) {
			System.out.print("Enter integer #" + i + ": ");
			numString = input.nextLine();
			
			// sees if the user entered an integer
			try {
				num = Integer.parseInt(numString);
				sum += num;
			} catch (NumberFormatException nfe) {
				System.out.println("\nThis is not a valid integer. Please try again...");
				i -= 1;
			}
		}
		
		average = (double) sum / 10;
		
		System.out.println("\nThe average of your numbers is: " + average);
	}
	
}
