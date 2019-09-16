package jianzhioffer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


/**
 * 实现mini stack
 * 最后一个是最小的
 */
public class _22_MiniStack {
     List<Integer> al=new ArrayList<>();
     PriorityQueue<Integer> pq= new PriorityQueue<>();



    public void push(int node) {
       al.add(node);
       pq.add(node);
    }

    public void pop() {
        Integer num = al.remove(al.size() - 1);
        pq.remove(num);
    }

    public int top() {

        return  al.get(al.size()-1);
    }

    public int min() {

        return pq.peek();
    }
}

