package homeWork4;

public class Course {
	private String name;
	private Intake[] intakes;
	private int numIntakes;
	
	public Course() {
		this.name = "";
		this.intakes = new Intake[3];
		this.numIntakes = 0;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addIntake(Intake intake) {
		if (numIntakes < 3) {
			intakes[numIntakes] = intake;
			numIntakes++;
			
		}
	}
	
	public Intake[] getIntakes() {
		return intakes;
	}

}
