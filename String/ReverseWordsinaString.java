package String;

public class ReverseWordsinaString {
	 public String reverseWords(String s) {
	        StringBuffer temp = new StringBuffer();
	        StringBuffer res = new StringBuffer();
	        int spacecount=0;
	        for(int i = s.length()-1;i>-1;i--) {
	        	if(s.charAt(i)!=' ') {
	        		spacecount=0;
	        		temp.append(s.charAt(i));
	        	}else {
	        		spacecount++;
	        		if(spacecount==1&&temp.length()!=0) {
	        			temp=temp.reverse();
	        			temp.append(" ");
	        			res.append(temp);
	        			temp.setLength(0);
	        		}
	        	}
	        }
	        temp=temp.reverse();			
			res.append(temp);
			if(res.subSequence(res.length()-1, res.length()).equals(" ")) {
				res.delete(res.length()-1, res.length());
			}
			return res.toString();
	    }
}
