package String;

public class KMP459 {
	 public boolean repeatedSubstringPattern(String s) {
	    int[]next = new int[s.length()];
	    int j = 0;
	    int length = s.length(); 
	    next[0]=0;
	    for(int i = 1;i<length;i++) {
	    	while(j>0&&s.charAt(i)!=s.charAt(j)) {
	    		j=next[j-1];
	    	}
	    	if(s.charAt(i)==s.charAt(j)) {
	    		j++;
	    	}
	    	next[i]=j;
	    }
	    
	    
		 if(next[s.length()-1] > 0&&s.length()%(s.length()-next[s.length()-1])==0) {
			 return true;
		 }else {
			 return false;
		 }
	    }
}
