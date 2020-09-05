import java.util.Random;

public class DeckOfCardsTest {

	Card[][] deck = new Card[4][13];
	boolean[][] dealt = new boolean[4][13];
	int numLeft = 52;
	
	Random generator = new Random();
	
	int randRow = generator.nextInt(4);
	int randCol = generator.nextInt(13);
	
	public DeckOfCardsTest() {
		
	}
	
	// deal method, numLeft method, collect method
	public Card deal() {
		numLeft--;
		return null;
	}
	
	public int numLeft() {
		return (Integer) null;
	}
	
	public void collect() {
		numLeft = 52;
	}
	
	public String toString() {
		return null;
	}
	
	// 0 to 12 - Clubs; 13 to 25 - Diamonds; 26 to 38 - Hearts; 39 to 51 - Spades
}