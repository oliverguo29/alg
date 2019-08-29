class _560SubarraySumEqualsK {
    /**
     *
     * 1. Brute Force o(n^3)    超时
     * 2. prefixsum o(n^2)
     * 寻找子串之和为k
     *
     *
     */
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int prefixsum=0;
            for(int j=i;j<nums.length;j++){
                prefixsum+=nums[j];     //每次加入进来时，更新prefixsum
                if(prefixsum==k){
                    count++;
                }
            }
        }
        return count;
    }



}








/*public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int sum=0;
                for(int h=i;h<j;h++){
                    sum+=nums[h];
                }
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
        */