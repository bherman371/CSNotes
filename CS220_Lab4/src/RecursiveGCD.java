
public class RecursiveGCD {

	public static void main(String[] args) {
		System.out.println(gcd(50, 35));
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

}
