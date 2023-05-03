package p1_custom;

public interface Observable {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
	
}
