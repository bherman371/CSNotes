
public class Student {

	private int id;
	private String name;
	private String address;
	private String email;
	private double gpa;
	private static int numStudents = 0;
	
	public Student(String name, String address, String email, double gpa) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.gpa = gpa;
		numStudents++;
		this.id = numStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
}
