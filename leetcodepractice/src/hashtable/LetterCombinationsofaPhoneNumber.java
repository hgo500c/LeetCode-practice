package hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	 public List<String> letterCombinations(String digits) {
	        HashMap<String,String> check = new HashMap<String,String>();
	        check.put("2","abc");
	        check.put("3","def");
	        check.put("4","ghi");
	        check.put("5","jkl");
	        check.put("6","mno");
	        check.put("7","pqrs");
	        check.put("8","tuv");
	        check.put("9","wxyz");
	        List res = new LinkedList<String>();
	        if(digits.length()==0) {
	        	return res;
	        }
	        combination (0,res,digits,"",check);
	        return res;   	
	        }
	 public void combination (int offset,List res, String input, String ans,HashMap<String,String>check) {
		 if(offset>=input.length()) {
		 res.add(ans);
		 return;
	 }
		 String temp = input.substring(offset,offset+1);
		 String tempdigit= check.get(temp);
		 for(int i = 0; i<tempdigit.length();i++) {
			 combination(offset +1,res,input,ans = ans +tempdigit.substring
					 (i,i+1),check);
			 
		 }
		 
	    }
}


