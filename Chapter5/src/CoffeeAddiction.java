import java.text.*;

public class CoffeeAddiction {

	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		CoffeeDrink robs = new CoffeeDrink("regular", 20, 140);
		CoffeeDrink jaylens = new CoffeeDrink("regular", 12, 120);
		CoffeeDrink cam = new CoffeeDrink("caramel", 20, 40);
		CoffeeDrink breAnnas = new CoffeeDrink("hazelnut", 20, 130);
		CoffeeDrink christians = new CoffeeDrink("regular", 12, 130);
		
		//breAnnas.setFlavor("regular");
		breAnnas = new CoffeeDrink("regular", 20, 140);
		
		double totalPrice = robs.price() + jaylens.price() + cam.price() + breAnnas.price() + christians.price();
		double totalOunces = robs.getSize() + jaylens.getSize() + cam.getSize() + breAnnas.getSize() + christians.getSize();
		
		System.out.println("CS120 spent $" + fmt.format(totalPrice) + " on coffee.");
		System.out.println("CS120 had " + totalOunces + " ounces of coffee.");
		
		System.out.println("\nAmount spent on coffee was: $" + fmt.format(totalPrice));
		System.out.println("Amount of ounces consumed: " + totalOunces);
		
		if (totalPrice >= 20 && totalOunces >= 50) {
			System.out.println("THEY ARE ADDICTED!!");
		}
	}

}
