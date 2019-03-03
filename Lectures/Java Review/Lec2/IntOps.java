public class IntOps {
	public static void main(String[] args) {
		int a = 1234; //Integer.parseInt(args[0]);
		int b = 99; //Integer.parseInt(args[1]);

		int sum = a + b;
		int prod = a * b;
		int quot = a / b;
		int rem = a % b;

		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + prod);
		System.out.println(a + " / " + b + " = " + quot);
		System.out.println(a + " % " + b + " = " + rem);	// Java automatically converts a,b, and rem to type String
	}
}