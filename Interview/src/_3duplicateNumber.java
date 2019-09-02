import java.util.HashSet;
import java.util.Set;

public class _3duplicateNumber {
    /**
     * 2 3 1 0 2 5
     * 找出数组中任意一个重复的数字
     *
     * 时间复杂度 O（n）
     * 空间复杂度 O（1）
     */

    public static void main(String[] args) {
        int []  arr = new int []{2,3,1,0,2,5};
        boolean flag = findNumber(arr, arr.length, new int[arr.length]);
        System.out.println(flag);
    }

    public static  boolean findNumber(int [] nums, int length , int[] dup){
        if(nums==null||length<=0){
            return false;
        }

        for(int i=0;i<length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    dup[0]=nums[i];
                    return true;
                }
                swap(nums,i,nums[i]);       //将当前位置上的数字移到它的值的位置，比如第一个位置为2，将2移到index为2处
            }
        }


       return false;
    }

    private static  void swap(int [] nums,int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }


}
