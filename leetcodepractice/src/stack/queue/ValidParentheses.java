package stack.queue;

import java.util.Stack;

public class ValidParentheses {
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for(char tempc: s.toCharArray()) {
	        	if(tempc == '(') {
	        		stack.push(')');
	        	}
	        	if(tempc == '[') {
	        		stack.push(']');
	        	}
	        	if(tempc == '{') {
	        		stack.push('}');
	        	}
	        	else if(stack.isEmpty()||tempc!=stack.pop()) {
	        		return false;
	        	}
	        }
	        return stack.isEmpty();
}
}
