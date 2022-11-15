package array;

public class SearchinRotated {
	 public static int search(int[] nums, int target) {
	        int l =0;
	        int h = nums.length-1;
	        int middle = nums.length/2;
	        if(nums.length==0)return -1;
	        if(nums[l]==target)return l;
	        for(int i =0; i<nums.length;i++) {
	        	if(nums[middle]==target)return middle;
	        	else {
	        		if(target>nums[middle]) {
	        			if(target<=nums[h]&&nums[h]>=nums[middle]) {
	        				l = middle +1;
	        				middle= (middle+h)/2;
	        			}else {
	        				h = middle;
	        				middle = middle/2;
	        			}
	        		}else {
	        			if(target<nums[l]&&nums[l]<=nums[middle]) {
	        				l = middle+1;
	        				middle = (middle+h)/2;
	        			}else {
	        				h = middle;
	        				middle = middle/2;
	        			}
	        			
	        		}
	        	}
	        }
	        if(nums[l]==target)return l;
		       else return -1;
	 
	   
	        
	    }
	 public static void main(String[]args) {
		 int a = 7/2;
		 System.out.println(a);
		 int[]a1= {1};
		 int x=0;
		 int ans =search(a1,x);
		 System.out.println(ans);
		 
	 }
}
