package problem2;
//*******************************************************
// Kennel.java
//
// Prints out a dog's age in person years. Prints out
// another dog's age after his birthday.
//*******************************************************
public class Kennel {
	
	public static void main(String args[]) {
		Dog d1 = new Dog("Rufus", 10);
		Dog d2 = new Dog("Lala", 7);
		Dog d3 = new Dog("Boxer", 4);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("\nLala's age in person years is " + d2.personYearsAge() + ".");
		
		d3.setAge(d3.getAge()+1);
		System.out.println("\nBoxer's birthday is today so his age is now " + d3.getAge() + ".");
	}
	
}