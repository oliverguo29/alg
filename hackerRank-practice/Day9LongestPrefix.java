public class Day9LongestPrefix {
	 public static String longestCommonPrefix(String[] strs) {
	       String prefix=" ";
	        if(strs.length!=0) {
	         prefix=strs[0];							//以第一个单词为前缀
	        for(int i=0;i<strs.length;i++) {			//和每个单词比较
	        	while(!strs[i].startsWith(prefix)) {	//当有单词和前缀不完全符合时，第一个单词长度-1
	        		prefix=prefix.substring(0,prefix.length()-1);
	        		if(prefix.isEmpty()) {
	        			prefix="";
	        		}
	        	}
	        
	        }
	    
	      

		 return prefix;
	    }
			return " ";
	 }
	 
	 
	 public static void main(String [] args) {
		 String [] s=new String[] {};
		 String longestCommonPrefix = longestCommonPrefix(s);
		 System.out.println(longestCommonPrefix);
	 }
}
