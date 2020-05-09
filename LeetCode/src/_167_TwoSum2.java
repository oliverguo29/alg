class _167_TwoSum2 {
    /**
     * 利用双指针求解
     * 输入: numbers = [2, 7, 11, 15], target = 9
     * 输出: [1,2]
     */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0; int j = numbers.length-1;
        while (i<j){
            if(target == numbers[i] + numbers[j]){
                return new int []{i+1,j+1};
            }else if(target < numbers[i] + numbers[j]){
                j--;
            }else {
                i++;
            }
        }
        return null;
    }
}