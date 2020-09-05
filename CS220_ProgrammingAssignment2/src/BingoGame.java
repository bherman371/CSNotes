import java.util.Random;
//***********************************************************
// Name: Benjamin Herman
// Date: 3/29/20
// Course Name: CS 220
// Semester: 2
// BingoGame.java
//***********************************************************
public class BingoGame implements Winnable {

	Random generator = new Random();
	
	protected BingoCard user;
	protected BingoCard computer;
	private boolean[] drawn = new boolean[75];
	private int userRowMarked = 0;
	private int userDiagonalMarked = 0;
	private int userColumnMarked = 0;
	private int computerRowMarked = 0;
	private int computerDiagonalMarked = 0;
	private int computerColumnMarked = 0;
	protected boolean tie;
	
	public BingoGame(BingoCard u, BingoCard c) {
		this.user = u;
		this.computer = c;
	}
	
	public int draw() {
		int num = generator.nextInt(75) + 1;
		
		// checks if a number has been drawn
		for (int i = 0; i < drawn.length; i++) {
			if (drawn[i] == false) {
				user.mark(num);
				computer.mark(num);
				drawn[i] = true;
				break;
			}
		}
		
		return num;
	}
	
	public boolean gameOver() {
		// checks if user's card has been marked
		for (int i = 0; i < user.getMarked()[0].length; i++) {
			for (int j = 0; j < user.getMarked().length; j++) {
				if (user.getMarked()[i][j]) {
					userRowMarked++;
				}
				if (user.getMarked()[j][i]) {
					userColumnMarked++;
				}
			}
			if (user.getMarked()[i][i]) {
				userDiagonalMarked++;
			}
		}
		
		// checks if computer's card has been marked
		for (int i = 0; i < computer.getMarked()[0].length; i++) {
			for (int j = 0; j < computer.getMarked().length; j++) {
				if (computer.getMarked()[i][j]) {
					computerRowMarked++;
				}
				if (computer.getMarked()[j][i]) {
					computerColumnMarked++;
				}
			}
			if (computer.getMarked()[i][i]) {
				computerDiagonalMarked++;
			}
		}
		
		// checks if user and computer tied
		for (int i = 0; i < user.getMarked()[0].length; i++) {
			for (int j = 0; j < user.getMarked().length; j++) {
				if ((user.getMarked()[i][j] || user.getMarked()[i][i] || user.getMarked()[j][i]) && (computer.getMarked()[i][j] || computer.getMarked()[i][i] || computer.getMarked()[j][i])) {
					tie = true;
				} else {
					tie = false;
				}
			}
		}
		
		// checks if anyone has won
		if (userRowMarked == 5 || userDiagonalMarked == 5 || userColumnMarked == 5) {
			System.out.println("User wins!");
			return true;
		} else if (computerRowMarked == 5 || computerDiagonalMarked == 5 || computerColumnMarked == 5) {
			System.out.println("Computer wins.");
			return true;
		} else if (tie == true) {
			System.out.println("Tied.");
			return true;
		} else {
			System.out.println("Continue.");
			return false;
		}
		
	}
	
	public void play() {
		while (!gameOver()) {
			System.out.println("USER");
			System.out.println("-------------");
			System.out.println(user);
			System.out.println("COMPUTER");
			System.out.println("--------------");
			System.out.println(computer);
			System.out.println("===============");
			String letter = "";
			int call = draw();
			// decides which letter to print based on the number called
			if (call <= 15) {
				letter = "B";
			} else if (call <= 30) {
				letter = "I";
			} else if (call <= 45) {
				letter = "N";
			} else if (call <= 60) {
				letter = "G";
			} else if (call <= 75) {
				letter = "O";
			}
			System.out.println("Calling: " + letter + "-" + call);
		}
	}

}
