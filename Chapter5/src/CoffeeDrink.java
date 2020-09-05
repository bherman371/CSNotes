
public class CoffeeDrink {

	// Instance Variables
	private String flavor;
	private int size; // in ounces
	private double temperature; // in degrees Fahrenheit
	
	public CoffeeDrink(String f, int s, double t) {
		flavor = f;
		size = s;
		temperature = t;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public double price() {
		return size * 0.25;
	}
}
