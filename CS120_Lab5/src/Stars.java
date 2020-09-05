import java.util.Scanner;
//**********************************************
// Stars.java
//
// Reads a length and a width. Prints out *'s in
// the desired length and width.
//**********************************************
public class Stars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int length = 0;
		
		System.out.print("Enter the length of the rectangle: ");
		int starLength = input.nextInt();
		
		System.out.print("Enter the width of the rectangle: ");
		int starWidth = input.nextInt();
		
		System.out.println();
		
		// prints out the *'s in the entered length and width
		for (int width = 0; width < starWidth; width++) {
			do {
				System.out.print("*");
				length++;
			} while (length < starLength);
			
			System.out.println();
			length = 0;
		}
	}

}
