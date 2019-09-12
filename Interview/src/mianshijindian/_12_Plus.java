package mianshijindian;

/**
 * 按位相加，考虑进位和长度不同
 */
public class _12_Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a==null||b==null){
            return null;
        }
        ListNode tmp_a =a;
        ListNode tmp_b =b;
        ListNode plus = new ListNode(-1);
        ListNode tmp_plus=plus;

        int flag=0;

        while (tmp_a!=null||tmp_b!=null){
            if(tmp_a==null){
                tmp_plus.next=new ListNode((tmp_b.val+flag)%10);
                flag=(tmp_b.val+flag)/10;
                tmp_plus=tmp_plus.next;
                tmp_b=tmp_b.next;
            }else if(tmp_b==null){
                tmp_plus.next=new ListNode((tmp_a.val+flag)%10);
                tmp_plus=tmp_plus.next;
                flag=(tmp_a.val+flag)/10;
                tmp_a=tmp_a.next;
            }else {
                tmp_plus.next=new ListNode((tmp_a.val+tmp_b.val+flag)%10);
                tmp_plus=tmp_plus.next;
                flag=(tmp_a.val+tmp_b.val+flag)/10; //判断进位
                tmp_a=tmp_a.next;
                tmp_b=tmp_b.next;
            }
        }
        if(flag>0){
            tmp_plus.next=new ListNode(flag);
            tmp_plus=tmp_plus.next;

        }
        return plus.next;
    }
}
