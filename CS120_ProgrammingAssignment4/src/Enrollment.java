/********************************************************************
 *  Programmer: Daniel Ayala                                        *
 *                                                                  *
 *  CS 120 - Programming Assignment #4                              *
 *                                                                  *
 *  Description: This is a class that makes use of the Course and   *
 *  Student classes. It creates some courses and students.  Then it *
 *  enrolls some of the students in some of the courses.  Then it   *
 *  will generate a report of the courses that were created and the *
 *  students that were enrolled in those courses.  It will also     *
 *  print a report of the students in the system.                   *
 ********************************************************************/

public class Enrollment {
	public static void main(String[] args) {
		final int NUM_COURSES = 5;
		final int NUM_STUDENTS = 7;
		
		Course[] courses = new Course[NUM_COURSES];
		Student[] students = new Student[NUM_STUDENTS];
		
		courses[0] = new Course("CS120", "Ayala", 3, 5);
		courses[1] = new Course("MATH212", "Bialek", 4, 4);
		courses[2] = new Course("ENGL110", "Smith", 2, 10);
		courses[3] = new Course("HIST201", "Bradley", 3, 5);
		courses[4] = new Course("NT200", "Harris", 3, 5);
		
		students[0] = new Student("Ayala", "Atlanta, GA");
		students[1] = new Student("Bell", "Boston, MA");
		students[2] = new Student("Cooper", "Chicago, IL");
		students[3] = new Student("Donald", "Dayton, OH");
		students[4] = new Student("Ewing", "Evanston, IL");
		students[5] = new Student("Ford", "Fort Lauderdale, FL");
		students[6] = new Student("Gonzalez", "Geneva, Switzerland");
		
		// Enroll the students into various courses
		doAllEnrollments(courses, students);

		// Generate a report for the courses in the system
		System.out.println("The courses in the enrollment system are: ");
		for (int i = 0; i < courses.length; i++) {
			printCourseReport(courses[i]);
		}
		System.out.println("----------------------------------------");
		System.out.println();
		
		// Change the address of one of the students
		students[0].setAddress("Guaynabo, PR");

		// Generate a report of all the students in the system.
		System.out.println("The students in the enrollment system are: ");
		for (int i = 0; i < students.length; i++) {
			printStudentReport(students[i]);
		}
	}
	
	/****************************
	 * method printCourseReport *
	 ****************************/
	private static void printCourseReport(Course c) {
		// Input: c is a course for which we will generate a report in standard output
		
	    System.out.println("Course Name --------> " + c.getCourseName());
	    System.out.println("Instructor ---------> " + c.getInstructor());
	    System.out.println("Number of Credits --> " + c.getNumCredits());
	    System.out.println("Current Enrollment:");
	    
	    Student[] students = c.getEnrollment();
	    
	    for (int i = 0; i < (students.length - c.spacesAvailable()); i++)
	    {
	    	    System.out.println("\t" + (i+1) + "." + students[i].getName());
	    }
	    
	    System.out.println();
	}
	
	/*****************************
	 * method printStudentReport *
	 *****************************/
	private static void printStudentReport(Student s) {
		// Input: s is a student for which we will generate a report in standard output

		System.out.println("ID # -----> " + s.getId());
	    	System.out.println("Name -----> " + s.getName());
	    	System.out.println("Address --> " + s.getAddress());
	    	System.out.println();
	}
	
	/***************************
	 * method doAllEnrollments *
	 ***************************/
	private static void doAllEnrollments(Course[] courses, Student[] students) {
		courses[0].enroll(students[0]);
		courses[0].enroll(students[2]);
		courses[0].enroll(students[3]);
		courses[0].enroll(students[4]);
		courses[0].enroll(students[6]);
		courses[0].enroll(students[1]);
		
		courses[1].enroll(students[1]);
		courses[1].enroll(students[3]);
		courses[1].enroll(students[5]);
		courses[1].enroll(students[6]);
		
		courses[2].enroll(students[0]);
		courses[2].enroll(students[1]);
		courses[2].enroll(students[2]);
		courses[2].enroll(students[3]);
		courses[2].enroll(students[4]);
		courses[2].enroll(students[5]);
		courses[2].enroll(students[6]);
		
		courses[3].enroll(students[3]);
		courses[3].enroll(students[6]);
		
		courses[4].enroll(students[0]);
		courses[4].enroll(students[1]);
		courses[4].enroll(students[3]);
		courses[4].enroll(students[5]);
	}

}