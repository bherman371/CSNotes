package lesson1;

public class LogicalOperators {

	public static void main(String[] args) {
		int subject1 = 40;
		int subject2 = 60;
		
		/*
		 * && - and
		 * || - or
		 */
		if ((subject1 >= 35) && (subject2 >= 35)) {
			System.out.println("True!");
		} else {
			System.out.println("False.");
		}
	}

}
