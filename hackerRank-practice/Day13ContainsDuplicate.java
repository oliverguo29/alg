import java.util.HashSet;
import java.util.Set;

public class Day13ContainsDuplicate {
	   public boolean containsDuplicate(int[] nums) {
	        
		   Set<Integer> ss = new HashSet<>();
		   for(int i:nums) {
			   ss.add(i);
		   }
		   
		   return nums.length>ss.size()?true:false;
	    }
}
