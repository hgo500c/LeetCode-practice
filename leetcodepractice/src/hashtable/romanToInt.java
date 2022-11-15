package hashtable;
import java.util.*;
public class romanToInt {
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
	     for(int i = 0;i<length;i++) {
	    	 if(i!= (length-1)) {
	    	 if(s.substring(i, i+1).equals("I")&&(s.substring(i+1, i+2).equals("V")
	     ||	s.substring(i+1, i+2).equals("X") ))
	    			 {
	    		 number=number - 1;
	    		 continue;
	    	 }
	    	 if(s.substring(i, i+1).equals("X")&&(s.substring(i+1, i+2).equals("C")
	     ||	s.substring(i+1, i+2).equals("L") ))
	    			 {
	    		 number=number - 10;
	    		 continue;
	    	 }
	    	 if(s.substring(i, i+1).equals("C")&&(s.substring(i+1, i+2).equals("D")
	    		     ||	s.substring(i+1, i+2).equals("M") ))
	    		    			 {
	    		    		 number=number - 100;
	    		    		 continue;
	    		    	 }else {
	    		  int newnumber=table.get(s.substring(i, i+1));
	    		  number = number +newnumber;
	    				  
	    		 }
	     }else {
	    	int newnumber=table.get(s.substring(i, i+1));
   		  number = number +newnumber;
	     }
	    
	     
	}
	     return number;
	 }
}
