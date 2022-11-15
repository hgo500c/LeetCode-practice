package HashMap;

import java.util.HashSet;
import java.util.Set;

public class Happynumber {
	 public boolean isHappy(int n) {
	        int result =n;
	        Set<Integer> check = new HashSet<Integer>();
	        while(result!=1&&!check.contains(result)) {
	        	check.add(result);
	        	result = getnumber(result);
	        }
	        boolean happy = result==1?true: false;
	        return happy;
	    }
	 private int getnumber(int n) {
		 int out =0;
		 while(n!=0) {
			 int temp =n%10;
			 out = out +temp*temp;
			 n = n/10;
		 }
		 return out;
	 }
}
