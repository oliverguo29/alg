package choose;

/**
 * 每次从数组中找出最小的元素的索引，将此值与之前最小的元素替换
 */
public class SimpleSelect {
    public static  void simpleselect(int arr[]){
        int minIndex;
        int tmp;
        for(int i=0;i<arr.length;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            tmp=arr[minIndex];              //换位置，i<minIndex
            arr[minIndex]=arr[i];
            arr[i]=tmp;
            System.out.println(i+"***"+minIndex);
        }
    }


    public static void main(String[] args) {
        int arr [] = new int[]{2,1,7,9,0,8};
        simpleselect(arr);
        for(int i:arr){
            //System.out.println(i);
        }

    }
}
