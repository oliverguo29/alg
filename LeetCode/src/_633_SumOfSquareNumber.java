class _633_SumOfSquareNumber {
    /**
     * 输入: 5
     * 输出: True
     * 解释: 1 * 1 + 2 * 2 = 5
     * 双指针求解
     */
    public boolean judgeSquareSum(int c) {
        int i = 0; int j = (int)Math.sqrt(c);
        while (i<j){
            if(c == i*i + (j*j)){
                return true;
            }else if(c < i*i + (j*j) ){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}