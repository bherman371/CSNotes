
public class RecursiveProduct {

	public static void main(String[] args) {
		System.out.println(multiplyEvens(10));
	}
	
	public static int multiplyEvens(int n) {
		if (n == 1) {
			return 2;
		}
		if (n > 1) {	
			return (2 * n) * (multiplyEvens(n - 1));
		}
		return 0;
	}

}
