package ContainsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {

	public static void main(String[] args) {
		int[] nums = { 1,2,3,2,3,3,5,46,3,76,6,8};
		int k = 1;
		Solution solution = new Solution();
		System.out.println(solution.containsNearbyDuplicate(nums, k));
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			 
			if (i > k) //abs value
				set.remove(nums[i-k-1]); //i cross range remove prev 
									    // we can remove these values because they do not matter since
									   //we no longer are in the range of the k parameter
			
			if (!set.add(nums[i])) //set.add returns false if duplicate 
				//if false we already know that the dup is 
				return true; 
		}
		
		return false;
	}

	public boolean containsNearbyDuplicate1(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> dup = new LinkedList<>();
		int distance = 10000000;

		for (int i = 0; i < nums.length; i++) {
			Integer value = map.get(nums[i]);
			if (value == null) {
				map.put(nums[i], i);
			} else
				dup.add(i);

		}

		Set<Integer> keys1 = map.keySet();
		System.out.println(map);
		System.out.println(dup);

		return distance == k;
	}

	// Time Complexity == n^2
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		int distance = 100000000;
		boolean isK = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					int tempDistance = Math.abs(i - j);
					if (tempDistance < distance) {
						distance = tempDistance;
						isK = distance <= k;
					}

				}
			}

		}
		return isK;
	}
}