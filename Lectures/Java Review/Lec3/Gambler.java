// Probability of winning = stake / goal
// Expected number of bets = stake x desired gain

public class Gambler {
	public static void main(String[] args) {
		// int stake = Integer.parseInt(args[0]);
		// int stake = 5;
		int stake = 500;						// takes a while
		// int goal = Integer.parseInt(args[1]);
		// int goal = 25;
		int goal = 2500; 						// takes a while
		// int T = Integer.parseInt(args[2]);
		int T = 1000;
		int wins = 0;
		// repeaet experiment T times
		for (int t = 0; t < T; t++) {
			// do one gambler's ruin experiment
			int cash = stake;
			while (cash > 0 && cash < goal) {
				// flip coin and update
				if (Math.random() < 0.5) cash++;
				else 			 cash--;
			}
			if (cash == goal) wins++;
		}
		System.out.println(wins + " wins of " + T);
	}
}