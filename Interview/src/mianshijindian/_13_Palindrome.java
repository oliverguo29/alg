package mianshijindian;

import java.util.Stack;

/**
 * 请编写一个函数，检查链表是否为回文。
 *
 * 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 *
 * 解题思路：
 * 1。快慢指针
 * 2。快指针跑完，慢指针在中间，把内容都放入栈，随着慢指针到最后，和栈中内容比较
 */
public class _13_Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> tmp= new Stack<>();

        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            tmp.push(slow.val);
            slow=slow.next;
        }

        if(fast!=null){     //如果为奇数，slow 跳过
            slow=slow.next;
        }

        while (slow!=null){
            if(slow.val!=tmp.pop()){
                return false;
            }
            slow=slow.next;
        }

        return  true;
    }
}
