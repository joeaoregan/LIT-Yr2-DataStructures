// Coupon Collector

public class CouponCollector {
	public static void main(String[] args) {
		// int N = Integer.parseInt(args[0]);
		int N = 6;
		int cardcnt = 0;	// number of cards collected
		int valcnt = 0;		// number of distinct cards

		// do simulation
		boolean[] found = new boolean[N];
		while (valcnt < N) {
			int val = (int) (Math.random() * N);
			cardcnt++;
			if (!found[val]) {
				valcnt++;
				found[val] = true;
			}
			System.out.println(val + " " + valcnt + " " + cardcnt);	// print all variables
		}

		// all N distinct cards found
		System.out.println(cardcnt);
	}
}