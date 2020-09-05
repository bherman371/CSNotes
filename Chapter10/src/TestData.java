//********************************************************************
// TestData.java Java Foundations
//
// Demonstrates I/O exceptions and the use of a character file
// output stream.
//********************************************************************
import java.util.Random;
import java.io.*;

public class TestData {
	//-----------------------------------------------------------------
	// Creates a file of test data that consists of ten lines each
	// containing ten integer values in the range 10 to 99.
	//-----------------------------------------------------------------
	public static void main(String[] args) throws IOException {

		final int MAX = 10;

		int value;
		String directory = "C://Users/benja/Desktop/Bob/";
		String fileName = "test.data";

		Random rand = new Random();

		FileWriter fw = null;
		
		try {
			fw = new FileWriter(directory + fileName);
		} catch (IOException ioe) {
			System.out.println("Directory " + directory + " does not exist.");
			System.out.println("Will save the file in the default directory.");
			fw = new FileWriter(fileName);
		}
		
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		for (int line=1; line <= MAX; line++) {
			for (int num=1; num <= MAX; num++) {
				value = rand.nextInt(90) + 10;
				outFile.print(value + " ");
			}
			outFile.println();
		}

		outFile.close();
		System.out.println("Output file has been created: " + fileName);
		
	}
}