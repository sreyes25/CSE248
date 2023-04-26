package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {20,5,8,10,21};
		
		//List<Integer> list = Arrays.stream(arr1).filter(n->n%2 ==0).map(x->x*x).sorted().collect(Collectors.toList());
		
		Arrays.stream(arr1).filter(n->n%2 ==0).map(x->x*x).sorted().forEach(System.out::println);
		
		
		
		
	}

}
