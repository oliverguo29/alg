package jianzhioffer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 * 1。存入in
 * 2。pop时存入另一个栈，out--》放出第一个
 */
public class _8_twoStackImplementQueue {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception {
        if(out.isEmpty()){
            if(in.isEmpty()){
                throw new Exception("queue is empty");
            }
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }


        return out.pop();
    }

}
