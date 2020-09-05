import java.util.Random;
import java.util.Scanner;

public class MyGuessingGame extends GuessingGame {

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	
	private int[] userGuesses = new int[5];
	
	private int upperLimit;
	private int numGuesses;
	private int computerGuess;
	private int userGuess;
	private int correct = 0;
	
	/* Creates the MyGuessingGame constructor while invoking
	 * the GuessingGame constructor with super(n) */
	public MyGuessingGame(int n, int g) {
		super(n);
		this.upperLimit = n;
		this.numGuesses = g;
		this.computerGuess = generator.nextInt(n - 1) + 1;
	}
	
	// allows user to guess three times rather than just once
	public void guess() {
		for (int i = 0; i < numGuesses; i++) {
			System.out.print("Guess a number between 1 and " + upperLimit + ": ");
			userGuesses[i] = scan.nextInt();
		}
	}
	
	// has the same win condition as GuessingGame
	public boolean userWon() {
		System.out.println("The computer guessed: " + computerGuess);
		for (int i = 0; i < numGuesses; i++) {
			if (userGuesses[i] == computerGuess) {
				correct++;
			}
		}
		if (correct >= 1) {
			return true;
		} else {
			return false;
		}
	}

}
