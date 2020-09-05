
public class Planet extends CelestialObjects {

	private String planetType; // rocky planet
	private int numMoons;
	private String name;
	
	public void setPlanetType(String type) {
		planetType = type;
	}
	
	public String getPlanetType() {
		return planetType;
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
