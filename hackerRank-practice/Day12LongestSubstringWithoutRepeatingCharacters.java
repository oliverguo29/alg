import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class Day12LongestSubstringWithoutRepeatingCharacters {
    
	
	//找最长子串，通过滑动窗口解决
	public static int lengthOfLongestSubstring(String s) {
			int n=s.length();
			int i=0;	//窗口头
			int j=0;	//窗口尾
			int res=0;
			Set<Character> ss = new HashSet<Character>();
			
			
			while(i<n&&j<n) {
				
				if(!ss.contains(s.charAt(j))) {
					ss.add(s.charAt(j++));			//先添加，在++,解决0的问题
					res=Math.max(res, j-i);
				}else {
					ss.remove(s.charAt(i++));
					
				}
			}
		   
	        return res;
		    }
    
	
	
	
	public static void main(String [] args) {
		String s= "pwwkew";
		String s1="abcabcbb";
		int res = lengthOfLongestSubstring("dvdf");
		System.out.println(res);
		
		
	}
}
