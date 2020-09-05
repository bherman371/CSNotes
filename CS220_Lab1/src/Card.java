
public class Card {
	private int suit;
	private int faceValue;
	
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;
	public static final int TOTAL_SUITS = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int TOTAL_VALUES = 13;

	public Card(int s, int fv)
	{
		suit = s;
		faceValue = fv;
	}
	
	public String toString()
	{
		String s = "";
		
		switch (faceValue)
		{
			case ACE:
				s += "A";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				s += faceValue;
				break;
			case JACK:
				s += "J";
				break;
			case QUEEN:
				s += "Q";
				break;
			case KING:
				s += "K";
				break;
		}

		switch (suit)
		{
			case CLUBS:
				s += " of clubs";
				break;
			case DIAMONDS:
				s += " of diamonds";
				break;
			case HEARTS:
				s += " of hearts";
				break;
			case SPADES:
				s += " of spades";
				break;
		}
		
		return s;
	}
}