package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable m1 = () -> System.out.println("Fly");
		
		
		m1.move();
		m1.eat();
		Moveable.drink();
	}

}
