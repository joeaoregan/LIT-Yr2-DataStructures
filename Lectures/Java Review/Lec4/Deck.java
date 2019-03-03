// Create a deck of playing cards and print them out

public class Deck {
	public static void main(String[] args) {
		String[] rank = {
			"2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King", "Ace"
			};
		String[] suit = {
			"Clubs", "Diamonds", "Hearts", "Spades"
			};
		//int i = (int) (Math.random() * 13);	// between 0 and 12
		//int j = (int) (Math.random() * 4);	// between 0 and 3

		//System.out.println(rank[i] + " of " + suit[j]);

		String[] deck = new String[52];
		for (int i = 0; i < 13; i++)
			for (int j = 0; j < 4; j++)
				deck[4*i +j] = rank[i] + " of " + suit[j];

		for (int i = 0; i < 52; i++)
			System.out.println(deck[i]);
	}
}