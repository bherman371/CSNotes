
public class Jail {

	public static void main(String[] args) {
		Inmate inmate1 = new Inmate("Benjamin Herman", 18, "Tressingpassing in Evelyn's room", "1 month");
		Inmate inmate2 = new Inmate("David Sargent", 13, "Texting Benjamin's \"girlfriends\" from high school", "1 year");
		Inmate inmate3 = new Inmate("Evelyn Sargent", 10, "Texting Benjamin's prom date saying, \"I don't think we were made for each other.\"", "5 years");
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Inmate Name ---> " + inmate1.getName() + " | Age ---> " + inmate1.getAge());
		System.out.println("Inmate ID ---> " + inmate1.getId());
		System.out.println("Crime ---> " + inmate1.getCrime() + " | Sentence ---> " + inmate1.getSentence());
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("\n--------------------------------------------------------------------");
		System.out.println("Inmate Name ---> " + inmate2.getName() + " | Age ---> " + inmate2.getAge());
		System.out.println("Inmate ID ---> " + inmate2.getId());
		System.out.println("Crime ---> " + inmate2.getCrime() + " | Sentence ---> " + inmate2.getSentence());
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("\n--------------------------------------------------------------------");
		System.out.println("Inmate Name ---> " + inmate3.getName() + " | Age ---> " + inmate3.getAge());
		System.out.println("Inmate ID ---> " + inmate3.getId());
		System.out.println("Crime ---> " + inmate3.getCrime() + " | Sentence ---> " + inmate3.getSentence());
		System.out.println("--------------------------------------------------------------------");
	}
}
