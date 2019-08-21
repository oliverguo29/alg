import java.util.ArrayList;

class Day13MoveZeroes {
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
       
    	
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=0) {
        		al.add(nums[i]);
        	}								//将不为0的存入al
        }
    	
    	int c=nums.length-al.size();		//计算个数个差异即为0的个数
    		
    	for(int j=0;j<c;j++) {				//在al中加入对应的0
    		al.add(0);
    	}
    	
    	
    	
    	for(int k=0;k<nums.length;k++) {	//将al的内容覆盖到原来的数组
    		nums[k]=al.get(k);
    	}
    	
    	
    }
    
    public static void main(String [] args) {
    	int arr[] = new int [] {0,1,0,3,12};
    	moveZeroes(arr);
    	
    }
}
