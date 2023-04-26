package compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();

		set1.add(4);
		set1.add(23);
		set1.add(2);
		set1.add(43);
		
		System.out.println(set1);
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(4);
		list1.add(23);
		list1.add(2);
		list1.add(43);
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
