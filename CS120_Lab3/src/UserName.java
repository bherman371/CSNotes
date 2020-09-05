import java.util.Scanner;
import java.util.Random;
//**************************************
// UserName.java
//
// Asks for first and last name of user
// and then prints out the first initial
// and the last initial along with a
// random number.
//**************************************
public class UserName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName, firstInitial, lastName2, mutation1, mutation2;
		
		System.out.print("Enter your first name: ");
		firstName = input.nextLine();
	
		System.out.print("Enter your last name: ");
		lastName = input.nextLine();
		
		Random randNum = new Random();
		int num = randNum.nextInt(90) + 10;
		
		firstInitial = firstName.substring(0, 1);
		firstInitial = firstInitial.toLowerCase();
		lastName2 = lastName.substring(0, 5);
		lastName2 = lastName2.toLowerCase();
		
		System.out.println("");
		
		System.out.println("Your username is: " + firstInitial + lastName2 + num);
	}
}
