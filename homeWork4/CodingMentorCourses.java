package homeWork4;

import java.util.Arrays;

public class CodingMentorCourses {
	public static void main(String[] args) {
		Course dataAnalyst = new Course();
		dataAnalyst.setName("Data Analyst");

		Intake da1 = new Intake();
		da1.setName("Data Analyst 1");
		da1.setStartDate("01-01-2023");
		da1.setEndDate("01-06-2023");

		Mentor mentorDa1 = new Mentor();
		mentorDa1.setName("Tien");
		da1.setMentor(mentorDa1);

		Student student1 = new Student();
		student1.setName("Alex");
		da1.addStudent(student1);

		Student student2 = new Student();
		student2.setName("Sam");
		da1.addStudent(student2);
		

		dataAnalyst.addIntake(da1);

		// print out details

		System.out.println("Data Analyst Details: ");

		for (Intake intake : dataAnalyst.getIntakes()) {
			if (intake != null) {
				System.out.println("Intake: " + intake.getname());
				System.out.println("Start Date: " + intake.getStartDate());
				System.out.println("End Date: " + intake.getEndDate());
				System.out.println("Mentor: " + intake.getMentor().toString());
				
				Student[] students = intake.getStudents();
				String[] studentNames = new String[students.length];
				for (int i =0; i < students.length; i++){
					if (students[i] != null) {
						studentNames[i] = students[i].getName();
				}
				
				}
				System.out.println("Students: " + Arrays.toString(studentNames));
			}

		}

	}
}
