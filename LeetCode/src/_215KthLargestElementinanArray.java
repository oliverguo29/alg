import java.util.Arrays;

class _215KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int length=nums.length-1;
        for(int i=0;i<k;i++){
               result= nums[length--];
        }

        return  result;
    }
}