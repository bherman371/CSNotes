//***********************************************************
// Name: Benjamin Herman
// Date: 3/29/20
// Course Name: CS 220
// Semester: 2
// FullCardBingoGame.java
//***********************************************************
public class FullCardBingoGame extends BingoGame {

	private int userCardMarked = 0;
	private int computerCardMarked = 0;
	
	public FullCardBingoGame(BingoCard u, BingoCard c) {
		super(u, c);
	}
	
	public boolean gameOver() {
		// checks if user's card is marked
		for (int i = 0; i < user.getMarked()[0].length; i++) {
			for (int j = 0; j < user.getMarked().length; j++) {
				if (user.getMarked()[i][j]) {
					userCardMarked++;
				}
			}
		}
		
		// checks if user's card is marked
		for (int i = 0; i < computer.getMarked()[0].length; i++) {
			for (int j = 0; j < computer.getMarked().length; j++) {
				if (computer.getMarked()[i][j]) {
					computerCardMarked++;
				}
			}
		}
		
		// checks if anyone has won
		if (userCardMarked == 25 && computerCardMarked == 25) {
			return true;
		} else if (userCardMarked == 25) {
			System.out.println("User wins!");
			return true;
		} else if (computerCardMarked == 25) {
			System.out.println("Computer wins.");
			return true;
		} else {
			System.out.println("Continue.");
			return false;
		}
		
	}

}
