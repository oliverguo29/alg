import java.util.Arrays;

/**
 * 求众数n/2
 * @author guoao
 *
 */
class Day13MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
    	
		return nums[nums.length/2];
    	
    }
}