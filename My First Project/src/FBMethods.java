import java.util.*;

public class FBMethods {

	Random generator = new Random();
	
	public String username;
	private final int[] CHAR_HEALTH = {70, 60, 50};
	private int charHealth;
	private int charDamage, enemyDamage;
	private int enemyHealth = 60;
	public boolean inBattle = true;
	
	public String chooseChar(String charChoice) {
		switch (charChoice) {
			case "Knight":
				System.out.println("You have chosen the Knight.");
				charHealth = CHAR_HEALTH[0];
				System.out.println();
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHealth);
				break;
			case "Archer":
				System.out.println("You have chosen the Archer.");
				charHealth = CHAR_HEALTH[1];
				System.out.println();
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHealth);
				break;
			case "Wizard":
				System.out.println("You have chosen the Wizard.");
				charHealth = CHAR_HEALTH[2];
				System.out.println();
				System.out.println("------------------");
				System.out.println(charChoice + " Health: " + charHealth);
				break;
			default:
				System.out.println("Please choose a valid character.");
				System.exit(0);
				break;
		}
		
		return charChoice;
	}
	
	public String displayWeapons(String charChoice) {
		System.out.println("Enemy Health: " + enemyHealth);
		System.out.println("------------------");
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
		
		return charChoice;
	}
	
	public String chooseWeapon(String weaponChoice) {
		switch (weaponChoice) {
		case "Sword":
			charDamage = generator.nextInt(5) + 8;
			enemyHealth -= charDamage;
			System.out.println("Knight Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		case "Shield":
			charDamage = generator.nextInt(5) + 6;
			enemyHealth -= charDamage;
			System.out.println("Knight Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		case "Recurve Bow":
			charDamage = generator.nextInt(7) + 6;
			enemyHealth -= charDamage;
			System.out.println("Archer Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		case "Longbow":
			charDamage = generator.nextInt(7) + 10;
			enemyHealth -= charDamage;
			System.out.println("Archer Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		case "Fireball":
			charDamage = generator.nextInt(7) + 8;
			enemyHealth -= charDamage;
			System.out.println("Wizard Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		case "Lightning":
			charDamage = generator.nextInt(9) + 10;
			enemyHealth -= charDamage;
			System.out.println("Wizard Health: " + charHealth);
			System.out.println("Enemy Health: " + enemyHealth);
			break;
		}
		
		return weaponChoice;
		
	}
	
	public String enemyAttack(String charChoice) {
		enemyDamage = generator.nextInt(6) + 5;
		System.out.println("\nThe enemy attacks and deals " + enemyDamage + " damage.");
		
		switch (charChoice) {
			case "Knight":
				System.out.println("Knight Health: " + charHealth);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Archer":
				System.out.println("Archer Health: " + charHealth);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
			case "Wizard":
				System.out.println("Wizard Health: " + charHealth);
				System.out.println("Enemy Health: " + enemyHealth);
				break;
		}
		
		return charChoice;
	}
	
}
