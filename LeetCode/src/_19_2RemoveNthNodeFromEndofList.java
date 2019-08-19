public class _19_2RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;


        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;       //长度小于n
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;



        return head;
    }

}
