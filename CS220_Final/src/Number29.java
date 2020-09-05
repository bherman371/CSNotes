
public class Number29 {

	public static void main(String[] args) {
		System.out.println(ayalacci(2));
	}
	
	public static int ayalacci(int n) {
		int result;
		
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 2;
		}
		if (n == 2) {
			return 3;
		}
		if (n >= 3) {
			result = n + ayalacci(n - 1);
			return result;
		}
		return 0;
	}
}
