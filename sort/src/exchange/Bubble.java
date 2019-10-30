package exchange;

public class Bubble {
//给定数组【2 1 7 9 5 8】从左到右 从小到大排序
    public  static void BubbleSort(int [] arr){
        int tmp;
        boolean hasChange=true;
        for(int i=0;i<arr.length&&hasChange;i++){
            hasChange=false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    hasChange=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = new int[]{2,1,7,9,5,8};
        BubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }


}
