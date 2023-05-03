package p1_custom;

public class StudentObserver implements Observer {
	private String name;
	
	public StudentObserver(String name, Student student) {
		student.register(this);
		System.out.println("Added to: " + name);
	}

	@Override
	public void update(String name, double gpa) {
		// TODO Auto-generated method stub
		System.out.println("The student observed is: "+name+ ": "+gpa);
	}
	
	
}
