import java.util.Arrays;

class _4MedianofTwoSortedArrays {
    /**
     * 找中位数
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        double median=0;

        int [] merge = new int[nums1.length+nums2.length];

        int i=0;
        for(int j:nums1){
            merge[i++]=j;
        }


        for(int j:nums2){
            merge[i++]=j;
        }

        Arrays.sort(merge);

       if((merge.length)%2!=0){
          return merge[merge.length/2];
       }else if(merge.length==2){
            return (merge[0]+merge[1])/2.0;
       }else {

           return  ((merge[merge.length/2]+merge[(merge.length/2)-1]))/2.0;
       }



    }
}