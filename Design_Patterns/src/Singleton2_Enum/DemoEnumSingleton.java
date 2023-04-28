package Singleton2_Enum;

public class DemoEnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor i1 = Instructor.INSTANCE;
		Instructor i2 = Instructor.INSTANCE;
		i1.setSalary(101010.00);
		System.out.println(i1 == i2); //true 
		/*
		 * this means this is the same instance
		 */
		System.out.println(i2.getSalary());
		// Further confirms that this is the same instance
	}

}
