package HashMap;

import java.util.HashMap;

public class Sums4 {
	 public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
	        HashMap<Integer,Integer> checkAB = new HashMap<>();
	        int count=0;
	        for(int a :nums1) {
	        	for(int b:nums2) {
	        		int sum1= a+b;
	        		if(checkAB.containsKey(sum1)) {
	        			int newcount = checkAB.get(sum1)+1;
	        			checkAB.put(sum1, newcount);
	        		}else {
	        		checkAB.put(sum1,1);
	        		}
	        	}
	        }
	        for(int c:nums3) {
	        	for(int d:nums4) {
	        		int remain = 0-c-d;
	        		if(checkAB.containsKey(remain)) {
	        			count = checkAB.get(remain)+count;
	        		}
	        	}
	        }
	        return count;
	    }
}
