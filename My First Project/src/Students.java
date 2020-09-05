import java.text.*;

public class Students {

	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		Grades student1 = new Grades(100, 92, 98, 95);
		Grades student2 = new Grades(100, 100, 100, 100);
		Grades student3 = new Grades(98, 90, 83, 80);
		
		double stu1Avg = (student1.getGrade1() + student1.getGrade2() + student1.getGrade3() + student1.getGrade4()) / 4;
		double stu2Avg = (student2.getGrade1() + student2.getGrade2() + student2.getGrade3() + student2.getGrade4()) / 4;
		double stu3Avg = (student3.getGrade1() + student3.getGrade2() + student3.getGrade3() + student3.getGrade4()) / 4;
		
		System.out.println("Student 1 Average: " + fmt.format(stu1Avg));
		System.out.println("Student 2 Average: " + fmt.format(stu2Avg));
		System.out.println("Student 3 Average: " + fmt.format(stu3Avg));
	}
}
