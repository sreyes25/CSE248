package EnumPerson;

import java.io.Serializable;

public enum PersonBag implements Serializable{
	INSTANCE(new Person[1000], 1000);
	
	private int maxSize;
	private Person[] arr;
	private int nElems;
	
	private PersonBag(Person[] arr, int maxSize) {
		this.maxSize = maxSize;
		this.arr = arr;
		nElems = 0;
	}
	
	public Person[] getArray() {
		return arr;
	}
	
	public int getNElems() {
		return nElems;
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public void display() {
		for(Person x : arr) {
			if(x != null) {
			System.out.println(x.toString());
			}
		}
	}
}
