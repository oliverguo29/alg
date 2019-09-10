package mianshijindian;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 解题思路：
 * 1。 因为是倒数k个节点
 * 2。 双指针，让f先跑k-1个
 * 3。 如果不为空，s跑，只要f跑到最后，s就跑到倒数k的位置
 *
 *  n-x=y
 *  f先跑x个，s再跑y个
 *
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class _9_LastK {
    public ListNode FindKthToTail(ListNode head,int k) {

        ListNode first=head;
        ListNode second=head;

        if(head==null||k<=0){
            return null;
        }

        for(int i=1;i<k;i++){
            if(first.next!=null){
                first=first.next;       //first 先走k-1个
            }else {
                return null;
            }
        }

        while (first.next!=null){
            first=first.next;
            second=second.next;
        }

        return second;
    }
}