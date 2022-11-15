package String;

public class leftrotate {
	 public String reverseLeftWords(String s, int n) {
           StringBuffer res = new StringBuffer();
           StringBuffer temp = new StringBuffer();
           for(int i=0;i<s.length();i++) {
        	   if(i<n) {
        		   temp.append(s.charAt(i));
        	   }
        	   else {
        		   res.append(s.charAt(i));
        	   }
           }
           res.append(temp);
           return res.toString();
	    }
}
