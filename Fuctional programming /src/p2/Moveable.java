package p2;

public interface Moveable {

	void move();
	default void eat() {
		System.out.println("eat");
	}
	static void drink() {
		System.out.println("drink");
	}
}
