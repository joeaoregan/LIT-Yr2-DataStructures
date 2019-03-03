public class Shuffle {
	public static void main(String[] args) {
		String[] rank = {
			"2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King", "Ace"
			};
		String[] suit = {
			"Clubs", "Diamonds", "Hearts", "Spades"
			};
		int i = (int) (Math.random() * 13);	// between 0 and 12
		int j = (int) (Math.random() * 4);	// between 0 and 3
		
		System.out.println(rank[i] + " of " + suit[j]);
	}
}