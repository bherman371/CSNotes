
public class Accounts {

	private final double RATE = 0.05; // interest rate: 5%
	private String name;
	private int acctNum;
	private double balance;
	
	public Accounts(String owner, int acct, double bal) {
		name = owner;
		acctNum = acct;
		balance = bal;
	}
	
	public double deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		
		return balance;
	}
	
	public double withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
		
		return balance;
	}
	
	public double addInterest(double amount) {
		balance += (balance * RATE);
		
		return balance;
	}
	
	public void account(String message) {
		System.out.println(message);
	}
}
