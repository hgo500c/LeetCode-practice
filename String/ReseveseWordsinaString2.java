package String;

import java.util.Stack;

public class ReseveseWordsinaString2 {
	 public String reverseWords(String s) {
		 Stack<String> temp = new Stack<String>();
		 int start = 0;
		 int spacecount = 0;
		 StringBuffer res = new StringBuffer();
		 for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
			  spacecount++;
			  if(spacecount==1) {
	           temp.add(s.substring(start,i));
			  }start=i+1;
			}else {
				spacecount=0;
			}
		 }
		 temp.add(s.substring(start,s.length()));
		  while(!temp.empty()) {
			 res.append(temp.pop());
			 res.append(" ");
		 }
		 res.delete(res.length()-1, res.length());
		 if(res.subSequence(res.length()-1, res.length()).equals(" ")) {
				res.delete(res.length()-1, res.length());
			}
	        if(res.subSequence(0,1).equals(" ")) {
				res.delete(0,1);
			}
		 return res.toString();
	 }
}
