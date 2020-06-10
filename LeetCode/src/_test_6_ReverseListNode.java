/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class _test_6_ReverseListNode {
    public int[] reversePrint(ListNode head) {
        //顺序读取listNode， 看有多少节点
        int count = 0;
        ListNode node = head;

        while(node != null){
            count++;
            node = node.next;
        }

        //构建一个数组
        int res [] = new int [count];

        //根据节点计数器逆向放入数据
        for(int i = count-1; i >= 0; i--){
            res[i] = head.val;
            head = head.next;
        }
        return res;
    }
}