package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class backStringp131 {
	LinkedList<String> paths= new LinkedList<>();
	ArrayList<List<String>>res= new ArrayList<>();
	 public List<List<String>> partition(String s) {
		 //StringBuffer temp = new StringBuffer(s);
		 back(0,s);
		 return res;
	    }
	 
	private void back(int start,String temp) {
		if(start>=temp.length()) {
			res.add(new ArrayList<>(paths));
			return;
		}
		for(int i = start;i<temp.length();i++) {
			if(check(temp.substring(start,i+1))) {
				paths.add(temp.substring(start,i+1));
				back(i+1,temp);
				paths.removeLast();
			}else {
				continue;
			}
		}
	}
	private boolean check(String s) {
		for(int i = 0,j =s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
