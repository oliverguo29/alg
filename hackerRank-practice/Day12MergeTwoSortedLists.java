// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Day12MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    		
    		ListNode dummy = new ListNode(0);
    		ListNode head = dummy;
    		
    		
    		while(head!=null) {
    			if(l1==null||l2==null) {
    				break;
    			}
    			
    			if(l1.val<=l2.val) {
    				head.next=l1;
    				l1=l1.next;
    				head=head.next;
    			}else {
    				head.next=l2;
    				l2=l2.next;
    				head=head.next;
    				
    			}	
    		}
    		
    		if(l1==null) {
    			head.next=l2;
    		}
    		if(l2==null) {
    			head.next=l1;
    		}
    	    return dummy.next;  	
    	
    	
    }
    
    public static void main(String[] args) {
    	ListNode l1=new ListNode(1);
    	
    	ListNode l2=new ListNode(0);
    	ListNode mergeTwoLists = mergeTwoLists(l1,l2);
    	//System.out.println(mergeTwoLists.val);
	}
}