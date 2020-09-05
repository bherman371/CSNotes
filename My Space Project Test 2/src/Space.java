
public class Space {

	public static void main(String[] args) {
		CelestialObjects celestialObjects = new CelestialObjects();
		Star stars = new Star();
		
		stars.setVolume(10);
		
		double spinSpeed = stars.computeSpinSpeed();
		
		System.out.println(spinSpeed);
	}
}
