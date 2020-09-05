import java.text.*;

public class Cars {

	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		Dealership car1 = new Dealership(20000, "Honda", "CR-V", "A3F 89JE");
		Dealership car2 = new Dealership(10000, "Chevy", "Highlander", "JI3 ND0A");
		Dealership car3 = new Dealership(25000, "Ford", "F150", "M71 VEFH");
		Dealership car4 = new Dealership(30000, "Toyota", "Rav4", "3FQ ZN56");
		
		// Honda CR-V
		double price1 = car1.getPrice();
		String brand1 = car1.getBrand();
		String type1 = car1.getType();
		String licensePlate1 = car1.getLicensePlate();
		
		// Chevy Highlander
		double price2 = car2.getPrice();
		String brand2 = car2.getBrand();
		String type2 = car2.getType();
		String licensePlate2 = car2.getLicensePlate();
		
		// Ford F150
		double price3 = car3.getPrice();
		String brand3 = car3.getBrand();
		String type3 = car3.getType();
		String licensePlate3 = car3.getLicensePlate();
		
		// Toyota Rav4
		double price4 = car4.getPrice();
		String brand4 = car4.getBrand();
		String type4 = car4.getType();
		String licensePlate4 = car4.getLicensePlate();
		
		System.out.println("--------------------------");
		System.out.println(brand1 + " " + type1);
		System.out.println("Price: $" + fmt.format(price1));
		System.out.println("License Plate: " + licensePlate1);
		
		System.out.println("--------------------------");
		System.out.println(brand2 + " " + type2);
		System.out.println("Price: $" + fmt.format(price2));
		System.out.println("License Plate: " + licensePlate2);
		
		System.out.println("--------------------------");
		System.out.println(brand3 + " " + type3);
		System.out.println("Price: $" + fmt.format(price3));
		System.out.println("License Plate: " + licensePlate3);
		
		System.out.println("--------------------------");
		System.out.println(brand4 + " " + type4);
		System.out.println("Price: $" + fmt.format(price4));
		System.out.println("License Plate: " + licensePlate4);
		
		System.out.println("--------------------------");
	}

}
