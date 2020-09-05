//**********************************************************
// Name: Benjamin Herman
// Course Name: CS120 - Computer Programming I
// Date: 10/17/19
// Semester: 1
// 
// Volumes.java
//
// Asks user for a radius and then generates a random height
// for a cylinder and a cone and prints them out. Computes
// the volume of a sphere, a cylinder and a cone. Prints them
// out to two decimal places smallest to largest.
//***********************************************************
import java.text.DecimalFormat;
import java.util.*;

public class Volumes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		DecimalFormat height = new DecimalFormat("0.0000");
		DecimalFormat volume = new DecimalFormat("0.00");
		
		double radius, hcy, hco, vsphere, vcy, vco, max;
		
		System.out.print("Enter the length of the radius (between 0.0 and 10.0): ");
		radius = input.nextDouble();
		if (radius < 0.0 || radius > 10) {
			System.out.println("");
			System.out.println("Please enter a value between 0.0 and 10.0 for the radius.");
			System.exit(0);
		}
		
		// randomly generates a height for the cylinder and cone
		hcy = generator.nextDouble() * 10;
		hco = generator.nextDouble() * 10;
		
		// calculates the volume of the sphere, cylinder and cone
		vsphere = ((Math.PI * Math.pow(radius, 3)) * 4) / 3;
		vcy = Math.PI * Math.pow(radius, 2) * hcy;
		vco = (Math.PI * Math.pow(radius, 2) * hco) / 3;
		
		// figures out which volume is the largest
		if (vsphere > vcy) {
			 if (vsphere > vco) {
				 max = vsphere;
			 } else {
				 max = vco;
			 }
		} else {
			if (vcy > vco) {
				max = vcy;
			} else {
				max = vco;
			}
		}
		
		System.out.println("");
		
		System.out.println("The height of the cylinder is --> " + height.format(hcy));
		System.out.println("The height of the cone is ------> " + height.format(hco));
		
		System.out.println("");
		
		// figures out which order to print the volumes based on which ones are larger than the others
		if (max == vsphere) {
			System.out.println("The sphere's volume is ---------> " + volume.format(vsphere));
			if (vcy > vco) {
				System.out.println("The cylinder's volume is -------> " + volume.format(vcy));
				System.out.println("The cone's volume is -----------> " + volume.format(vco));
			} else {
				System.out.println("The cone's volume is -----------> " + volume.format(vco));
				System.out.println("The cylinder's volume is -------> " + volume.format(vcy));
			}
		} else if (max == vcy) {
			System.out.println("The cylinder's volume is -------> " + volume.format(vcy));
			if (vsphere > vco) {
				System.out.println("The sphere's volume is ---------> " + volume.format(vsphere));
				System.out.println("The cone's volume is -----------> " + volume.format(vco));
			} else {
				System.out.println("The cone's volume is -----------> " + volume.format(vco));
				System.out.println("The sphere's volume is ---------> " + volume.format(vsphere));
			}
		} else {
			System.out.println("The cone's volume is -----------> " + volume.format(vco));
			if (vsphere > vcy) {
				System.out.println("The sphere's volume is ---------> " + volume.format(vsphere));
				System.out.println("The cylinder's volume is -------> " + volume.format(vcy));
			} else {
				System.out.println("The cylinder's volume is -------> " + volume.format(vcy));
				System.out.println("The sphere's volume is ---------> " + volume.format(vsphere));
			}
		}
	}
}
