import java.util.*;

public class _1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int tmp = target-nums[i];
            if(map.containsKey(tmp)){
                return  new int[]{map.get(tmp), i};
            }
            map.put(nums[i],i);
        }
        throw new RuntimeException("no");

    }

}
