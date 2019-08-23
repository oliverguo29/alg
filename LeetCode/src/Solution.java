import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length<3||nums==null){
            return res;
        }

        Arrays.sort(nums);


        for(int i=0;i<nums.length-2;i++){

            //记录前一个nums[i]的值，如过相同则跳过此次遍历
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }


            int b =i+1;
            int c= nums.length-1;


            while (b<c){
                int tmp = nums[i]+nums[b]+nums[c];
                if(tmp==0){

                    List<Integer> ll = Arrays.asList(nums[i], nums[b], nums[c]);
                    /**
                     * sum == 0,此三个数为一个解,继续寻找下一个解, j++;k--
                     * sum < 0, 表示nums[j]小了，所以j++
                     * sum > 0, 表示nums[k]大了, 所以k--
                     */
                    if(!res.contains(ll)){
                        res.add(ll);    //防止重复
                    }
                    b++;
                    c--;
                }else if(tmp<0){
                    b++;
                }else{
                    c--;
                }

            }

        }

        return res;
    }
}