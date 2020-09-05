package lesson1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.");
		int user_input_number = scan.nextInt();
		
		System.out.println("The number entered was " + user_input_number + ".");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a decimal.");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("The number entered was " + user_input_double + ".");
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter a string.");
		String user_input_string = scan2.nextLine();
		
		System.out.println("The string entered was " + user_input_string);
	}

}
