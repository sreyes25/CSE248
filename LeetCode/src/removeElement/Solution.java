package removeElement;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(nums, val));
		for(int n : nums) {
			System.out.print(n+",");
		}
		
	}

	public static int removeElement(int[] nums, int val) {
		int rightP = nums.length - 1;
		int counter = 0;

		for (int i = 0; i <= rightP; i++) {
			if (nums[i] == val) {
				counter++;
				while (i < rightP) {
					if (nums[rightP] != val) {
						nums[i] = nums[rightP];
						nums[rightP--] = 0;
						break;
						
					}
					counter++;
					nums[rightP--] = 0;
				}
			}
		}
		counter = nums.length-counter;
		return counter;
	}
}
