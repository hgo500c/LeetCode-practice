package String;

public class StringReverse2TRue {
	 public String reverseStr(String s, int k) {
		 StringBuffer res = new StringBuffer();
		 int length = s.length();
		 int start =0;
		 int k1=0;
		 int k2 =0;
		 while(start<length) {
			 if(start+k<length) {
				 k1=start+k;
			 }else {
				 k1=length;
			 }
			 if((start+k*2)<length) {
				 k2=start+2*k;
			 }else {
				 k2=length;
			 }
			 StringBuffer temp = new StringBuffer();
			 temp.append(s.substring(start,k1));
			 res.append(temp.reverse());
			 if(k1<k2) {
			 res.append(s.substring(k1,k2));
			 }
			 start=start+k*2;
		 }
		 return res.toString();
		 
	 }
}
