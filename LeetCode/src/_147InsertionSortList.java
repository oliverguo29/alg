class _147InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);

        while (head!=null){
            ListNode cur = dummy;
            while (cur.next!=null&&cur.next.val<head.val){
                cur=cur.next;
            }
            ListNode tmp = cur.next;
            cur.next=head;
            head=head.next;
            cur.next.next=tmp;
        }
        return dummy.next;
    }
}