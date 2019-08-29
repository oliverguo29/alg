/**
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * 两个数组，记录从左到右的累乘结果，记录从右到左的累乘结果  res=left*right
 * 特例： 左边的第一个没有累乘，赋予right
 *       右边的第一个没有，赋予left
 *
 */

class _238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int [] left = new int[length];
        int [] right=new int[length];
        int [] res = new int [length];

        left[0]=1;
        right[0]=1;


        for(int i=1;i<nums.length;i++){
            //2(1)-->1; 3(2)-->2; 4(3)-->6
           left[i]=left[i-1]*nums[i-1];     //1 1 2 6
           right[i]=nums[length-i]*right[i-1];// 1 4 12 24
        }

        for(int i=0;i<nums.length;i++){
            res[i]=left[i]*right[length-i-1];
        }



        return res;
    }
}