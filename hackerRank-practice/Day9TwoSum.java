import java.util.HashSet;
import java.util.Set;
/**
 * 更好的办法是用hashmap
 * @author guoao
 *
 */
class Day9TwoSum {
    
	
	
	public static int[] twoSum(int[] nums, int target) {
		
		Set<Integer> set= new HashSet<Integer>();
		
		int diff;
		
		
		for(int k=0;k<nums.length;k++) {
			diff=target-nums[k];
			for(int i=k+1;i<nums.length;i++) {
				if(nums[i]==diff) {			
					set.add(i);
					set.add(k);
				}
			}
		}
		
		int [] res= new int[set.size()];
		
		Object[] array = set.toArray();
		
		for(int i=0;i<array.length;i++) {
			res[i]=(int) array[i];
		}
		
		return  res;
    }
	
	public static void main(String [] args) {
		int [] nums= {3,2,4};
		int target = 6;
		
		
		int[] twoSum = twoSum(nums,target);
		for(int i:twoSum) {
			System.out.println(i);
		}
		
	}
	
	
	
}