package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class cutindigit {
	LinkedList<String> paths= new LinkedList<>();
	ArrayList<String>res= new ArrayList<>();
public List<String> restoreIpAddresses(String s) {
        back(s,0);
        return res;
    }
private void back(String s,int start) {
	if(start>=s.length()&&paths.size()==4) {
		StringBuffer temp = new StringBuffer();
		for(int i = 0;i<paths.size()-1;i++) {
			temp.append(paths.get(i)+".");
		}
		temp.append(paths.get(paths.size()-1));		
		res.add(temp.toString());
		return;
	}
	for(int i = start;i<s.length();i++) {
		if(check(s.substring(start,i+1))) {
			paths.add(s.substring(start,i+1));
			back(s,i+1);
			paths.remove(paths.size()-1);
		}else {
			continue;
		}
	}
}
private boolean check(String s) {
	int num =0;
	for (int i = 0; i <s.length(); i++) {
		 num = num * 10 + (s.charAt(i) - '0');
         if (num > 255) { 
                return false;
            }
	}
	if(s.length()>1&&s.charAt(0)=='0') {
		return false;
	}else {
		return true;
	}
	
}
}
