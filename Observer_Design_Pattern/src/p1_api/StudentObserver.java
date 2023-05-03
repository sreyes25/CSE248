package p1_api;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {

	private String name;
	private Student student;
	
	public StudentObserver(String name, Student student) {
		student.addObserver(this);
		this.student = student;
		System.out.println("Added a new Observer: "+ name +".");
	};
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("The student observed is : " +
		((Student)o).getName() +", "+ ((Student)o).getGpa());
		System.out.println(arg);
	}

}
