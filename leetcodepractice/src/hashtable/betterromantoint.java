package hashtable;

import java.util.HashMap;

public class betterromantoint {
	 public int romanToint(String s) {
	 HashMap<String,Integer>table=new HashMap<String,Integer>();
     table.put("I",1);
     table.put("V",5);
     table.put("X",10);
     table.put("L",50);
     table.put("C",100);
     table.put("D",500);
     table.put("M",1000);
     int length = s.length();
     int number = 0;
     int prev = 0;
     for(int i = 0;i<length;i++) {
    	 int newnumber= table.get(s.charAt(i));
    	 if(newnumber>=prev) {
    		 number=number+prev;
    	 }else {
    		number= number-prev;
    	 }
    	 prev = newnumber;
}
     number = number + prev;
     return number;
 }
}

