import java.util.Scanner;
//**********************************************
// LineByLine.java
//
// Reads a String from a user and prints it out
// with one character per line.
//**********************************************
public class LineByLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter whatever you want: ");
		String statement = input.nextLine();
		
		// prints out String entered with one character per line
		for (int value = 0; value < statement.length(); value++) {
			System.out.println(statement.charAt(value));
		}
	}
}
