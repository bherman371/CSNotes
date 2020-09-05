import java.util.Scanner;

public class Zero {
	//------------------------------------------------------
	// Deliberately divides by zero to produce an exception
	//------------------------------------------------------
	public static void main(String[] args) {
		
		int numerator = 10;
		int denominator = 0;
		
		System.out.println("Before the attempt to divide by zero.");
		
		try {
			System.out.println(intDivision(numerator, denominator)); //numerator / denominator
		} catch (ArithmeticException ae) {
			//System.out.println(Double.POSITIVE_INFINITY);
			Scanner scan = new Scanner(System.in);
			while (denominator == 0) {
				System.out.println("I don't want to divide by zero.");
				System.out.print("Give me another number: ");
				denominator = scan.nextInt();
			}
			System.out.println(intDivision(numerator, denominator)); //numerator / denominator
		}
		
		System.out.println("The text will not be printed.");

	}
	
	public static int intDivision(int n, int d) {
		return intDiv2(n, d);
	}
	
	public static int intDiv2(int n, int d) {
		return n / d;
	}

}
