import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 转化成3sum
 *
 */
class _18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length<4||nums==null){
            return res;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for( int j = i + 1;j<nums.length-2;j++){
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }

            int k = j+1;
            int l = nums.length - 1;

            while (k < l) {
                int sum = nums[i] + nums[j] + nums[k] + nums[l];
                if (sum == target) {
                    List<Integer> ll = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                   if (!res.contains(ll)) {
                        res.add(ll);
                    }

                    k++;
                    l--;
                }
                else if (sum > target) {
                    l--;

                } else {
                    k++;
                    }

                }
            }
        }

        return  res;
    }
}