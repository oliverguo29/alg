public class _725SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode root, int k) {

        int sum=0;
        ListNode cur =root;

        while (cur!=null){
            sum++;
            cur=cur.next;
        }

        int mod=sum%k;
        int size=sum/k;

        ListNode[] res=new ListNode[k];

        cur=root;
        for(int i=0;cur!=null&&i<k;i++){
            res[i]=cur;
            int curSize=size+(mod-->0?1:0);
            for(int j=0;j<curSize-1;j++){
                cur=cur.next;
            }
            ListNode next=cur.next;
            cur.next=null;
            cur=next;
        }
        return res;
    }
}
