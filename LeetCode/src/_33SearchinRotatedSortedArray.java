import java.util.Arrays;

class _33SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int medium =(end+start)/2;
            if(nums[medium]==target){
                return medium;
            }

            if(nums[medium]>=nums[start]){
                if(target>=nums[start]&&target<nums[medium]){
                    end=medium-1;
                }else{
                    start=medium+1;
                }
            }else{
                if(target>nums[medium]&&target<=nums[end]){
                    start=medium+1;
                }else{
                    end=medium-1;
                }
            }


        }
        return -1;
    }


}