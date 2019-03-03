// Print powers of 2 that are <= 2 to the power of N

public class PowersOfTwo {
	public static void main(String[] args) {
		// last power of two to print
		// int N = Integer.parseInt(args[0]);
		int i = 0;								// loop control counter
		int v = 1;								// current power of two
		int N = 7;

		while (i <= N)							// increment i from 0 to N
		{
			System.out.println(i + " " + v);	// print i and ith power of two
			i = i + 1;							// increment i
			v = 2 * v;							// Double v
		}
	}
}