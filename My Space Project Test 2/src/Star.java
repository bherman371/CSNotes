
public class Star extends CelestialObjects {

	//private double mass;
	private double volume;
	private String[] sizes = {"Stellar Mass", "Intermediate Mass", "Supermassive", "Hypermassive"};
	private String size;
	private String starType; // yellow star, red giant, blue giant, white dwarf, red dwarf, black dwarf
	private int numPlanets;
	private String name;
	
	public double computeSpinSpeed() {
		return velocity / volume;
	}
	
	public double computeDensity() {
		return mass / volume;
	}
	
	public void setVolume(double volumeVal) {
		volume = volumeVal;
	}
	
	public double getVolume() {
		return volume;
	}
	
	/*public void setMass(double massVal) {
		mass = massVal;
	}
	
	public double getMass() {
		return mass;
	}*/
	
	public void setSize(String sizeVal) {
		size = sizeVal;
	}
	
	public String getSize() {
		if (mass > 200000) {
			size = sizes[3];
			return size;
		} else if (mass < 200) {
			size = sizes[0];
			return size;
		} else if (mass < 2000) {
			size = sizes[1];
			return size;
		} else if (mass < 20000) {
			size = sizes[2];
			return size;
		} else {
			return null;
		}
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
