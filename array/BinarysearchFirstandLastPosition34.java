package array;

public class BinarysearchFirstandLastPosition34 {
	public int[] searchRange(int[] nums, int target) {
		int[] temp = new int[2];
		int leftr = -1;
		int rightr = -1;
		leftr = findfirst(nums, target);
		rightr = findlast(nums, target);
		temp[1]=leftr;
		temp[2]=rightr;
		return temp;
		
		}
		
	
	private int findfirst (int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int ist = -1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]>=target)right=mid-1;
			else left = mid+1;
			if(nums[mid]==target)ist=mid;
		}
		return ist;
}
	private int findlast (int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int ist = -1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]<=target)left=mid+1;
			else right = mid -1;
			if(nums[mid]==target)ist=mid;
		}
		return ist;
}
}
