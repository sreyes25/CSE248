package Find_K_Closest_Elements;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
	int[] nums = {2,1,3,4,22};
	int target = 6;
	int[] ans = twoSums(nums, target);
		System.out.println(ans[0] +" "+ ans[1]);
	}
	public static int[] twoSums(int[] nums, int target) {
		
		int n = nums.length;
		
        Map<Integer,Integer> map=new HashMap<>();
        
        int[] result = new int[2];
        
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]= map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
		
	}
}
