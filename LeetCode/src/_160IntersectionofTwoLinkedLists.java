import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class _160IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode lla = new ListNode(0);
        ListNode llb = new ListNode(0);

        lla = headA;
        llb = headB;

        int l1 = getSize(lla);
        int l2 = getSize(llb);

        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
                lla=lla.next;
            }
        }

        if(l2>l1){
            for(int i=0;i<l2-l1;i++){
                llb=llb.next;
            }
        }

        while (lla!=null&&llb!=null){
            if(lla.equals(llb)){
                return lla;
            }
            lla=lla.next;
            llb=llb.next;
        }



        return null;
    }


    public int  getSize(ListNode node) {
        int count=0;

        while (node!=null){
            count++;
            node=node.next;
        }

        return count;

    }

}