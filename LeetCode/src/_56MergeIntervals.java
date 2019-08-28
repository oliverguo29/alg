import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class _56MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<int []> res  = new ArrayList<>();

        int[]prev = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};

        for(int [] ints:intervals){
            if(ints[0]<=prev[1]){            //overlapping
                if(ints[1]>prev[1]){
                    prev[1]=ints[1];

                }
            }else {
                res.add(ints);
                prev=ints;
            }
        }


        return res.toArray(new int[res.size()][]);
    }
}