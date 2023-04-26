package isPalindrome;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		Solution x = new Solution();
		System.out.println(x.isPalindrome(101));
	}

	public boolean isPalindrome(int x) {
		// int must be the same reversed as forward
		String s = String.valueOf(x);
		int n = s.length();

		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;

	}
}
