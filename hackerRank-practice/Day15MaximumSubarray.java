public class Day15MaximumSubarray {
	
	  public static int maxSubArray(int[] nums) {
		  	int sum=0; int maxSum = Integer.MIN_VALUE;
		  	for(int i:nums) {
		  		sum+=i;
		  		if(sum<i) {		//当前数字比之前的和大，就从现在开始算
		  			sum=i;
		  		}
		  		if(sum>maxSum) {
		  			maxSum=sum;
		  		}
		  	}
		  return maxSum;
	    }
}
