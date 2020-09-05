
public class Student {

	private int id;
	private String name;
	private String address;
	private static int numStudents = 0; // Represents number of students in the system
	
	// numStudents = 0 because we want to be able to increment it as we add students
	
	// Constructor for Student
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
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
	
}
