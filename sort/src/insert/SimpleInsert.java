package insert;

public class SimpleInsert {
    //简单插入  给定数组【2 1 7 9 5 8】从左到右 从小到大排序

    public static void simpleInsert(int [] arr){
       for(int i=1,j,cur;i<arr.length;i++){
            cur = arr[i];
           for(j=i-1;j>=0&&arr[j]>cur;j--){
               arr[j+1]=arr[j];
           }
           arr[j+1]=cur;
       }
    }

    public static void main(String[] args) {
        int arr [] = new int[]{2,1,7,9,5,8};
        simpleInsert(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

}
