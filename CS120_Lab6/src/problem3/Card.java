package problem3;

import java.util.Random;
//**********************************************
// Card.java
//
// Generates random cards from a standard deck
// of cards.
//**********************************************
public class Card {

	Random generator = new Random();
	
	public int faceValue;
	public int suit;
	
	public Card() {
		faceValue = generator.nextInt(13) + 1;
		suit = generator.nextInt(4) + 1;
	}
	
	public String toString() {
		String suitString = "";
		
		// checks for the suit
		switch (suit) {
			case 1:
				suitString = " of Hearts";
				break;
			case 2:
				suitString = " of Diamonds";
				break;
			case 3:
				suitString = " of Spades";
				break;
			case 4:
				suitString = " of Clubs";
				break;
		}
		
		String faceString = "";
		
		// checks for special face values such as Ace, Jack, Queen and King
		switch (faceValue) {
			case 1:
				faceString = "A";
				break;
			case 11:
				faceString = "J";
				break;
			case 12:
				faceString = "Q";
				break;
			case 13:
				faceString = "K";
				break;
		}
		
		// checks what to print based on the value of faceString
		return (faceString != "") ? faceString + suitString : faceValue + suitString;
	
	}
}

