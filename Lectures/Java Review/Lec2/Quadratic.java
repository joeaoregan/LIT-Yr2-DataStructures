public class Quadratic {
	public static void main(String[] args) {
		// parse coefficients from command-line
		//double b = Double.parseDouble(args[0]);
		//double c = Double.parseDouble(args[1]);
		//double b = -3.0;
		//double c = 2.0;
		//double b = -1.0;	// golden ratio
		//double c = -1.0;
		double b = 1.0;		// NaN - not a number
		double c = 1.0;

		// calculate roots
		double discriminant = b*b - 4.0*c;
		double d = Math.sqrt(discriminant);
		double root1 = (-b + d) / 2.0;
		double root2 = (-b - d) / 2.0;

		// print them out
		System.out.println(root1);
		System.out.println(root2);
	}
}