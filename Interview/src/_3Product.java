import java.util.*;

/**
 * 最大的三个数的乘积为
 * 1。最大的三个数
 * 2。最小的两个数和1个最大的数
 */
import java.util.*;
public class _3Product {
    public static void main(String [] args){


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        getMax(arr, n);
    }

    public  static  void getMax(long [] arr , int length){
        long max1=0;  long max2=0; long max3=0;
        long min1=0;  long min2=0;

        for(int i=0;i<length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }else if(arr[i]>max3){
                max3=arr[i];
            }else if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if(arr[i]>min1&&arr[i]<=min2){
                min2=arr[i];
            }
        }
        long result= Math.max(max1*max2*max3,max1*min1*min2);
        System.out.println(result);
    }

}
