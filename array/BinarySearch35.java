package array;

public class BinarySearch35 {
	 public int searchInsert(int[] nums, int target) {
		 int right = nums.length-1;
		 int left = 0;
		 int mid  = (right + left)/2;
		 while(right >=left) {
			 mid  = (right + left)/2;
			 if(nums[mid]==target)return mid;
			 if(nums[mid]>target) {
				 right = mid-1;
			 }else {
				 left = mid+1;
			 }
			 
		 }
		if(target>nums[mid])return mid+1;
		else {
			return mid;
		}
	 }
}
