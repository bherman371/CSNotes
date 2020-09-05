import java.text.*;

public class Terminals {

	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		Airport terminalA = new Airport(5, 10, "Rochester", 300);
		Airport terminalB = new Airport(7, 9, "Chicago", 230);
		Airport terminalC = new Airport(8, 12, "Sandusky", 200);
		Airport terminalD = new Airport(7, 9, "Chicago", 230);
		
		// Terminal A
		int departureA = terminalA.getDeparture();
		int arrivalA = terminalA.getArrival();
		String destinationA = terminalA.getDestination();
		double priceA = terminalA.getPrice();
		
		// Terminal B
		int departureB = terminalB.getDeparture();
		int arrivalB = terminalB.getArrival();
		String destinationB = terminalB.getDestination();
		double priceB = terminalB.getPrice();
		
		// Terminal C
		int departureC = terminalC.getDeparture();
		int arrivalC = terminalC.getArrival();
		String destinationC = terminalC.getDestination();
		double priceC = terminalC.getPrice();
		
		// Terminal D
		int departureD = terminalD.getDeparture();
		int arrivalD = terminalD.getArrival();
		String destinationD = terminalD.getDestination();
		double priceD = terminalD.getPrice();
		
		// Terminals
		System.out.println("---------------------------");
		System.out.println("Terminal A");
		System.out.println("   Departure - " + departureA + ":00 AM");
		System.out.println("   Arrival - " + arrivalA + ":00 AM");
		System.out.println("   Destination - " + destinationA);
		System.out.println("   Price - $" + fmt.format(priceA));
		System.out.println("---------------------------");
		
		System.out.println("---------------------------");
		System.out.println("Terminal B");
		System.out.println("   Departure - " + departureB + ":00 AM");
		System.out.println("   Arrival - " + arrivalB + ":00 AM");
		System.out.println("   Destination - " + destinationB);
		System.out.println("   Price - $" + fmt.format(priceB));
		System.out.println("---------------------------");
		
		System.out.println("---------------------------");
		System.out.println("Terminal C");
		System.out.println("   Departure - " + departureC + ":00 AM");
		System.out.println("   Arrival - " + arrivalC + ":00 PM");
		System.out.println("   Destination - " + destinationC);
		System.out.println("   Price - $" + fmt.format(priceC));
		System.out.println("---------------------------");
		
		System.out.println("---------------------------");
		System.out.println("Terminal D");
		System.out.println("   Departure - " + departureD + ":15 PM");
		System.out.println("   Arrival - " + arrivalD + ":15 PM");
		System.out.println("   Destination - " + destinationD);
		System.out.println("   Price - $" + fmt.format(priceD));
		System.out.println("---------------------------");
	}
	
}
