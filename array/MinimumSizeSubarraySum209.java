package array;

public class MinimumSizeSubarraySum209 {
	 public static int minSubArrayLen(int target, int[] nums) {
	       int slow =0;
	        int fast =0;
	        int sum = 0;
	        int length = 0;
	        int output = Integer.MAX_VALUE;
           for(int i = 0;i<nums.length;i++){
               sum = sum + nums[i];
           }
           if (sum<target)return 0;
           sum =0;
	        for(slow =0;fast<nums.length;fast++) {
	        	if(sum<target) {
	        		sum = sum+nums[fast];
	        		length++;
	        		if(sum>=target) {
	        			fast=0;
	        		}
	        	}
	        	else {
	        		if(output>length) {
	        			output = length;
	        			}	        		
	        		sum =0;
	        		length =0;
	        		slow++;
	        		fast =slow-1;
	        	}
	        }
	        return output;
	    }
	 public static void main(String[] args) {
		 int target11 = 7;
		 int[] temp = {2,3,1,2,4,3};
		 int result = minSubArrayLen(target11,temp);
		 System.out.print(result);
	 }
}
