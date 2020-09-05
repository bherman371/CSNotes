
public class Test {
	
	public static void main(String[] args) {
		String name1 = "Daniel";
		String name2 = "daniel";
		
		if (name1.toUpperCase().compareTo(name2) < 100) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
	}
	
}
