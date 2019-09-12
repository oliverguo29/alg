package mianshijindian;

import java.util.*;

/**
 * 对链表重新排列，将所有小于x的节点放在前边，大于等于的放在后边
 *
 * 解题思路：
 * 1。 遍历链表，小于的放ss中，大的放bb中
 * 2。 遍历small到最后，把big.next链接到small后
 */
public class _11_Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode curr = pHead;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode ss=small;
        ListNode bb=big;

        while (curr!=null){
            if(curr.val<x){
                ss.next=new ListNode(curr.val);
                ss=ss.next;
            }else {
                bb.next=new ListNode(curr.val);
                bb=bb.next;
            }
            curr=curr.next;
        }

            curr=small;

        while(curr.next != null ){
            curr = curr.next;
        }
        curr.next = big.next;
        return small.next;







    }
}
