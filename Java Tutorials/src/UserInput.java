import java.util.Scanner;

//**********************************
// UserInput.java     Java Tutorials
//
// Reads the name and age of a user
// and then prints it out.
//**********************************
public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		String name = input.nextLine();
		
		System.out.print("How old are you? ");
		int age = input.nextInt();
		
		System.out.println("Hello " + name + "!");
		System.out.println("You are " + age + " years old.");
	}
}
