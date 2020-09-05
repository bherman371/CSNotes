
public class Star extends CelestialObjects {
	
	private double volume;
	private String starType; // yellow star, red giant, blue giant, white dwarf, red dwarf, black dwarf
	private int numPlanets;
	private String name;
	
	public void setVolume(double volumeVal) {
		volume = volumeVal;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double computeDensity() {
		return mass / volume;
	}
	
	public void setStarType(String type) {
		starType = type;
	}
	
	public String getStarType() {
		return starType;
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
