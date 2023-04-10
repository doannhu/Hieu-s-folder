package homeWork4;


public class Intake {
	private String name;
	private String startDate;
	private String endDate;
	private Mentor mentor;
	private Student[] students;
	private int numStudents;
	
	public Intake() {
		this.name = "";
		this.startDate = "";
		this.endDate = "";
		this.mentor = null;
		this.students = new Student[5];
		this.numStudents = 0;
	}
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	//mentor
	public void setMentor( Mentor mentor) {
		this.mentor = mentor;
	}
	
	public Mentor getMentor() {
		return mentor;
	}
	
	//student
	public void addStudent(Student student) {
		if (numStudents < 5) {
			students[numStudents] = student;
			numStudents++;
		}
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	//start date
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	//end date
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getEndDate() {
		return endDate;

}
}
