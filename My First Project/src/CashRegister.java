import java.util.*;
import java.text.*;

public class CashRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		final double TAX = 0.08;
		
		Items item1 = new Items(1.25);
		Items item2 = new Items(2.50);
		Items item3 = new Items(0.80);
		
		System.out.println("There are 3 items. \nEnter an amount for each:");
		int amount1 = input.nextInt();
		int amount2 = input.nextInt();
		int amount3 = input.nextInt();
		
		double price1 = item1.getPrice();
		double price2 = item2.getPrice();
		double price3 = item3.getPrice();
		
		double subtotal = price1 + price2 + price3;
		double total = subtotal * (1 + TAX);
		
		System.out.println("--------------------------");
		System.out.println("Apples: " + amount1);
		System.out.println("Price: " + fmt.format(price1));
		
		System.out.println("--------------------------");
		System.out.println("Carrots: " + amount2);
		System.out.println("Price: " + fmt.format(price2));
		
		System.out.println("--------------------------");
		System.out.println("Chocolate Chip Cookies: " + amount3);
		System.out.println("Price: " + fmt.format(price3));
		
		double tax = TAX * 100;
		
		System.out.println("--------------------------");
		System.out.println("Subtotal: " + fmt.format(subtotal));
		System.out.println("Tax: " + fmt.format(tax) + "%");
		System.out.println("Total: " + fmt.format(total));
	}

}
