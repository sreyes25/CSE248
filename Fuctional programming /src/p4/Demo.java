package p4;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction <Double, Double, Double> add = (x, y) -> x+y;
		
		Function<Double, String> Number = x -> String.valueOf(x/4);
		//System.out.println(Number.apply(2.0));
		
		Consumer<Double> c1 = (Double n) -> System.out.println(n*100);
		Consumer<Double> c2 = System.out::println;
		Consumer<Double> c3 = Demo::print;
		
//		c1.accept(1.5);
//		c2.accept(1.5);
//		c3.accept(1.5);
	
		//Supplier: It does not take any arguments and returns a result of a specified type.
		Supplier<Double> s1 = () -> Math.random()*100;
		for(int i = 0; i< 10; i++) {
			System.out.println(s1.get());	
		}
		
		
	}
	
	public static void print(Double n) {
		System.out.println(n*500);
	}

}
