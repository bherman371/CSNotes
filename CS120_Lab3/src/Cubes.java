import java.util.Scanner;
//*********************************
// Cubes.java
//
// Asks the user for two numbers.
// Raises them to the third power,
// adds them up, and then prints
// them out.
//*********************************
public class Cubes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		num1 = (int) Math.pow(num1, 3);
		num2 = (int) Math.pow(num2, 3);
		sum = num1 + num2;
		
		System.out.println("");
		
		System.out.println("The sum of the cubes is " + sum);
	}
}
