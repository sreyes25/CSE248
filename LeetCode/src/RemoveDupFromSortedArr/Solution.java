package RemoveDupFromSortedArr;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
	public static void main(String[] args) {
		int[] nums = {1,1,2,3};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		
		HashSet<Integer> set = new HashSet<>();
		int leftP = 0;
		int m = nums.length;
		
		for(int i = 0; i < m; i++, leftP++) {
			if(!set.add(nums[i])){
				int duplicate = nums[i];
				while(i < m && nums[i] == duplicate) {
					i++;
				}
				if(i<m) {
				set.add(nums[i]);
				nums[leftP] = nums[i];
				}
			}
			if(i<m) {
			nums[leftP] = nums[i];
			}
		}
		return set.size();
		
	}
	
	    public static int removeDuplicates1(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();

	        int pointer = nums.length;
	        
	        for(int i = 0; i < pointer; i++) {
	            if(!set.add(nums[i])){
	                int j = i;
	                while(j < pointer-1){
	                    nums[j] = nums[j+1];
	                    j++;
	                }
	                pointer--;
	                i--;
	            }
	        }

	        return set.size();
	    }
}
