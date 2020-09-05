import java.util.Scanner;

//**********************************************
// CoinCounter.java
//
// Reads integer values that represent quarters,
// dimes, nickels and pennies. Prints the total
// in dollars and cents.
//**********************************************
public class CoinCounter {
	public static void main(String[] args) {
		Scanner inputMoney = new Scanner(System.in);
		
		int quarters, dimes, nickels, pennies;
		double quarter, dime, nickel, penny;
		double totalMoney = 0.00;
		
		System.out.print("Enter the number of quarters: ");
		quarters = inputMoney.nextInt();
		quarter = (double) quarters * 0.25;
		
		System.out.print("Enter the number of dimes: ");
		dimes = inputMoney.nextInt();
		dime = (double) dimes * 0.10;
		
		System.out.print("Enter the number of nickels: ");
		nickels = inputMoney.nextInt();
		nickel = (double) nickels * 0.05;
		
		System.out.print("Enter the number of pennies: ");
		pennies = inputMoney.nextInt();
		penny = (double) pennies * 0.01;
		
		totalMoney = quarter + dime + nickel + penny;
		System.out.println("You have $" + totalMoney + ".");
	}
}
