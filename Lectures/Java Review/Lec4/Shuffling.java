// Given an array, rearrange its elements in random order

public class Shuffling {
	public static void main(String[] args) {
		String[] rank = {
			"2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King", "Ace"
			};
		String[] suit = {
			"Clubs", "Diamonds", "Hearts", "Spades"
			};

		String[] deck = new String[52];
		for (int i = 0; i < 13; i++)
			for (int j = 0; j < 4; j++)
				deck[4*i +j] = rank[i] + " of " + suit[j];

		int N = deck.length;
		for (int i = 0; i < N; i++) {
			int r = i + (int) (Math.random() * (N-i));
			String t = deck[r];
			deck[r] = deck[i];
			deck[i] = t;
		}

		for (int i = 0; i < 52; i++)
			System.out.println(deck[i]);
	}
}