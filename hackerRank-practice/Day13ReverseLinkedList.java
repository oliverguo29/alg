import java.util.Stack;

/*class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }*/

class Day13ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
		Stack<Integer> ss = new Stack<>();
		ListNode dummy=new ListNode(0);
		ListNode res=dummy;
    	
		while(head!=null) {	//下一个不为空
		ss.push(head.val);
    	head=head.next;
		}
		
		while(!ss.isEmpty()) {
			res.next=new ListNode(ss.pop());
			res=res.next;
		}
    	
    	return dummy.next;
        
    }


    public static void main(String [] args) {
    	
    }


}
