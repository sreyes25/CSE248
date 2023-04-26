package TwoSums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 4 };
		int t = 6;
		System.out.println(Arrays.toString(twoSums(nums, t)));
	}
	public static int[] twoSums(int[] nums, int t) {

		Map<Integer, Integer> map = new HashMap<>();

		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(t - nums[i])) {
				res[0] = map.get(t - nums[i]);
				res[1] = i;
				break;
			} else
				map.put(nums[i], i);

		}

		return res;
	}
}
