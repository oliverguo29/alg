public class _24SwapNodesinPairs {

        public ListNode swapPairs(ListNode head) {
            if(head==null||head.next==null){
                return head;
            }

            ListNode dummy =new ListNode(-1);
            dummy.next=head;

            ListNode pre=dummy;
            ListNode cur=head;

            while (cur!=null&&cur.next!=null){
                ListNode Next=cur.next.next;    //保存3->4
                cur.next.next=cur;
                pre.next=cur.next;
                cur.next=Next;


                pre=cur;
                cur=Next;
            }
            return dummy.next;
        }

}
