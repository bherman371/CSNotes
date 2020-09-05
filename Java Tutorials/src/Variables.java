//*************************************
// Variables.java     Java Tutorials
//
// Initiates variables, sums them up
// and then prints out the sum.
//
// Additionally initiates a String, a
// char and a boolean and prints them 
// out.
//*************************************
public class Variables {

	public static void main(String[] args) {
		byte num1 = 10;
		short num2 = 25;
		int num3 = 50;
		long num4 = 100;
		float num5 = 10.0f;
		double num6 = 20.55;
		
		int sum1 = num1 + num2 + num3;
		double sum2 = num4 + num5 + num6;
		
		System.out.println(sum1); // includes byte, short and int
		System.out.println(sum2); // includes long, float and double
		
		char character = 'A';
		String word = " Word";
		boolean x = true;
		
		System.out.println(character + word);
		System.out.println(x);
	}

}
