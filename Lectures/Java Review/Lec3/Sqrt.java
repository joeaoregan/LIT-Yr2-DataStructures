// Newton-Raphson method to compute the square root of c
// Initialise t0 = c
// Repeat until t1 = c / t1, up to desired precision:
// set ti+1 to be the average of t1 and c / t1
// 15 decimal digits of accuracy in 5 iterations

public class Sqrt {
	public static void main(String[] args) {
		double epsilon = 1e-15;
		// double c = Double.parseDouble(args[0]);
		double c = 2;
		double t = c;
		while (Math.abs(t - c/t) > t*epsilon) { // relative error tolerance
			t = (c/t + t) / 2.0;
		}
		System.out.println(t);
	}
}