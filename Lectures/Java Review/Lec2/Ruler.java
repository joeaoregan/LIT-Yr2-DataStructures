public class Ruler {
	public static void main(String[] args) {
		String ruler1 = "1";						// 1
		String ruler2 = ruler1 + " 2 " + ruler1;	// 1 2 1
		String ruler3 = ruler2 + " 3 " + ruler2;	// 1 2 1 3 1 2 1
		String ruler4 = ruler3 + " 4 " + ruler3;	// string concatenation
		System.out.println(ruler4);
	}
}