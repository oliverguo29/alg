import java.util.Arrays;

public class Day14MissingNumber {
	 public int missingNumber(int[] nums) {
		
	       Arrays.sort(nums);	//排序
	       
	       if(nums[0]!=0) {		//没0显示0
	    	   return 0;
	       }
	       
	       for(int j=0;j<nums.length-1;j++) {
	    	   if(nums[j+1]-nums[j]!=1) {	//找出数组中缺失的值
	    		   return nums[j]+1;
	    	   }
	       }
		 
		 
		 
		 return nums[nums.length-1]+1;	//什么都不缺，显示最后一个词的下一个
	    }
		
	
}
