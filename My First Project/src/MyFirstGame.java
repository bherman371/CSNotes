import java.util.*;

public class MyFirstGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int charHealth = 70;
		int enemyHealth = 70;
		int charDamage, enemyDamage;
		
		System.out.println("Welcome to <insert name here>!");
		
		System.out.println("");
		
		System.out.print("Please enter a username: ");
		String username = input.nextLine();
		System.out.println("Your username is: " + username);
		
		System.out.println("------------------------");
		System.out.println(username + " Health: " + charHealth);
		System.out.println("Enemy Health: " + enemyHealth);
		System.out.println("");
		
		System.out.println("*----------------------*");
		System.out.println("|        Attack        |");
		System.out.println("*----------------------*");
		
		System.out.println("Type Attack to attack.");
		String attack = input.nextLine();
		charDamage = generator.nextInt(15) + 8;
		enemyHealth -= charDamage;
		System.out.println(username + " Health: " + charHealth);
		System.out.println("Enemy Health: " + enemyHealth);
		System.out.println("");
		
		System.out.println("The enemy is attacking.");
		enemyDamage = generator.nextInt(13) + 6;
		charHealth -= enemyDamage;
		System.out.println(username + " Health: " + charHealth);
		System.out.println("Enemy Health: " + enemyHealth);
		System.out.println("");
	}
}
