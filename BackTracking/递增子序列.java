package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ���������� {
	LinkedList<Integer> paths = new LinkedList<>();
	ArrayList<List<Integer>>res = new ArrayList<>();
	  public List<List<Integer>> findSubsequences(int[] nums) {
	        back(nums,0);
	        return res;
	    }
	  private void back(int[]nums, int start) {
		  if(paths.size()>1) {
			  res.add(new ArrayList<>(paths));
		  }
		  int[] used = new int[201]; // ����ʹ������������ȥ�ز�������Ŀ˵��ֵ��Χ[-100, 100]
		  for(int i = start;i<nums.length;i++) {
			  if((paths.size()!=0&&nums[i]<paths.get(paths.size()-1))||(used[nums[i] + 100] == 1)) {
				continue;
			  }
			  else {
				  used[nums[i] + 100] = 1;
				  paths.add(nums[i]);
				  back(nums,i+1);
				  paths.removeLast();
			  }
		  }
	  }
	}

