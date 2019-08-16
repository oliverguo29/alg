import java.util.Arrays;

class _163SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int length=nums.length;

        Arrays.sort(nums);

        if (nums.length == 3) {
            return nums[0]+nums[1]+nums[2];
        }

        for(int i=0;i<length-2;i++) {
            int j=i+1;
            int k=length-1;
                if(i>=1) {
                    while (nums[i - 1] == nums[i] && i + 1 < length - 2) {
                        i++;
                    }
                }


            while (j<k){
             int sum=nums[i]+nums[j]+nums[k];
             if(sum==target){

                 return sum;
             }


             if(sum>target){
                 max=Math.min(max,sum);

                 k--;
             }

             if(sum<target){
                 min=Math.max(min,sum);

                 j++;
             }
            }
        }

        if(max==Integer.MAX_VALUE){

            return min;
        }

        if(min==Integer.MIN_VALUE){

            return max;
        }


        return  Math.abs(max-target)<Math.abs(target-min)?max:min;
    }

}