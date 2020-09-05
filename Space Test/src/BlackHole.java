
public class BlackHole extends CelestialObject {

	private final double SPIN_CONSTANT = 0;
	private final double VOLUME = 0;
	private String size; // stellar mass, intermediate mass, supermassive, hypermassive
	private double mass;
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
	
	// BlackHole Methods
	public double computeDensity() {
		return Double.POSITIVE_INFINITY;
	}
	
	public double getVolume() {
		return VOLUME;
	}
	
	public void setSize(String blackHoleSize) {
		size = blackHoleSize;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setMass(double massVal) {
		mass = massVal;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setName(String blackHoleName) {
		name = blackHoleName;
	}
	
	public String getName() {
		return name;
	}
	
}
