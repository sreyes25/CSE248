package p1_custom;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("JJ", 2.2);
		StudentObserver observer1 = new StudentObserver("Registar's office", student);
		StudentObserver observer2 = new StudentObserver("Dean's office", student);
		student.unregister(observer1);
		student.setGpa(3.0);
		student.setName("Jane");
		student.setGpa(4.0);
		
	
	}

}
