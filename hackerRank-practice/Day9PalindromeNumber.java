/**
 * 121
 * 倒叙是否相等
 * @author guoao
 *
 */
class Day9PalindromeNumber {
    public static boolean isPalindrome(int x) {
    	String tmp=x+"";
    	char[] charArray = tmp.toCharArray();
    	
    	
    	int j=charArray.length-1;
    	for(int i=0;i<charArray.length;i++) {
    		if(j>=1) {
    			if(charArray[i]!=charArray[j--]) {
    				return false;
    			}
    		}
    		
    	}
    	
    	
    	return true;
    }
    
    
    public static void main(String[] args) {
    	int x=121;
    	boolean palindrome = isPalindrome(x);
    	System.out.println(palindrome);
    	
    	
    	
    	
    }
}
