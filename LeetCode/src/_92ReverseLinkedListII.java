import java.util.Stack;

public class _92ReverseLinkedListII {
    public static  ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;//链表问题可以先创建一个头结点
        ListNode pre = dummy;

        for(int i = 0; i < m - 1; i++) {
            pre = pre.next;//移动m-1次
        }
        ListNode cur = pre.next;
        ListNode next = cur.next;

        for(int i = 0; i < n - m; i++) {//需要将start后面的n-m个点陆续反转 两两交换
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = cur.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        head.next=p1;
        p1.next=p2;
        p2.next=p3;

        ListNode listNode = reverseBetween(head, 2, 4);

        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }


    }
}
