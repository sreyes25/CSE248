package composition;

public class Car {
	
	private final Engine engine;
	private Person driver; 	//association
	
	public Car() {
		engine = new Engine();
	}

	public Car(Person person) {
		driver = person;
		engine = new Engine();
	}
}
