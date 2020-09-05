
public class Star extends CelestialObject {

	private final double SPIN_CONSTANT = 301;
	private final double BLACK_HOLE = 1194;
	private boolean blackHole = false;
	private String size; // stellar mass (100 to 1000), intermediate mass (1001 to 20000), supermassive (20001 to 200000), hypermassive (mass > 200000)
	private String starType; // yellow star (100 to 1000), red giant (1001 to 20000), blue giant (mass > 20000), white dwarf (501 to 1000), black dwarf (100 to 500), red dwarf (100 to 500)
	private double mass; // in kg
	private double volume; // in m^3
	private int numPlanets;
	private String name;
	
	// Inherited Methods
	public double computeSpinSpeed() {
		return velocity / SPIN_CONSTANT; // in km/h
	}
	
	public void setVelocity(double velocityVal) {
		velocity = velocityVal;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	// Star methods
	public double computeDensity() {
		return mass / volume; // in kg/m^3
	}
	
	public boolean willBeBlackHole() {
		if (mass >= BLACK_HOLE) {
			blackHole = true;
		}
		return blackHole;
	}
	
	public void setSize(String starSize) {
		size = starSize;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setStarType(String type) {
		starType = type;
	}
	
	public String getStarType() {
		return starType;
	}
	
	public void setMass(double massVal) {
		mass = massVal;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setVolume(double volumeVal) {
		volume = volumeVal;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setNumPlanets(int numPlanetsOrbiting) {
		numPlanets = numPlanetsOrbiting;
	}
	
	public int getNumPlanets() {
		return numPlanets;
	}
	
	public void setName(String starName) {
		name = starName;
	}
	
	public String getName() {
		return name;
	}
}
