
public class Dealership {

	private double price;
	private String brand;
	private String type;
	private String licensePlate;
	
	public Dealership(double p, String b, String t, String l) {
		price = p;
		brand = b;
		type = t;
		licensePlate = l;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
}
