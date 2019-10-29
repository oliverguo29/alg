/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class _206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode tmp1= new ListNode(head.val);
        ListNode tmp2= null;

        while(head.next!=null){
            head=head.next;
            tmp2=new ListNode(head.val);
            tmp2.next=tmp1;
            tmp1=tmp2;
        }
        return tmp2;
    }
}