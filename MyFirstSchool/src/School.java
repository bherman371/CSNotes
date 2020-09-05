
public class School {

	public static void main(String[] args) {
		// courseName, instructor, classDuration (hrs/week), courseDuration (semester or quarterly), 
		// classAvg (nearest tenth), maxStudents
		Course course1 = new Course("MAT 101", "Dr. Bialek", 3.0, 90.5, 4);
		Course course2 = new Course("ENG 101", "Professor Jung", 3.0, 87.5, 4);
		Course course3 = new Course("HIS 101", "Dr. Fratt", 2.5, 85.2, 4);
		Course course4 = new Course("SCI 101", "Dr. Lau", 4.0, 92.4, 4);
		
		// name, address, email, gpa
		Student student1 = new Student("Benjamin Herman", "27 Heritage Dr", "zbherma1@tiu.edu", 92.5);
		Student student2 = new Student("Ben Jenkins", "30 Melody Ln", "zbjenki1@tiu.edu", 94.7);
		Student student3 = new Student("Kobe Rudin", "10 Rorbach Ln", "zkrudin1@tiu.edu", 96.2);
		Student student4 = new Student("Caleb Engelhardt", "17 Center St", "zcengel1@tiu.edu", 95.8);
		Student student5 = new Student("Nicole Slinkman", "14 Main St", "znslink1@tiu.edu", 94.2);
		Student student6 = new Student("Sarah Damianov", "5 Second St", "zsdamia1@tiu.edu", 96.5);
		
		String name1 = student1.getName();
		String name2 = student2.getName();
		String name3 = student3.getName();
		String name4 = student4.getName();
		String name5 = student5.getName();
		String name6 = student6.getName();
		
		/* Enrollments (6.0 required) */
		
		// MAT 101 (3.0)
		course1.enroll(name1);
		course1.enroll(name2);
		course1.enroll(name3);
		course1.enroll(name5);
		
		// ENG 101 (3.0)
		course2.enroll(name2);
		course2.enroll(name3);
		course2.enroll(name5);
		course2.enroll(name6);
		
		// HIS 101 (2.5)
		course3.enroll(name2);
		course3.enroll(name4);
		
		
		// SCI 101 (4.0)
		course4.enroll(name1);
		course4.enroll(name4);
		course4.enroll(name6);
		
		System.out.println("The courses in the enrollment system are:");
		System.out.println("--------------------------------------");
		System.out.println("Course Name ---> " + course1.getCourseName());
		System.out.println("Instructor ---> " + course1.getInstructor());
		System.out.println("Number of Credits ---> " + course1.getNumCredits());
		System.out.println("Class Duration ---> " + course1.getClassDuration() + " Hours Per Week");
		System.out.println("Class Average ---> " + course1.getClassAvg());
		System.out.println("Enrollment:");
		System.out.println("\t1. " + student1.getName());
		System.out.println("\t2. " + student2.getName());
		System.out.println("\t3. " + student3.getName());
		System.out.println("\t4. " + student5.getName());
		System.out.println("--------------------------------------");
		
	}

}