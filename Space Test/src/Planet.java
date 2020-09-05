
public class Planet extends CelestialObject {

	private final double SPIN_CONSTANT = 15864;
	private boolean dwarfPlanet = false;
	private String size; // asteroidan (800 to 100000), mercurian (100001 to 500000), subterran (500001 to 1000000), terran (1000001 to 10000000), superterran (10000001 to 100000000), neptunian (100000001 to 1000000000), jovian (mass > 1000000000)
	private String planetType; // rocky, lava, ice, tundra, swamp, desert, ocean, gas giant, ice giant, terrestrial
	private double mass; // in kg
	private double volume; // in m^3
	private int numMoons;
	private String name;
	
	// Inherited Methods
	public double computeSpinSpeed() {
		return velocity / SPIN_CONSTANT;
	}
	
	public void setVelocity(double velocityVal) {
		velocity = velocityVal;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	// Planet Methods
	public double computeDensity() {
		return mass / volume; // in kg/m^3
	}
	
	public boolean isDwarfPlanet() {
		if (mass < 100001) {
			dwarfPlanet = true;
		} else {
			dwarfPlanet = false;
		}
		return dwarfPlanet;
	}
	
	public void setSize(String planetSize) {
		size = planetSize;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setPlanetType(String type) {
		planetType = type;
	}
	
	public String getPlanetType() {
		return planetType;
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
	
	public void setNumMoons(int numMoonsOrbiting) {
		numMoons = numMoonsOrbiting;
	}
	
	public int getNumMoons() {
		return numMoons;
	}
	
	public void setName(String planetName) {
		name = planetName;
	}
	
	public String getName() {
		return name;
	}
	
}
