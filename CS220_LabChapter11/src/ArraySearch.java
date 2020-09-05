
public class ArraySearch {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[2] = 5;
		
		int result = searchInt(array, 5);
		System.out.println(result);
	}
	
	public static int searchInt(int[] arr, int num) {
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
}
