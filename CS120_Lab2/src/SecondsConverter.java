import java.util.Scanner;

//**********************************************
// SecondsConverter.java
//
// Reads a number of seconds and then prints it
// in hours, minutes, and seconds.
//**********************************************
public class SecondsConverter {
	public static void main(String[] args) {
		Scanner inputTime = new Scanner(System.in);
		
		int hours, minutes, seconds, totalSeconds;
		
		System.out.print("Enter the number of seconds: ");
		totalSeconds = inputTime.nextInt();
		
		hours = totalSeconds / 3600;
		totalSeconds -= hours * 3600;
		
		minutes = totalSeconds / 60;
		seconds = totalSeconds - minutes * 60;
		
		System.out.println("That number of seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
	}
}
