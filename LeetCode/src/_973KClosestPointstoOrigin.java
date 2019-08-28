import java.util.Comparator;
import java.util.PriorityQueue;

class _973KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int K) {
        if(points.length<=K){
            return points;
        }

        PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] i, int[] j) {
                return (j[0]*j[0]+j[1]*j[1])-(i[0]*i[0]+i[1]*i[1]); //距离从大到小放入pq中
            }
        });

        for(int [] point:points){
            pq.add(point);
            if(pq.size()>K){                            //把不要的剔除
                pq.poll();
            }
        }


        return  pq.toArray(new int [0][0]);             //pq转换成array
    }



}