package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class sums3{
	public List<List<Integer>> threeSum(int[] nums) {	
		Arrays.sort(nums);
		HashSet<List<Integer>> res = new HashSet<List<Integer>>();
		if(nums.length==0)return new ArrayList<>(res);
		for(int i = 0;i<nums.length;i++) {
			int l = i+1;
			int r = nums.length-1;
			int sum = 0;
			while(l<r) {
			 sum= nums[i]+nums[l]+nums[r];
			if(sum==0) {
				res.add(Arrays.asList(nums[i],nums[l],nums[r]));
				l=l+1;
				r=r-1;
			}else {
			if(sum<0) {
				l=l+1;
			}if(sum>0) {
				r=r-1;
			}
			}
		}		
	}
		return new ArrayList<>(res);
	}
}

