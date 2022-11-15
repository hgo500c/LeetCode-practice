package array;

import java.util.Stack;

public class BackspaceStringCompare {
	  public boolean backspaceCompare(String s, String t) {
	        return(reduce(s).equals(reduce(t)));
	    }
	  private String reduce(String temp) {
		Stack tempp = new Stack();
		char[] chararry = temp.toCharArray();
		for(char c :chararry) {
			if(c=='#') {
			if(!tempp.isEmpty()) {
				tempp.pop();
			}
			}
			else {
				tempp.push(c);
			}
		}
		return tempp.toString();
	       }
}

