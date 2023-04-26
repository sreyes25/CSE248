package ValidAnagram;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab", t = "ba";
		System.out.println(isAnagram(s,t));
	}
	
	public static boolean isAnagram(String s, String t) {
		
		char[] w1 = s.toCharArray();
		char[] w2 = t.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		s = new String(w1);
		t = new String(w2);
		if(s.equals(t)) {
			return true;
		}
		
    	return false;
    }

	public static  boolean isAnagram1(String s, String t) {
			int n = s.length()-1;
			
	    	for(int i = 0; i < n; i++) {
	    		if(s.equals(t)) {
	    			return true;
	    	}
	    		s = s.substring(1, s.length());
	    		t = t.substring(1, t.length());
	        }
	    	if(s.equals(t)) {
				return true;
			}
	    	return false;
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
}
