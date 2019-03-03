// Create subdivision of a ruler
// for loop

public class RulerN {
	public static void main(String[] args) {
		// int N = Integer.parseInt(args[0]);
		// int N = 4;
		int N = 5;
		String ruler = " ";
		for (int i = 1; i <= N; i++) {
			ruler = ruler + i + ruler;
		}
		System.out.println(ruler);
}
}