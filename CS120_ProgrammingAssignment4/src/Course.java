
public class Course {
	
	private String courseName;
	private String instructor;
	private int numCredits;
	private int currentEnrollment;
	private int maxStudents;
	private Student[] enrollment;
	
	public Course(String courseName, String instructor, int numCredits, int maxStudents) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.numCredits = numCredits;
		this.maxStudents = maxStudents;
		this.currentEnrollment = 0;
		this.enrollment = new Student[maxStudents];
	}

	public String getCourseName() {
		return courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public int getNumCredits() {
		return numCredits;
	}

	public Student[] getEnrollment() {
		return enrollment;
	}
	
	public int spacesAvailable() {
		return (this.maxStudents - this.currentEnrollment);
	}
	
	public void enroll(Student s) {
		if ( spacesAvailable() >= 1) {
			enrollment[currentEnrollment] = s;
			currentEnrollment++;
		}
	}

}
