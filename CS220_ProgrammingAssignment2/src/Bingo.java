// Programmer: Daniel Ayala
// Bingo.java - Programming Assignment #2
// CS 220 - Computer Programming II
// Driver class that runs the possible Bingo games and illustrates the use of polymorphism.


import java.util.Scanner;

public class Bingo 
{
	public static void main(String[] args) 
	{
		BingoGame game = null;
		Scanner scan = new Scanner(System.in);
		
		int option;
		do
		{
			System.out.println("What type of Bingo game would you like to play?");
			System.out.println("\t1. Standard Bingo\n\t2. Four Corners Bingo\n\t3. X Bingo\n\t4. Full Card Bingo");
			System.out.print("Select option: ");
		
			option = scan.nextInt();
		
			BingoCard user = new BingoCard();
			BingoCard computer = new BingoCard();
			
			switch (option)
			{
				case 1:
					game = new BingoGame(user, computer);
					break;
				case 2: 
					game = new FourCornersBingoGame(user, computer);
					break;
				case 3:
					game = new BingoXGame(user, computer);
					break;
				case 4:
					game = new FullCardBingoGame(user, computer);
					break;
				default:
					System.out.println("Select an option between 1 and 4. \n");
			}
		} while (option < 1 || option > 4);
		
		game.play(); // POLYMORPHIC STATEMENT
	}
}