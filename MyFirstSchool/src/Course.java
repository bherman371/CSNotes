
public class Course {

	private String courseName;
	private String instructor;
	private double classDuration; // in hours per week
	private double numCredits;
	private double classAvg;
	private int currentEnrollment;
	private String[] enrollment;
	private int maxStudents;
	
	public Course(String courseName, String instructor, double classDuration, double classAvg, int maxStudents) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.classDuration = classDuration;
		this.numCredits = classDuration;
		this.classAvg = classAvg;
		this.currentEnrollment = 0;
		this.maxStudents = maxStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public double getClassDuration() {
		return classDuration;
	}
	
	public double getNumCredits() {
		return numCredits;
	}
	
	public double getClassAvg() {
		return classAvg;
	}
	
	public int getCurrentEnrollment() {
		return currentEnrollment;
	}
	
	public int seatsAvailable() {
		return (maxStudents - currentEnrollment);
	}
	
	public void enroll(String s) {
		if ( seatsAvailable() > 0 ) {
			enrollment[currentEnrollment] = s;
			currentEnrollment++;
		}
	}
	
}
