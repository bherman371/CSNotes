import java.util.*;

public class FantasyBattles {

	public static final String GAME_NAME = "Fantasy Battles";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		FBMethods methods = new FBMethods();
		
		System.out.println("Welcome to " + GAME_NAME + "!");
		
		System.out.print("\nPlease enter a username: ");
		methods.username = input.nextLine();
		
		System.out.println("Your username is: " + methods.username);
		
		System.out.print("\nPlease choose a character (Knight, Archer, or Wizard): ");
		String charChoice = input.nextLine();
		
		methods.chooseChar(charChoice);
		
		methods.displayWeapons(charChoice);
		
		System.out.print("\nSelect a weapon to use: ");
		String weaponChoice = input.nextLine();
		
		while (methods.inBattle == true) {
			methods.chooseWeapon(weaponChoice);
			methods.enemyAttack(charChoice);
		}
	}
}
