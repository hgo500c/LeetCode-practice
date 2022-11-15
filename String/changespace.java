package String;

public class changespace {
	public String replaceSpace(String s) {
        StringBuffer str = new StringBuffer();       
        char[] temp = s.toCharArray();
        for(int fast =0;fast<s.length();fast++) {
        	if(temp[fast]==' ') {
        		str.append("%20");        		
        	}else {
        		str.append(temp[fast]);
        	}
        }
        return str.toString();
    }
}
