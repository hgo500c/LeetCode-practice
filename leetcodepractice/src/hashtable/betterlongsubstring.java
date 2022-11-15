package hashtable;

import java.util.HashMap;

public class betterlongsubstring {
	 public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> check = new HashMap<Character,Integer>();
     int length = s.length();
     int finallength =0;
     for(int i = 0,j=0; i<length; i = i +1) {
    	 if(check.containsKey(s.charAt(i))){
    		 j=Math.max(j, check.get(s.charAt(i))+1);
    	 }
    	 check.put(s.charAt(i), i);
    	 finallength = Math.max(finallength, i-j+1);
     }
     return finallength;
 }
}
