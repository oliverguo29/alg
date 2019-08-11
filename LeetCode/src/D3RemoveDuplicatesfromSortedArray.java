import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class D3RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int [] nums = new int[]{-3,-1,0,0,0,3,3};
        int i = removeDuplicates(nums);
        for(int k=0;k<i;k++){
            System.out.println(nums[k]);
        }

    }
    public static  int removeDuplicates(int[] nums) {

        Set<Integer> ss = new HashSet<>();

        for(int i:nums){
            ss.add(i);

        }

        int [] tmp= new int[ss.size()];
        int i=0;

        Iterator<Integer> it = ss.iterator();
        while(it.hasNext()){

            int t=(Integer)it.next();

            nums[i]=t;
            i++;
        }
        int ttt;
       for(int j=0;j<ss.size();j++){
           for(int k=j;k<ss.size();k++){
               if(nums[j]>nums[k]){
                   ttt=nums[k];
                   nums[k]=nums[j];
                   nums[j]=ttt;
               }
           }
       }

//       for(int k:nums){
//            System.out.println(k);
//        }

        return ss.size();
    }
}