package jianzhioffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 * 解题思路：
 * 通过最大堆来实现
 * 每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。
 */
public class _31_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input.length==0||input==null){
            return res;
        }

        if(input.length<k||k==0){
            return res;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() { //最小的放peek上
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=0;i<input.length;i++){
            if(pq.size()<k){
                pq.add(input[i]);
            }else {
                if(input[i]<pq.peek()){
                    pq.remove();
                    pq.add(input[i]);
                }
            }
        }
        for(int i=0;i<k;i++){
            Integer poll = pq.poll();
            res.add(poll);
        }

        return res;
    }
}
