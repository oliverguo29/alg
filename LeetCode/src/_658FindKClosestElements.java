import java.util.ArrayList;
import java.util.List;

/**
 * 定义left 和 right
 *
 */
class _658FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        //if arr==null
        if(arr.length==0){
            return  null;
        }

        int index = binarySearch(arr, x);
        int left=index-1;
        int right=index+1;
        res.add(arr[index]);


        for(int i=0;i<k-1;i++){
            if(left<0){
                res.add(arr[right]);
                right++;
            }else if(right>arr.length-1||arr[right] - x >= x - arr[left]){
                res.add(0,arr[left]);
                left--;
            }else{
                res.add(arr[right]);
                right++;
            }

        }


        return  res;
    }

    //return index
    public    int binarySearch(int [] arr, int target){
        //result
        int result=0;

        //left
        int left=0;
        //right
        int right=arr.length-1;

        //medium


        while(left<right){
            int medium=(left+right)/2;
            if(target>arr[medium]){
                left=medium+1;
            }else if(target==arr[medium]){
                return medium;
            }else {
                right=medium-1;
            }
        }
        //not found
       return  left;

    }
}