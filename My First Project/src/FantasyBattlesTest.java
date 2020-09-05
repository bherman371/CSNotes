import java.util.*;

public class FantasyBattlesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int[] charHealth = {70, 60, 50};
		int charHP;
		int charDamage, enemyDamage;
		
		int enemyHealth = 60;
		
		boolean inBattle = true;
		
		System.out.println("Welcome to the game!");
		
		System.out.print("Please enter a username: ");
		String username = input.nextLine();
		System.out.println("Your username is: " + username);
		
		System.out.print("Please choose a character (Knight, Archer or Wizard): ");
		String charChoice = input.nextLine();
		
		switch (charChoice) {
			case "Knight":
				System.out.println("You have chosen the Knight.");
				charHP = charHealth[0];
				System.out.println("");
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHP);
				break;
			case "Archer":
				System.out.println("You have chosen the Archer.");
				charHP = charHealth[1];
				System.out.println("");
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHP);
				break;
			case "Wizard":
				System.out.println("You have chosen the Wizard.");
				charHP = charHealth[2];
				System.out.println("");
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHP);
				break;
			default:
				System.out.println("Please choose a valid character.");
				System.exit(0);
				break;
		}
		
		System.out.println("Enemy Health: " + enemyHealth);
		System.out.println("");
		System.out.println("*----------------*");
		switch (charChoice) {
			case "Knight":
				System.out.println("|      Sword     |");
				System.out.println("|     Shield     |");
				break;
			case "Archer":
				System.out.println("|   Recurve Bow  |");
				System.out.println("|     Longbow    |");
				break;
			case "Wizard":
				System.out.println("|    Fireball    |");
				System.out.println("|    Lightning   |");
				break;
		}
		
		System.out.println("*----------------*");
		System.out.print("Select which weapon you want to use: ");
		String weaponChoice = input.nextLine();
		
		System.out.println("");
		
		switch (weaponChoice) {
			case "Sword":
				charDamage = generator.nextInt(5) + 8;
				enemyHealth -= charDamage;
				System.out.println("Knight Health: " + charHealth[0]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Shield":
				charDamage = generator.nextInt(5) + 6;
				enemyHealth -= charDamage;
				System.out.println("Knight Health: " + charHealth[0]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Recurve Bow":
				charDamage = generator.nextInt(7) + 6;
				enemyHealth -= charDamage;
				System.out.println("Archer Health: " + charHealth[1]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Longbow":
				charDamage = generator.nextInt(7) + 10;
				enemyHealth -= charDamage;
				System.out.println("Archer Health: " + charHealth[1]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Fireball":
				charDamage = generator.nextInt(7) + 8;
				enemyHealth -= charDamage;
				System.out.println("Wizard Health: " + charHealth[2]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Lightning":
				charDamage = generator.nextInt(9) + 10;
				enemyHealth -= charDamage;
				System.out.println("Wizard Health: " + charHealth[2]);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
		}
	}
}