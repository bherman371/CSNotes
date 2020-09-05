import java.util.Scanner;
//**********************************************
// OddEvenZero.java
//
// Reads a number. Prints out the number of odd,
// even, and zero digits in the number entered.
//**********************************************
public class OddEvenZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, lastDigit;
		int oddDigits = 0, evenDigits = 0, zeroDigits = 0;
		
		System.out.print("Enter a positive integer: ");
		num = input.nextInt();
		
		// figures out which digits are odd, even, or zero
		while (num > 0) {
			lastDigit = num % 10;
			
			if (lastDigit % 2 != 0) {
				oddDigits++;
			} else {
				if (lastDigit > 0) {
					evenDigits++;
				} else {
					zeroDigits++;
				}
			}
			
			num /= 10;
		}
		
		System.out.println();
		
		System.out.println("Your number has " + oddDigits + " odd digits.");
		System.out.println("Your number has " + evenDigits + " even digits.");
		System.out.println("Your number has " + zeroDigits + " zero digits.");
	}
}
