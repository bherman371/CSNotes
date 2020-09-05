import java.util.*;
import java.text.*;

public class Banks {

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
		
		System.out.println("\nYour account is as follows:" + "\n---------------------------");
		acct1.account("Name: " + name + " | Account Number: " + acctNum + " | Balance: $" + fmt.format(initBal));
	
		System.out.print("\nEnter 0 to deposit and 1 to withdraw (-1 to exit): ");
		int action = input.nextInt();
		
		while (action < 0 || action > 1 && action != -1) {
			System.out.print("Please enter a valid action: ");
			action = input.nextInt();
		}
		
		while (action == 0) {
			System.out.print("\nPlease enter the amount you would like to deposit: ");
			int amtDeposit = input.nextInt();
			
			while (amtDeposit <= 0) {
				System.out.print("Please enter a valid amount to deposit: ");
				amtDeposit = input.nextInt();
			}
			
			acct1.deposit(amtDeposit);
			
			System.out.println("\nYou have deposited: $" + amtDeposit);
			System.out.println("You now have: $" + fmt.format(initBal));
			
			System.out.print("\nEnter 0 to continue depositing and -1 to exit: ");
			action = input.nextInt();
			
			if (action == -1) {
				System.out.println("\nThank you for using the bank!");
				System.exit(0);
			}
		}
		
		while (action == 1) {
			System.out.print("\nPlease enter the amount you would like to withdraw: ");
			int amtWithdraw = input.nextInt();
			
			if (amtWithdraw > initBal) {
				System.out.println("\nYou do not have the funds to withdraw.");
				System.exit(0);
			}
			
			if (amtWithdraw <= initBal) {
				initBal -= amtWithdraw;
				
				System.out.println("\nYour balance is now: $" + fmt.format(initBal));
			}
			
			System.out.print("\nEnter 1 to continue withdrawing and -1 to exit: ");
			action = input.nextInt();
			
			if (action == -1) {
				System.out.println("\nThank you for using the bank!");
				System.exit(0);
			}
		}
		
		if (action == -1) {
			System.out.println("Thank you for using the bank!");
		}
	}

}
