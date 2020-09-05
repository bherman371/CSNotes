import java.util.Random;
//**********************************
// PhoneNumber.java
//
// Generates a random phone number
// and then prints it out.
//**********************************
public class PhoneNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int num1, num2, num3, num4, num5;
		
		num1 = generator.nextInt(8);
		num2 = generator.nextInt(8);
		num3 = generator.nextInt(8);
		num4 = generator.nextInt(642) + 101;
		num5 = generator.nextInt(9000) + 1000;
		
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3 + "-");
		System.out.print(num4 + "-");
		System.out.print(num5);
	}

}
