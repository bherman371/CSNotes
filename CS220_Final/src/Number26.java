
public class Number26 {

	public static void main(String[] args) {
		boolean[] array = new boolean[5];

		System.out.println(allFalse(array));
	}
	
	public static boolean allFalse(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != false) {
				return false;
			}
		}
		return true;
	}
}
