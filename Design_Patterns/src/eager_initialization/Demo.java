package eager_initialization;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor i1 = Instructor.getInstance();
		i1.setName("Jack");
		System.out.println(i1.getName());
		
		Bag bag = new Bag();
		
		
	}

}
