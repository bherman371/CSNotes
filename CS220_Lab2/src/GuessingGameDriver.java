import java.util.Scanner;

public class GuessingGameDriver 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit for the guessing game: ");
		int limit = input.nextInt();
		
		int numGuesses = 5;
		
		GuessingGame gg = new GuessingGame(limit);
		MyGuessingGame mgg = new MyGuessingGame(limit, numGuesses);

		// prompts the user to guess the number
		mgg.guess(); // Polymorphic

		// checks if the user won
		if ( mgg.userWon() ) // Polymorphic
		{
			System.out.println("You win!!");
		}
		else
		{
			System.out.println("You lose... :(");
		}
	}
}