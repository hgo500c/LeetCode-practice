package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacters {
	 public List<String> commonChars(String[] words) {
	        int length =words.length;
	        List<String> output = new ArrayList<String>();
	       int[] hash = new int[26];
	          if(length==0)return output;
	    	   for(char c: words[1].toCharArray()) {
	    		   hash[c-'a']++;
	    	   }
	    	   for(int i=0;i<length;i++) {
	        	int[]hashnew=new int[26];
	        	for(char c: words[i].toCharArray()) {
		    		   hashnew[c-'a']++;
	            }
	        	for(int j = 0;j<26;j++) {
	        		hash[j]=Math.min(hash[j], hashnew[j]);
	        	} 	
	    }
	    	   for(int z = 0;z<26;z++) {
	    		   while(hash[z]!=0) {
	    			   char o = (char)(z+'a');
                       output.add(String.valueOf(o));
                       hash[z]--;
	    	   }
	 }
	    	   return output;
}
}