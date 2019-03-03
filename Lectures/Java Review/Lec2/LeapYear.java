public class LeapYear {
	public static void main(String[] args) {
		//int year = Integer.parseInt(args[0]);
		//int year = 2004;	// true
		//int year = 1900;	// false
		int year = 2004;	// true
		boolean isLeapYear;

		// divisible by 4 but not 100
		isLeapYear = (year % 4 == 0) && (year % 100 != 0);

		// or divisible by 400
		isLeapYear = isLeapYear || (year % 400 == 0);
		System.out.println(isLeapYear);
	}
}