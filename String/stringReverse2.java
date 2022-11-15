package String;

public class stringReverse2 {
	 public String reverseStr(String s, int k) {
	        int l =0;
     int r = k;
     StringBuffer res= new StringBuffer();
     StringBuffer temp = new StringBuffer();
     while(r<s.length()) {
     	if((r+k)<s.length()) {
        
     	String scut = s.substring(l,r);
     	temp.append(scut);
     	temp.reverse();
     	res.append(temp);
     	String second = s.substring(r,r+k);
     	res.append(second);
     	l=l+2*k;
     	r=r+2*k;
     	}
     	if((r+k)>=s.length()) {
     		String scut = s.substring(l,r);
	        	temp.append(scut);
	        	temp.reverse();
	        	res.append(temp);
	        	String second = s.substring(r,s.length());
	        	res.append(second);
	        	return res.toString();
     	}	 
     }
     String last = s.substring(l,s.length());
     temp.append(last);
     temp.reverse();
     res.append(temp);
     return res.toString(); 
	    }
}
