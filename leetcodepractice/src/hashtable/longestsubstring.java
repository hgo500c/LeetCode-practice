package hashtable;
import java.util.HashMap;
public class longestsubstring {
	 public int lengthOfLongestSubstring(String s) {
	        int finallength = 0;
	        int currentlength = 0;
	        HashMap<Character,Integer> check = new HashMap<Character,Integer>();
	        int length = s.length();
	        if (length == 0) return 0;
	        for(int j=0;j<length;j++) {
	        for(int i = j; i<length;i++) {
	        	if(check.containsKey(s.charAt(i))){
	        		if (currentlength>finallength) {
	        			finallength = currentlength;
	        			currentlength =0;
	        			check.clear();
	        			break;
	        		}else {
	        			currentlength =0;
	        			check.clear();
	        			break;
	        		}
	        	}else {
	        	check.put(s.charAt(i), null);
	        	currentlength++;
	        	
	        	}
	        	if(i==length-1) {
	        		if(currentlength>finallength) {
	        			finallength = currentlength;
	        		}
	        	}
	        }
	        }
	        return finallength;
	    }
	}
