import java.util.Scanner;

public class Program2 {

	static int ternary(int x, int y, int z) {
		return z > (x > y ? x : y) ? z : (x > y ? x : y);
	}

	static int conditional(int x, int y, int z) {
		if (x >= y && x >= z) {
			return x;
		} else if (y >= x && y >= z) {
			return y;
		} else {
			return z;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b && b == c && c == a) {
			System.out.println("All entered numbers are same !");
		} else {
//			int largest = ternary(a,b,c);
//			System.out.println(largest+" is the largest among three");
			int biggest = conditional(a, b, c);
			System.out.println(biggest + " is the largest among three !");
			sc.close();
		}
	}
}
