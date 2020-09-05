import java.util.Random;

public class DeckOfCards 
{
	Random generator = new Random();
	
	private Card[][] deck = new Card[Card.TOTAL_SUITS][Card.TOTAL_VALUES];
	private boolean[][] dealt = new boolean[Card.TOTAL_SUITS][Card.TOTAL_VALUES];
	private int numLeft;
	
	public DeckOfCards()
	{
		for (int suitVal = 0; suitVal < 4; suitVal++) {
			for (int faceVal = 0; faceVal < 13; faceVal++) {
				deck[suitVal][faceVal] = new Card(suitVal, faceVal + 1);
			}
		}
		numLeft = 52;
	}
	
	public Card deal()
	{
	    while (true) {
	    	int suit = generator.nextInt(4);
	    	int faceValue = generator.nextInt(13);
	    	
	    	if (!dealt[suit][faceValue]) {
	    		dealt[suit][faceValue] = true;
	    		numLeft--;
	    		return deck[suit][faceValue];
	    	}
	    }
	}
	
	public int numLeft()
	{
	    return numLeft;
	}
	
	public void collect()
	{
	    numLeft = 52;
	    dealt = new boolean[Card.TOTAL_SUITS][Card.TOTAL_VALUES];
	}
	
	public String toString()
	{
		String s = "";
		
		for (int suit = 0; suit < dealt.length; suit++)
		{
			s += "|";
			for (int faceV = 0; faceV < dealt[0].length; faceV++)
			{
				if (!dealt[suit][faceV]) {
					s += " " + deck[suit][faceV].toString() + " |";
				}
			}
			s += "\n";
		}
		
		return s;
	}
}