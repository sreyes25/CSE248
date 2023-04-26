import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		int a = 5, b = 3, c = 10;
		double x = 3.14, y = 2.0, z = 1.5;

		int result1 = a * b + c;
		double result2 = x / y + z;
		double result3 = Math.pow(x, y);

//		System.out.println("a * b + c = " + result1);
//		System.out.println("x / y + z = " + result2);
//		System.out.println("x ^ y = " + result3);
		int[] nums = { 1, 2, 2, 3, 3, 3 };
		int k = 2;

		System.out.println(isPalindrome("ABCBA"));

	}

	public static boolean isPalindrome(String s) {

		StringBuilder str = new StringBuilder();
		str.append(s);
	
		return str.reverse().toString().equals(s);
		
	}

	public static int[] removeDuplictes(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int n : nums) set.add(n);

		return set.stream().mapToInt(i -> i).toArray();

	}

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		List<Integer>[] buckets = new List[nums.length - 1];
		for (int i = 0; i < buckets.length - 1; i++)
			buckets[i] = new ArrayList<>();

		for (int key : map.keySet()) {
			buckets[map.get(key)].add(key);
		}

		List<Integer> result = new ArrayList<>();

		for (int i = buckets.length - 1; i >= 0; i--) {
			if (buckets[i] != null) {
				result.addAll(buckets[i]);
			}
			if (result.size() >= k) {
				for (int kElems = result.size() - 1; kElems >= k; kElems--) {
					result.remove(kElems);
				}
				break;
			}
		}

		return result.stream().mapToInt(i -> i).toArray();

	}
}
