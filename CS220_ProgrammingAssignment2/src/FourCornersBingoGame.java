//***********************************************************
// Name: Benjamin Herman
// Date: 3/29/20
// Course Name: CS 220
// Semester: 2
// FourCornersBingoGame.java
//***********************************************************
public class FourCornersBingoGame extends BingoGame {
	
	public FourCornersBingoGame(BingoCard u, BingoCard c) {
		super(u, c);
	}
	
	public boolean gameOver() {
		// checks if anyone has won
		if ((user.getMarked()[0][0] && user.getMarked()[0][4] && user.getMarked()[4][0] && user.getMarked()[4][4]) && (computer.getMarked()[0][0] && computer.getMarked()[0][4] && computer.getMarked()[4][0] && computer.getMarked()[4][4])) {
			return true;
		} else if (user.getMarked()[0][0] && user.getMarked()[0][4] && user.getMarked()[4][0] && user.getMarked()[4][4]) {
			return true;
		} else if (computer.getMarked()[0][0] && computer.getMarked()[0][4] && computer.getMarked()[4][0] && computer.getMarked()[4][4]) {
			return true;
		} else {
			return false;
		}
	}

}
