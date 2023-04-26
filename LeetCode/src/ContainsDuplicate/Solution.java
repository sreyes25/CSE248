package ContainsDuplicate;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean containsDuplicate(int[] nums) {
	       HashSet<Integer> set = new HashSet<>();

	       for(int n : nums){
	           if(!set.add(n)){
	               return true;
	           }
	       } 
	       return false;
	    }
}
