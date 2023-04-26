package Valid_Parentheses;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		System.out.println(isValid("[][[]]()"));
	}

	public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>(); 
	        char[] str = s.toCharArray();
	        for(char c : str) {
	        	
	        	if(stack.isEmpty()) {
	        		stack.add(c);
	        		continue;
	        	}
	        	
	        	switch(c){
	        	case 41:
	        		if(stack.peek() == 40)
	        		stack.pop();
	        		else stack.add(c);
	        		break;
	        	case 93:
	        		if(stack.peek() == 91) 
	        		stack.pop();
	        		else stack.add(c);
	        		break;
	        	case 125:
	        		if(stack.peek() == 123) 
	        		stack.pop();
	        		else stack.add(c);
	        		break;
	        	default:
	        		stack.add(c);
	        	}
	        	
	        }
	        
	        return stack.isEmpty();
	    }
}
