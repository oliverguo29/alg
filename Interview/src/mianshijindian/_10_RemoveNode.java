package mianshijindian;

/**
 * 删除某个节点
 * 解题思路：
 * 如果当前节点不为空，此节点为下一个节点
 */
public class _10_RemoveNode {
    public boolean removeNode(ListNode pNode) {
        // write code here
        if(pNode==null||pNode.next==null){
            return  false;
        }
        pNode.val=pNode.next.val;
        pNode.next=pNode.next.next;
        return  true;
    }
}
