public class CardDealer 
{
	public static void main(String args[])
	{
		DeckOfCards deck = new DeckOfCards();
		
		System.out.println("Number of cards left (should be 52): " + deck.numLeft() );
		System.out.println("Current contents of deck is:\n" + deck);
		
		Card firstCard = deck.deal();
		
		System.out.println("Dealer just dealt us: " + firstCard);
		System.out.println("Number of cards left (should be 51): " + deck.numLeft() );
		System.out.println("Current contents of deck is (should not include \""+ firstCard+"\"):\n" + deck);
		
		Card secondCard = deck.deal();
		Card thirdCard = deck.deal();
		Card fourthCard = deck.deal();
		Card fifthCard = deck.deal();
		
		System.out.println("Dealer just dealt us: " + secondCard);
		System.out.println("Dealer just dealt us: " + thirdCard);
		System.out.println("Dealer just dealt us: " + fourthCard);
		System.out.println("Dealer just dealt us: " + fifthCard);
		System.out.println("Number of cards left (should be 47): " + deck.numLeft() );
		System.out.println("Current contents of deck is (should not include all dealt cards):\n" + deck);
		
		System.out.println("Our five cards were:\n| "+
		                                                 firstCard+" | "+
				                                         secondCard+" | "+
		                                                 thirdCard+" | "+
				                                         fourthCard+" | "+
		                                                 fifthCard);
		
		deck.collect();
		System.out.println("\nDealer has collected all cards.");
		System.out.println("Number of cards left (should be 52): " + deck.numLeft() );
		System.out.println("Current contents of deck is (should print a full deck):\n" + deck);
		
		
	}
}