package p1_api;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("John", 2.0);
		StudentObserver observer1 = new StudentObserver("Registrar's office", student);
		student.setGpa(2.5);
	}

}
