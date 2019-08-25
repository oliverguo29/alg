public class _167TwoSumII_Inputarrayissorted_2 {
    //binary search

    /**
     *
     * 因为有序，可以使用双指针，不用两层循环
     *
     *
     */
        public int[] twoSum(int[] numbers, int target) {

            if(numbers.length==0||numbers==null){
                return null;
            }

            int left=0;
            int right=numbers.length-1;
            int [] result =new int [2];

            while(left<right){
                if(numbers[left]+numbers[right]>target){
                    right--;
                }else if(numbers[left]+numbers[right]==target){
                    result[0]=left;
                    result[1]=right;
                    return result;
                }else {
                    left++;
                }
            }

            return  null;
        }
}
