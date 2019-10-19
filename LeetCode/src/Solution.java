import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    /**
     *使用双端队列解题
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int[nums.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<k;j++){
                if(deque.isEmpty()){
                    deque.addLast(res[j]);
                }else {
                    for (int o=0;o<deque.size();o++) {
                        if (res[j] > deque.getLast()) {
                            deque.pollLast();
                        }
                    }
                }
            }
        }



        Object[] objects = deque.toArray();
        for(int i=0;i<objects.length;i++){
            res[i]=(int)objects[i];
        }

        return res;
    }
}