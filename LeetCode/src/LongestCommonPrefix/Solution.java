package LongestCommonPrefix;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}
 
	public static String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];
		for(int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}

	public static String longestCommonPrefix1(String[] strs) {
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> common = new HashSet<>();
		if (strs.length == 1) {
			char[] wordArr = strs[0].toCharArray();
			String s = "";
			for (Character c : wordArr) {
				s += c;
			}
			return s;
		}
		for (String s : strs) {

			char[] wordArr = s.toCharArray();

			for (Character c : wordArr) {

				if (!set.add(c)) {
					common.add(c);
				} else {
					break;
				}
			}
			// map.put(wordArr[0], word);
		}

		String s = "";
		for (Character c : common) {
			s += c;
		}

		return s;
	}
}
