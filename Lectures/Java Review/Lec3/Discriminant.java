public class Discriminant {
	public static void main(String[] args) {
		//double b = 2;	// No real roots
		double b = 5;
		double c = 3;

		double discriminant = b*b - 4.0*c;
		if (discriminant < 0.0)
		{
			System.out.println("No real roots");
		}
		else
		{
			System.out.println((-b + Math.sqrt(discriminant))/2.0);
			System.out.println((-b - Math.sqrt(discriminant))/2.0);
		}
	}
}