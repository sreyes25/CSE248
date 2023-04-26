package GroupAnagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] s) {

		List<List<String>> groupAnagrams = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0, j = 0; i < s.length; i++) {
			char[] word = s[i].toCharArray();
			Arrays.sort(word);
			String str = new String(word);
//			aet		aet		ant		aet		ant		bat
//	i		0				 2						5
//	j		0		0		 1		0		1		2
			if (map.containsKey(str)) {
				groupAnagrams.get(map.get(str)).add(s[i]);
			} else {
				List<String> list = new LinkedList<>();
				list.add(s[i]);
				groupAnagrams.add(list);
				map.put(str, j);
				j++;
			}
		}

		return groupAnagrams;

	}
}

//Given an array of strings strs, group the anagrams together. 
//You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters 
//of a different word or phrase, typically using all the original 
//letters exactly once.
//
// 
//
//Example 1:	   0	 1	 	2    3     4     5
//				  aet   aet    ant  aet   ant   bat
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
