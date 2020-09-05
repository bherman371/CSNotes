import java.util.Scanner;

public class CollegeAge {

	public static void main(String[] args) throws AgeException {
		final int MIN = 18, MAX = 21;
		
		Scanner input = new Scanner(System.in);
		
		AgeException problem = new AgeException("Input value is out of range.");
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if (age < 18) {
			problem = new AgeException("You are too young for college.");
			throw problem;
		} else if (age > 21) {
			problem = new AgeException("You are too old for college.");
			throw problem;
		}
		
		System.out.println("You may attend college.");
	}
}
