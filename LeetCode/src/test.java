import java.util.List;

public class test {

    public static void main(String[] args) {
    _658FindKClosestElements s = new _658FindKClosestElements();

       int [] nums = new int[] {0,0,0,1,3,5,6,7,8,8};
       int k=2;
       int x=2;
        List<Integer> closestElements = s.findClosestElements(nums, k, x);

       for(int i:closestElements){
           System.out.println(i);
       }


    }
}
