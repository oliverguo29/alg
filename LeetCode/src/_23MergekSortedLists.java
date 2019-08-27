import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class _23MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> ll = new ArrayList<>();

        int length= lists.length;
        for(int i=0;i<length;i++){
            ListNode node = lists[i];
            while (node!=null){
                ll.add(node.val);
                node=node.next;
            }
        }

        ListNode res=new ListNode(0);
        ListNode dummy=res;
        Collections.sort(ll);
        for(int i=0;i<ll.size();i++){
            ListNode nn = new ListNode(ll.get(i));
            dummy.next=nn;      //先给next赋值
            dummy=dummy.next;
        }
        return  res.next;

    }
}