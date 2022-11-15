package array;
import java.util.*;
public class threenumers {
public List<List<Integer>> threeSum(int[] nums) {
	    Arrays.sort(nums);
	    HashSet<List<Integer>> result = new HashSet<List<Integer>>();
	    if(nums.length==0)return new ArrayList<>(result);
        for(int i = 0; i<nums.length-2;i++) {
        	int j = i+1;
        	int k = nums.length -1;
        	int sum = 0;
        	while(j<k) {
        		sum = nums[i]+nums[j]+nums[k];
        		if(sum ==0) {
        			result.add(Arrays.asList(nums[i],nums[j],nums[k]));
        			j = j +1;
        			k = k-1;
        			}
        		else {
        			if(sum<0) j = j+1;
        			if(sum>0)k = k-1;
        		}
        		}
        	
        }
        return new ArrayList<>(result);
    }
}
