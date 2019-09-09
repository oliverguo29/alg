package jianzhioffer;


import java.util.ArrayList;
import java.util.Stack;

class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
 }

/**
 * 从尾到头打印链表
 *  输入：1-》2-》3
 *  输出：3-》2-》1
 *
 *  使用栈结构解决
 */

public class _6_printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> ss = new Stack<>();
        while (listNode!=null){
            ss.push(listNode.val);
            listNode=listNode.next;
        }

        ArrayList<Integer> al = new ArrayList<>();
        while (!ss.empty()){
            al.add(ss.pop());
        }
        return al;
    }
}