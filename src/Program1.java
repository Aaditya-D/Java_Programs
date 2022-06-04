public class Program1 {
	/**
	 * Even number has no remainder while odd numbers have
	 *  Last place of even number is always 0 in binary
	 */

	static void naive(int n) {
		System.out.println(n % 2 == 0 ? "The value is Even !" : "The value is Odd !");
	}

	static String leastSignificantBit(int n) {
		if (n != 0) {
			if (Integer.toBinaryString(n).endsWith("0")) {
				return "The number is Even !";
			} else {
				return "The number is Odd !";
			}
		} else {
			return "Zero";
		}
	}

	public static void main(String[] args) {
//		naive(59);
		for (int i = 0; i <= 10; i++) {
			String res = leastSignificantBit(i);
			System.out.println(i + ": " + res);
		}
	}
}
