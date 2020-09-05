import java.io.*;
import java.util.Scanner;

public class StringsToFile {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		String fileName = "userStrings.txt";

		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		String userInput = "";
		
		// asks user to input into the file until they enter DONE
		while (!userInput.equals("DONE")) {
			System.out.print("Enter a line to put into the file: ");
			userInput = input.nextLine();
			// prints to the file as long as the user hasn't entered DONE
			if (!userInput.equals("DONE")) {
				outFile.print(userInput + " ");
				outFile.println();
			}
		}

		outFile.close();
		
		System.out.println("\nAll lines have been output to " + fileName);
	}

}
