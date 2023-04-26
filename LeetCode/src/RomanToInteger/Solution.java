package RomanToInteger;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
	}

	public static int romanToInt(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		String[] arr = s.split("");
		int sum = map.get(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (map.get(arr[i - 1]) < map.get(arr[i])) {
				
				sum += map.get(arr[i]) - (2*map.get(arr[i - 1]));
				
			} else
				sum += map.get(arr[i]);
			
		}

		return sum;
	}
}
