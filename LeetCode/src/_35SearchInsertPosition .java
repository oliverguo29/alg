import java.util.PriorityQueue;

class _35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }

        pq.add(target);
        int count=0;
        while(pq.size()!=0){
            count++;
            int tmp = pq.poll();
            System.out.println(tmp);
            if(tmp==target) {
                return count-1;
            }
        }
        return 0;
    }
}