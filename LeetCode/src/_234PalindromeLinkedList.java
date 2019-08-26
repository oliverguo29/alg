/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */



/**
 * 链表逆序
 */
class _234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode start =head;
        ListNode end =null;
        int count=0;

        while (head!=null){     //逆序
            ListNode tmp =new ListNode(head.val);
            tmp.next=end;
            end=tmp;
            head=head.next;
            count++;
        }

        int medium=count/2;

        while (medium!=0){
            medium--;
            if(start.val!=end.val){
                return  false;
            }
            start=start.next;
            end=end.next;
        }

        return  true;
    }
}