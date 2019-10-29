public class _21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        if(l1==null) {
            return l2;
        }

        if(l2==null) {
            return l1;
        }

        while(l1!=null && l2!=null) {
            if(l1.val <= l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1!=null) {
            dummy.next = l1;
        }

        if(l2!=null) {
            dummy.next = l2;
        }

        return head.next;
    }

}
