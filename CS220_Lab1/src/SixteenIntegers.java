import java.util.Scanner;

public class SixteenIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] integers = new int[51];
		int num;
		
		for (int i = 0; i < 16; i++) {
			System.out.print("Enter a number between 0 and 50: ");
			num = input.nextInt();
			integers[num]++;
		}
		
		System.out.println();
		
		// prints out how many of each integer is entered
		for (int integer = 0; integer < integers.length; integer++) {
			if (integers[integer] >= 1) {
				System.out.println(integer + ": " + integers[integer]);
			}
 		}
	}
}
