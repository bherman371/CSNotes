import java.util.Scanner;
import java.text.DecimalFormat;
//**********************************
// Distance.java
//
// Reads two coordinates, calculates
// the distance between them, and
// then prints it out.
//**********************************
public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, x2, y1, y2, distance;
		
		System.out.print("Enter x1: ");
		x1 = input.nextDouble();
		
		System.out.print("Enter x2: ");
		x2 = input.nextDouble();
		
		System.out.print("Enter y1: ");
		y1 = input.nextDouble();
		
		System.out.print("Enter y2: ");
		y2 = input.nextDouble();
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("The distance between the two points is: " + fmt.format(distance));
	}
}
