
public class MysteryRecursiveFunctions {

	public static void main(String[] args) {
		mystery(30);
		System.out.println("\n\n" + anotherMystery(50, 7));
		System.out.println("\n" + gcd(2, 2));
		System.out.println("\n" + multiplyEvens(3));
	}
	
	public static void mystery(int n) {
		if (n <= 1) {
			System.out.print(n);
		} else {
			mystery(n / 2);
			System.out.print(", " + n);
		}
	}
	
	public static int anotherMystery(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return anotherMystery(x - y, y);
		}
	}
	
	public static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} 
		if (a > b) {
			return gcd(a - b, b);
		} 
		if (a < b) {
			return gcd(a, b - a);
		}
		return 0;
	}
	
	public static int multiplyEvens(int n) {
		if (n == 1) {
			return n *= 2;
		}
		if (n > 1) {
			return (int) Math.pow(n, 2);
		}
		return 0;
	}
}
