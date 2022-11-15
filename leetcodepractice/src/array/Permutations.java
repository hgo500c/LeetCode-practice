package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
	 public List<List<Integer>> permute(int[] nums) {
		 List<List<Integer>> output = new LinkedList<List<Integer>>();
		  ArrayList<Integer> temp = new ArrayList <Integer>();
		 sort(nums,output,temp,0);
		 return output;
	    }
	 public void sort(int[] nums,List<List<Integer>> output, ArrayList<Integer>temp,int start) {
		 if(temp.size()==nums.length) {
			 output.add(temp);
		 }else {
			
		 for(int i=0;i<nums.length;i++) {
			 if(temp.contains(nums[i])) {
				continue;
			 }
			 temp.add(nums[i]);
			 sort(nums,output,temp,start);
			 temp.remove(temp.size()-1);
		 }
		 }
	 }
	}
