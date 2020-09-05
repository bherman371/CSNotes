package problem1;
//********************************************************
// Sphere.java
//
// Represents a sphere with a radius that is set in
// MultiSphere.java. Calculates the volume and surface
// area of the two spheres.
//********************************************************
public class Sphere {

	private double radius;
	
	public Sphere(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		double volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3;
		
		return volume;
	}
	
	public double surfaceArea() {
		double area = 4 * Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	public String toString() {
		return "Sphere with radius = " + radius;
	}
}
