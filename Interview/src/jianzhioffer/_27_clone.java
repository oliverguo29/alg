package jianzhioffer;

/**
 * 复制复杂的链表
 * 1。在每个节点后插入一个一样的
 * 2。建立random连接
 * 3。拆分
 */
 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class _27_clone {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null){
            return pHead;
        }
        //1。复制
        RandomListNode cur = pHead;
        while (cur!=null){
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next=cur.next;
            cur.next=clone;
            cur=clone.next;
        }

        //2. 连接random
        cur=pHead;
        while (cur!=null){
            RandomListNode clone =cur.next;
            if(cur.random!=null){
                clone.random=cur.random.next;
            }
            cur=clone.next;
        }

        //3.拆分
        cur=pHead;
        RandomListNode pCloneHead = pHead.next;

        while (cur.next!=null){
            RandomListNode clone = cur.next;
            cur.next=clone.next;
            cur=clone;
        }

        return pCloneHead;

    }
}
