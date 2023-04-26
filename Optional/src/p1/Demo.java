package p1;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Student> result1 = Optional.ofNullable(null);
		Optional<Student> result2 = Optional.ofNullable(new Student("A", 3.3));
		
		if(result2.isPresent()) {
			System.out.println("Is Present");
			
		}
		else
			System.out.println("There is no object in option");
		
		
		System.out.println(result1.orElse(new Student("zzz", 1.1)));
		System.out.println(result1.get());
		
	}
	
	
	//new 
	

}
