package String;

public class changespace2 {
	public String replaceSpace(String s) {
	StringBuffer str = new StringBuffer();
	int count = 0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	int length = s.length()+2*count;
	int f = length-1;
	int sl= 0;
	char[] temp = new char[length];
	for(sl=s.length()-1;sl>=0;sl--,f--) {
		if(s.charAt(sl)==' ') {
			temp[f]='0';
			f = f-1;
			temp[f]='2';
			f=f-1;
			temp[f]='%';
		}else {
			temp[f]=s.charAt(sl);
		}
	}
	return new String(temp);
	}
}
