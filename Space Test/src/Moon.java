
public class Moon extends CelestialObject {

	private final double SPIN_CONSTANT = 0;
	private double mass;
	private double volume;
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
	
	// Moon Methods
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
	
	public void setName(String moonName) {
		name = moonName;
	}
	
	public String getName() {
		return name;
	}
}
