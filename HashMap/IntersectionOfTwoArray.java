package HashMap;

import java.util.HashSet;

public class IntersectionOfTwoArray {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        int[] output = null;
	        if(nums1==null||nums2==null) {
	        	return output;
	        }
	        HashSet<Integer> temp = new HashSet<Integer>();
	        HashSet <Integer>temp2 = new HashSet<Integer>();
	       for(int i: nums1) {
	        	temp.add(i);
	        }
	       for(int i: nums2) {
	    	   if(temp.contains(i)) {
	    		   temp2.add(i);
	    	   }
	       }
	     
	    	 int i = 0;
	    	 for(int j :temp2) {
	    		 output[i++]=j;
	    	 }
	    	 return output;
	      
	    }
}
