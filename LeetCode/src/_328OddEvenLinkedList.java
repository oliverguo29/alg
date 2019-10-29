public class _328OddEvenLinkedList {
    /**
     * 指的节点的索引，而不是其中的数值
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode odd=head;
        ListNode even=head.next;        //偶数
        ListNode evenHead=even;

        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

}
