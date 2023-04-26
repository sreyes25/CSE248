package eager_initialization;

public class Instructor {
	private static String name;
	private static Instructor instructor = new Instructor();
	
	private Instructor() {
	}
	
	public static Instructor getInstance() {
		return instructor;
	}
	
	public void setName(String name) {
		Instructor.name = name;
	}
	
	public String getName() {
		return name;
	}
}
