//***********************************************************
// Name: Benjamin Herman
// Date: 3/29/20
// Course Name: CS 220
// Semester: 2
// BingoXGame.java
//***********************************************************
public class BingoXGame extends BingoGame {

	private int userFirstX = 0;
	private int userSecondX = 0;
	private int computerFirstX = 0;
	private int computerSecondX = 0;
	
	public BingoXGame(BingoCard u, BingoCard c) {
		super(u, c);
	}
	
	public boolean gameOver() {
		// checks if user's card is marked
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					if (user.getMarked()[i][i]) {
						userFirstX++;
					}
				}
				if (i + j == 4) {
					if (user.getMarked()[i][j]) {
						userSecondX++;
					}
				}
			}
		}
		
		// checks if computer's card is marked
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					if (computer.getMarked()[i][i]) {
						computerFirstX++;
					}
				}
				if (i + j == 4) {
					if (computer.getMarked()[i][j]) {
						computerSecondX++;
					}
				}
			}
		}
		
		// checks if anyone has won
		if ((userFirstX == 5 && userSecondX == 5) && (computerFirstX == 5 && computerSecondX == 5)) {
			return true;
		} else if (userFirstX == 5 && userSecondX == 5) {
			return true;
		} else if (computerFirstX == 5 && userSecondX == 5) {
			return true;
		} else {
			return false;
		}
	}

}
