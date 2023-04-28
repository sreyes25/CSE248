package Singleton2_Enum;

import java.io.Serializable;

public enum Instructor implements Serializable {
	INSTANCE("John", 10000.00, 5);	//name, salary, courses
	
	private String name;
	private double salary;
	private int[] courseArr;
	private int size;
	
	private Instructor(String name, double salary, int size) {
		this.name = name;
		this.salary = salary;
		this.courseArr = new int[size];
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int[] getCourseArr() {
		return courseArr;
	}

	public void setCourseArr(int[] courseArr) {
		this.courseArr = courseArr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
