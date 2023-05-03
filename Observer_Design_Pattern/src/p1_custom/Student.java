package p1_custom;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
	public String name;
	public double gpa;
	public List<Observer> observerList;
	
	public Student(String name, double gpa) {
		observerList = new ArrayList<>();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObservers();
	}

	public List<Observer> getObserverList() {
		return observerList;
	}

	public void setObserverList(List<Observer> observerList) {
		this.observerList = observerList;
	}

	@Override
	public void register(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int index = observerList.indexOf(observer);
		observerList.remove(index);
		System.out.println("Observer"+(index+1)+" is removed.");
		
	}

	@Override
	public void notifyObservers() {
		for(Observer n : observerList) {
			n.update(name, gpa);
		}
		
	}
	
	
}
