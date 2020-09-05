
public class Airport {

	private int departure;
	private int arrival;
	private String destination;
	private double price;
	
	public Airport(int d, int a, String de, double p) {
		departure = d;
		arrival = a;
		destination = de;
		price = p;
	}

	public int getDeparture() {
		return departure;
	}

	public void setDeparture(int departure) {
		this.departure = departure;
	}

	public int getArrival() {
		return arrival;
	}

	public void setArrival(int arrival) {
		this.arrival = arrival;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
