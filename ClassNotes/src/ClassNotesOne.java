import java.io.File;
import java.util.Scanner;

public class ClassNotesOne {

	public static void main(String[] args) throws Exception {
		//final int NUM_FLOWERS = 75;
		
		String pathname = "C://Users/benja/Desktop/test.csv";
		File file = new File(pathname);
		
		Scanner scan = new Scanner(file);
		
		int count = 0;
		// If the line is a valid line, then "process" it.
		while (scan.hasNext()) {
			scan.next();
			//System.out.println(line);
			count++;
		}
		
		String[] lines = new String[count];
		scan = new Scanner(file);
		
		/*String firstLineInFile = scan.nextLine();
		String s = scan.nextLine();
		
		System.out.println(firstLineInFile);
		System.out.println(s);*/
		
		// Read each line of the file into the lines array.
		for (int i = 0; i < lines.length; i++) {
			lines[i] = scan.nextLine();
		}
		
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
