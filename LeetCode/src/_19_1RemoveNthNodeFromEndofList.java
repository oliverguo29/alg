import java.util.ArrayList;
import java.util.List;

class _19_1RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<Integer> ll = new ArrayList<>();
        ListNode p;
        while (head!=null){
            ll.add(head.val);
            head=head.next;
        }

        if(ll.size()>=n){
            ll.remove(ll.size()-n);
        }

        ListNode dummy = new ListNode(0);
        p=dummy;
        for(int i:ll){
            ListNode listNode = new ListNode(i);
            p.next=listNode;
            p=p.next;
        }

        return  dummy.next;
    }
}