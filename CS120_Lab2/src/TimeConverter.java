import java.util.Scanner;

//***********************************************
// TimeConverter.java
//
// Reads a duration in hours, minutes and seconds
// and then prints the number of seconds.
//***********************************************
public class TimeConverter {
	public static void main(String[] args) {
		Scanner inputTime = new Scanner(System.in);
		
		int hours, minutes, seconds, totalSeconds;
		
		System.out.print("Enter the number of hours: ");
		hours = inputTime.nextInt();
		
		System.out.print("Enter the number of minutes: ");
		minutes = inputTime.nextInt();
		
		System.out.print("Enter the number of seconds: ");
		seconds = inputTime.nextInt();
		
		totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
		System.out.println("The total number of seconds is " + totalSeconds);
		
	}
}
