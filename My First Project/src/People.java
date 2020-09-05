import java.util.Scanner;

public class People {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nameInput;
		int ageInput, maxPeople;
		
		System.out.print("Hello! What is your name? ");
		nameInput = input.nextLine();
		
		System.out.print("\n" + nameInput + ", how old are you? ");
		ageInput = input.nextInt();
		
		System.out.print("\nHow many people are there? (Up to 10) ");
		maxPeople = input.nextInt();
		while (maxPeople < 1 || maxPeople > 10) {
			System.out.println();
		}
	}
}
