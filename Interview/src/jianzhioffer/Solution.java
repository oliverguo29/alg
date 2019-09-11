package jianzhioffer;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return  head;
        }

        ListNode next = head.next;
        head.next=null;

        ListNode newHead = ReverseList(next);
        next.next=head;
        return  newHead;
    }
}


/**
 *  ListNode newListNode = new ListNode(-1);
 *         while (head!=null){
 *             ListNode next =head.next;
 *             head.next=newListNode.next; //null
 *             newListNode.next=head;
 *             head=next;
 *
 *
 *         }
 *         return newListNode.next;
 **/