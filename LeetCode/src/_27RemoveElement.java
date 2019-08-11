class _27RemoveElement {
    /**
     * 利用count来计数，覆盖原有的数组，最后返回count的长度，已覆盖部分
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }

        return count;
    }
}