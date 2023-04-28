package Enum;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor1 = new Instructor("Joe", Rank.ASSOCIATE_PROF);
		
		Rank rank = Rank.ASSISTANT_PROF;
		double salary = rank.getSalary();
		
		rank.setSalary(1000000.00);
		
		System.out.println(rank.getSalary());
	}

}
