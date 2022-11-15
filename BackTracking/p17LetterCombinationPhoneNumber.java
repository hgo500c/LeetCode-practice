package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class p17LetterCombinationPhoneNumber {
	  String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	  ArrayList<String> res= new ArrayList<>();
	  StringBuffer temp = new StringBuffer();
	  public List<String> letterCombinations(String digits) {
		  int len = digits.length();
		  backTracking(digits, 0,len,0);
		  return res;
	  }
	  private void backTracking(String digit, int start,int len,int sind) {
		  if(temp.length()==len) {
			 res.add(temp.toString());
			 return;
		  }
		  int  z = digit.indexOf(sind)-'0';
		  for(int i = 0;i<numString[z].length();i++) {
			  temp.append(numString[z].charAt(i));
			  backTracking(digit,start+1,len,sind+1);
			  temp.delete(temp.length()-1, temp.length());
		  }
	  }
}
