package Enum;

public enum Rank {
	INSTRUCTOR(40000.00), ASSISTANT_PROF(60000.00), ASSOCIATE_PROF(80000.00), PROFESSOR(100000.00);
	
	
	/* We can attach instructions to theses ranks */
	private double salary;
	
	private Rank(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
