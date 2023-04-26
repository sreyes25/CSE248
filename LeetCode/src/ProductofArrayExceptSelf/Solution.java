package ProductofArrayExceptSelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

	public static int[] productExceptSelf(int[] nums) {
		int prod = 1;
		int zero = 1;

		for (int n : nums) {
			if (n == 0) {
				zero = prod;
				prod *= n;
				continue;
			}
			zero *= n;
			prod *= n;
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[i] = prod / nums[i];
			}

			else
				nums[i] = zero;
		}

		return nums;
	}

}
