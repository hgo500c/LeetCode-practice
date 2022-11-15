package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	 List<List<Integer>> output =new LinkedList<List<Integer>>();
	 int start = 0;
	 Arrays.sort(candidates);
	 getlist(new ArrayList<Integer>(),output,start,target,candidates);
        return output;
        
    }
public static void  getlist(ArrayList<Integer> temp,List<List<Integer>> output,int start,int target, int[]candidates) {
if(target==0) {
	output.add(new ArrayList<>(temp));
}
else if(target<0) {
	return;
}else {
for(int i = start;i<candidates.length;i++) {
	temp.add(candidates[i]);
	getlist(temp,output,i,target - candidates[i],candidates);
	temp.remove(temp.size()-1);
}
}
}
