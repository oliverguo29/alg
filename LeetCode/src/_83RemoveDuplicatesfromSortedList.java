/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class _83RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p;
        p=head;
        while (p!=null){
            if(p.next!=null) {
                if (p.val == p.next.val) {
                    ListNode tmp = p.next;
                    p.next=tmp.next;
                }else {
                    p=p.next;
                }
            }else{
                break;
            }
        }



        return head;
    }
}