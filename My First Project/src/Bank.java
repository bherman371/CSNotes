import java.util.*;
import java.text.*;

public class Bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.print("Welcome to the bank!" + "\n\nPlease enter your name: ");
		String name = input.nextLine();
		
		int acctNum = random.nextInt(9001) + 1000;
		System.out.println("\nYour account number is: " + acctNum);
		
		System.out.print("\nHow much would you like to deposit? ");
		double initBal = input.nextDouble();
		
		Accounts acct1 = new Accounts(name, acctNum, initBal);
		
		acct1.deposit(initBal);
	}

}
