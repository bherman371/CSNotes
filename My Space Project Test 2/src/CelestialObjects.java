
public class CelestialObjects {

	protected int distance; // in light years away from Earth
	
	protected double velocity = 1000;
	
	protected double mass;
	protected double volume;
	
	public void setVelocity(double velocityVal) {
		velocity = velocityVal;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	public void setDistance(int dVal) {
		distance = dVal;
	}
	
	public int getDistance() {
		return distance;
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
}
