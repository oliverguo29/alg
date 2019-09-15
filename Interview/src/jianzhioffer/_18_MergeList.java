package jianzhioffer;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class _18_MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newNode = new ListNode(-1);
        ListNode dummy =newNode;



        while (list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                dummy.next=list1;
                list1=list1.next;
            }else {
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }

        if(list1==null){
            dummy.next=list2;
        }else if(list2==null){
            dummy.next=list1;
        }
        return newNode.next;

    }
}
