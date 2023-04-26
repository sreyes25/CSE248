package NumberOfSubArrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] arr = {1,3,5};
		System.out.println(s.numOfSubarrays(arr));
	}

	public int numOfSubarrays(int[] arr) {

		int odd = 0;
		for (int idx = 0; idx < arr.length; idx++) {

			for (int i = idx; i < arr.length; i++) {
				int sum = 0;
				for (int j = i; j >= idx; j--) {
					sum += arr[j];
				}
				if (sum % 2 != 0) {
					odd++;
				}
			}
		}

		return odd;

	}
}
