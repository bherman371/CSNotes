package lesson1;

public class SwitchStatement {

	public static void main(String[] args) {
		int score = 95;
		// byte, short, int or char
		switch (score) {
		// evaluating 3 conditions
		case 100:
		case 95:
		case 90:
			System.out.println("Very good!");
			break;
		case 80:
		case 60:
			System.out.println("Not good.");
			break;
		case 40:
			System.out.println("NO!");
			break;
		default :
			System.out.println("The grades are not defined.");
			break;
		}
	}

}
