package test;

import java.util.Scanner;

public class Xiaomi {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int line=  sc.nextInt();
        int [] water= new int[line+1];
        for(int i=0;i<=line;i++){
            water[i]=sc.nextInt();
        }
        int trap = trap(water);
        System.out.println(trap);
    }

    public static  int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        //隐形的bar
        int max_left=0;
        int max_right=0;

        int sum=0;

        while (left<right){
            if(height[left]<height[right]){
                //比较隐形的bar和实际的left的bar的高度差，将隐形的bar更新成大的
                max_left=Math.max(max_left,height[left]);
                //计算储水量
                sum+=max_left-height[left];
                //指针移动到下一个
                left++;
            }else {
                max_right=Math.max(max_right,height[right]);
                sum+=max_right-height[right];
                right--;
            }
        }

        return sum;

    }

}
