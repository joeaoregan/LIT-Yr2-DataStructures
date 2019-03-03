// Print powers of 2

public class PowersOfTwoFor {
	public static void main(String[] args) {
		// last power of two to print
		// int N = Integer.parseInt(args[0]);
		//int i = 0;								// loop control counter
		int v = 1;								// current power of two
		int N = 7;

		for (int i = 0; i <= N; i++)							// increment i from 0 to N
		{
			System.out.println(i + " " + v);	// print i and ith power of two
			v = 2 * v;							// Double v
		}
	}
}