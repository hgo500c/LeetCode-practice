package array;

import java.util.ArrayList;

public class searchRangeproblem {
	 public int[] searchRange(int[] nums, int target) {
		 int length =nums.length;
		 ArrayList<Integer> output = new ArrayList<Integer>();
	        for(int i=0; i<length; i++) {
	        	if(target==nums[i]) {
	        		output.add(i);
	        	}
	        }
	        length = output.size();
	        if(length<1) {
	        	int[] temp= {-1,-1};
	        	return temp;
	        }
	        int top= output.get(0);
	        int end = output.get(length-1);
	        int[] temp= {top,end};
	        return temp;
	    }
}
