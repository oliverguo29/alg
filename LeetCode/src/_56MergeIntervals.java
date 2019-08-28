import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class _56MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return new int[0][];                                    //0.如果数据集为空，返回
        }

        Arrays.sort(intervals, new Comparator<int[]>() {            //1.进行排序
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<int []> res  = new ArrayList<>();

        int[] previous = intervals[0];
        for(int [] current:intervals) {
            if(current[0] <= previous[1] ) {                        //2.如果有重叠，重新赋值
                previous[1] = Math.max(current[1],previous[1]);
            }else {

                res.add(previous);                                  //3.没有重叠
                previous = current;
            }
        }
        res.add(previous);                                          //4.添加最后一个数组

        return res.toArray(new int[res.size()][]);
    }
}