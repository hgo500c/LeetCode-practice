package String;

public class KMPSimple {
	 public int strStr(String haystack, String needle) {
	        int[] next = new int[needle.length()];
	        if(needle.length()==0)return 0;
	        getNext(next,needle);
	        int j = 0;
	        
	        for(int i = 0;i<haystack.length();i++) {
	        	while(j>0&&haystack.charAt(i)!=needle.charAt(j)) {
	        		j=next[j-1];
	        	}if(haystack.charAt(i)==needle.charAt(j)) {
	        		j++;
	        	}
	        	if(j==needle.length()) {
	        		return i-needle.length()+1;
	        	}
	        }
	        return -1;
	        
	    }
	 private void getNext(int[] next, String needle) {
		 int j = 0;
		 next[0]=0;
		 for(int i = 1;i<needle.length();i++) {
			 while(j>0&&needle.charAt(i)!=needle.charAt(j)) {
				 j=next[j-1];
			 }
			 if(needle.charAt(i)==needle.charAt(j)) {
				 j++;
			 }
			 next[i]=j;
		 }
	 }
}
