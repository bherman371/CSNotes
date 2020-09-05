
public class Space {

	public static void main(String[] args) {
		CelestialObjects celestialObjects = new CelestialObjects();
		Star stars = new Star();
		Planet planets = new Planet();
		
		celestialObjects.setMass(80);
		stars.setVolume(100);
		
		String size = celestialObjects.getSize();
		double density = stars.computeDensity();
		
		System.out.println("The star is classified as a " + size + " star.");
		System.out.println("The star's density is " + density);
	}

}
