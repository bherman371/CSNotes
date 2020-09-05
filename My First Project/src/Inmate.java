
public class Inmate {

	private String name;
	private int id = 0;
	private int age;
	private String crime;
	private String sentence;
	
	public Inmate(String n, int a, String c, String s) {
		this.name = n;
		this.age = a;
		this.crime = c;
		this.sentence = s;
		this.id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
}
