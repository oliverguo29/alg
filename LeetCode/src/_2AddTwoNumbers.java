
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
class _2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1, p2, p;

        int carry=0;            //判断是否有进位

        p1=l1;
        p2=l2;
        ListNode dummy=new ListNode(0);     //确保每次一样
        p=dummy;

        while(p1!=null||p2!=null){
            int v1=p1!=null?p1.val:0;
            int v2=p2!=null?p2.val:0;

            int sum=(v1+v2+carry);
            carry=sum/10;

            p.next=new ListNode(sum%10);
            p=p.next;

            if(p1!=null){
                p1=p1.next;
            }
            if(p2!=null){
                p2=p2.next;
            }
        }
        if(carry>0){                    //最后一次判断进位
            p.next=new ListNode(carry);
        }

        return dummy.next;

    }
}