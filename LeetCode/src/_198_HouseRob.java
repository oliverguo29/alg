class _198_HouseRob {
    /**
     * 每隔一户进行偷盗，求最大值
     *
     *
     */
    public static  int rob(int[] nums) {
        int pre1 = 0 , pre2 = 0;

        for(int i = 0; i<nums.length; i++){
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return  pre1;
    }

    public static void main(String[] args) {
        int [] i  = new int[]{1,2,3,1};
        int rob = rob(i);
        System.out.println(i);
    }
}