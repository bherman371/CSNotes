
public class CelestialObjects {

	private String[] sizes = {"Stellar Mass", "Intermediate Mass", "Supermassive", "Hypermassive"};
	private String size;
	
	protected double mass;
	
	public void setSize(String sizeVal) {
		size = sizeVal;
	}
	
	public String getSize() {
		if (mass < 100) {
			size = sizes[0];
		} else if (mass < 1000) {
			size = sizes[1];
		} else if (mass < 10000) {
			size = sizes[2];
		} else if (mass < 100000) {
			size = sizes[3];
		}
		return size;
	}
	
	public void setMass(double massVal) {
		mass = massVal;
	}
	
	public double getMass() {
		return mass;
	}
	
}
