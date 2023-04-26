package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Z", 6.1);
		Student s2 = new Student("F", 1.6);
		Student s3 = new Student("S", 2.1);
		Student s4 = new Student("H", 1.1);
		Student s5 = new Student("K", 9.1);
		Student s6 = new Student("E", 33.6);
		Student s7 = new Student("W", 2.5);
		Student s8 = new Student("T", 3.3);
	
		List<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		
		//Collections.sort(list () => Double.compare(0, 0));
		System.out.println(list);
		
		
		//System.out.println(s1.equals(s2));
//		System.out.println(s1 == s2);
		
//		String str1 = new String("hello");
//		String str2 = new String("hello");
//		
//		String str3 = "hello"; //These two have the same memory address
//		String str4 = "hello"; //We call this intern
//		
//		//String object in java is immutable
//		System.out.println(str3 == str4);   //== always reads memory address
	
//		HashSet<Student> set1 = new HashSet<>();
//		
//		System.out.println(set1.add(s1));
//		System.out.println(set1.add(s2));
//		
//		System.out.println(set1);
		
	
		
		
	}

}
