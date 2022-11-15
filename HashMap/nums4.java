package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class nums4 {
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        HashSet<List<Integer>> res = new HashSet<List<Integer>>();
	        long sum =0;
	        Arrays.sort(nums);
	        if(nums.length==0)return new ArrayList(res);
	        for(int i = 0;i<nums.length;i++) {
	        	 if (nums[i] > 0 && nums[i] > target) {
	                 return new ArrayList(res);
	             }

	             if (i > 0 && nums[i - 1] == nums[i]) {
	                 continue;
	             }
	         for(int j = i+1;j<nums.length;j++) {
	        	 if (j > i + 1 && nums[j - 1] == nums[j]) {
	                    continue;
	                }
	        	 int l = j+1;
	        	 int r = nums.length-1;
	        	 while(l<r) {
	        		 sum = (long)nums[i]+nums[j]+nums[l]+nums[r];
	        		 if(sum==target) {
	        			 res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
	        			 l=l+1;
	        			 r=r-1;
	        		 }else {
	        			 if(sum>target)r=r-1;
	        			 if(sum<target)l=l+1;
	        		 }
	        	 }
	         }
	        }
	        return new ArrayList(res);
	    }
}
