import java.util.Arrays;

class _88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i=m;
            for(int j=0;j<n;j++){
                nums1[i++]=nums2[j];
            }


        Arrays.sort(nums1);

    }


}