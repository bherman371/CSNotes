import java.util.Scanner;
//*********************************************
// Average.java
// 
// Reads three integers and prints the average.
//*********************************************
public class Average {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		
		int number1, number2, number3, avg;
		
		System.out.print("Enter a number: ");
		number1 = inputNumber.nextInt();
		
		System.out.print("Enter another number: ");
		number2 = inputNumber.nextInt();
		
		System.out.print("Enter a third number: ");
		number3 = inputNumber.nextInt();
		
		System.out.println("");
		
		avg = (number1 + number2 + number3) / 3;
		System.out.println("The average of your three numbers is " + avg + ".");
	}
}
