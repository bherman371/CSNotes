import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	
	private int upperLimit;
	private int computerGuess;
	private int userGuess;
	
	// Creates GuessingGame constructor
	public GuessingGame(int n) {
		this.upperLimit = n;
		this.computerGuess = generator.nextInt(n - 1) + 1;
	}
	
	// Prompts the user to guess a number between 1 and the upperLimit set by the user
	public void guess() {
		System.out.print("Guess a number between 1 and " + upperLimit + ": ");
		userGuess = scan.nextInt();
	}
	
	// Creates the win condition that must be met by the user to win
	public boolean userWon() {
		System.out.println("The computer guessed: " + computerGuess);
		if (userGuess == computerGuess) {
			return true;
		} else {
			return false;
		}
	}
}
