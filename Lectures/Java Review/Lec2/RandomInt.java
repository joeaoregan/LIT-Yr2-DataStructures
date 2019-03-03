public class RandomInt {
	public static void main(String[] args) {
		//int N = Integer.parseInt(args[0]);	// String to int (method)
		int N = 6;
		//int N = 10000;
		double r = Math.random();	// double between 0.0 and 1.0
		int n = (int) (r * N);

		System.out.println("random integer is " + n);
	}
}