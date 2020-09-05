import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ClassNotesTwo {

	public static void main(String[] args) throws Exception {
		//final int NUM_FLOWERS = 75;
		
		String pathname = "C://Users/benja/Desktop/test.csv";
		File file = new File(pathname);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
	}
}
