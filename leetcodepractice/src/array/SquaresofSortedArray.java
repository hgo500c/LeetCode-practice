package array;

import java.util.Arrays;

public class SquaresofSortedArray {
public int[] sortedSquares(int[] nums) {
	 int right = nums.length-1;
	 int left = 0;
	 int[]result= new int[nums.length];
       for(int i=nums.length-1; i>=0;i--) {
       	if(Math.abs(nums[left])>nums[right]) {
       		result[i]=(int) Math.pow(nums[left], 2);
       		left++;
       	}else {
       		result[i]=(int) Math.pow(nums[right], 2);
       		right--;
       	}
       }      
       return result;
   }
}
