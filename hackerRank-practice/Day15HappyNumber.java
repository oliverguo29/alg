class Day15HappyNumber {
    public static boolean isHappy(int n) {
    	int count=0;
    	
    	if(n==1){
    		return true;
    	}
    	while(n!=1) {
    		count++;
    		n = helper(n);
    		if(n==1) {
    			return true;
    		}else if(count>10){
    			return false;			//用来结束循环
    		}
    	}
    	return false;
    }
    
    
    public static int helper(int n) {
    	
    	String s=n+"";
    	int res=0;
    	char[] arr = s.toCharArray();
    	for(char c:arr) {
    		int i=c-'0';	//char中的数字转换成int的数字
    		res+=Math.pow(i, 2);
    	}    	
    	return res;
    }
    
  
}
