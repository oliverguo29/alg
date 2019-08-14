import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class _155MinStack {

    List<Integer> ll;
    PriorityQueue<Integer> pq;

    /** initialize your data structure here. */
    public _155MinStack() {
        this.ll= new ArrayList<>();

        this.pq=new PriorityQueue<>();
    }

    public void push(int x) {
        pq.add(x);
        ll.add(x);

    }

    public void pop() {
        Integer i = ll.remove(ll.size() - 1);

        pq.remove(i);
    }

    public int top() {

            return ll.get(ll.size()-1);
    }

    public int getMin() {

            return pq.peek();



    }
}

/**
 * Your _155MinStack object will be instantiated and called as such:
 * _155MinStack obj = new _155MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */