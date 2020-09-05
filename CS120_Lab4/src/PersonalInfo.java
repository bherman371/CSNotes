import java.text.DecimalFormat;
import java.util.Scanner;
//**********************************
// PersonalInfo.java
//
// Reads a user's weight and height.
// Converts them into kilograms (kg)
// and meters (m), respectively.
//**********************************
public class PersonalInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.0000");
		
		System.out.print("Please enter your weight (in pounds): ");
		double weight = input.nextDouble();
		if (weight < 1 || weight > 700) {
			System.out.println("Please enter a valid weight (between 1 and 700 lbs).");
			System.exit(0);
		}
		
		System.out.print("Please enter your height (in inches): ");
		double height = input.nextDouble();
		if (height < 12 || height > 100) {
			System.out.println("Please enter a valid height (between 12 and 100 in).");
			System.exit(0);
		}
		
		System.out.println("");
		
		// converts weight and height
		double weightConversion = weight / 2.20462;
		double heightConversion = height / 39.3701;
		
		System.out.println("You weigh " + fmt.format(weightConversion) + " kg.");
		System.out.println("Your height is " + fmt.format(heightConversion) + " m.");
	}

}
