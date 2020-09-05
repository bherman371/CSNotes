package problem1;

import java.text.DecimalFormat;
//************************************************
// MultiSphere.java
//
// Uses Sphere.java to print out the radiuses of
// two spheres and to print out the volume and
// surface area of two spheres.
//************************************************
public class MultiSphere {
	
	public static void main(String args[]) {
		Sphere s1 = new Sphere(3.0);
		Sphere s2 = new Sphere(10.0);
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println();
		
		System.out.println("The volume of s1 is " + fmt.format(s1.volume()) + ".");
		System.out.println("The surface area of s2 is " + fmt.format(s2.surfaceArea()) + ".");
		
		System.out.println("\nNow we will change the radius of sphere s1 to 4.5.");
		s1.setRadius(4.5);
		System.out.println("The volume of s1 is " + fmt.format(s1.volume()) + ".");
	}
	
}