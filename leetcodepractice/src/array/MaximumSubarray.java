package array;

public class MaximumSubarray {
public int maxSubArray(int[] nums) {
	int sum =-99999999;
	int max= 0;
        for(int i = 0; i<nums.length;i++) {
        	if(sum<0) {
        		sum=nums[i];
        		}else {
        	sum=sum+nums[i];
         }
        	if(max<sum) {
        		max= sum;
        	}
        }
        return max;
    }
}
