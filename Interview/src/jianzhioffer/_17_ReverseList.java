package jianzhioffer;

/**
 * 采用头插法，把头和后边的断开，头接到newlistnode 的next上
 *
 */
public class _17_ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode newListNode = new ListNode(-1);
          while (head!=null){                   //
              ListNode next =head.next;
              head.next=newListNode.next; //null
              newListNode.next=head;
              head=next;


          }
          return newListNode.next;
    }
}


/**
 *
 *
 *
 *         if(head==null||head.next==null){
 *             return  head;
 *         }
 *
 *         ListNode next = head.next;
 *         head.next=null;
 *
 *         ListNode newHead = ReverseList(next);
 *         next.next=head;
 *         return  newHead;
 **/