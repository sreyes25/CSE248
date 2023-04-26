package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args){
		////Way 1
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> newList = filter(list, num -> num%2 == 0);
		System.out.println(newList);
		
		////Way 2
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // create a predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        // use the predicate to filter the list of numbers using Stream API
        List<Integer> evenNumbers = numbers.stream().filter(isEven).toList();
        										//OR//(num -> num%2 == 0)
        
        System.out.println(evenNumbers);
	}

	public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate){
		List<Integer> result = new ArrayList<>();
		for(Integer item : list){
			if(predicate.test(item)){
				result.add(item);
			}
		}
		return result;

	}

}
