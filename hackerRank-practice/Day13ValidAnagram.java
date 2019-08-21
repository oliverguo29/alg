import java.util.Arrays;

/**
 * 判断两个字符串的长度和组成元素相同，顺序可能不同
 * 或者用hashmap
 * @author guoao
 *
 */
public class Day13ValidAnagram {
	  public boolean isAnagram(String s, String t) {
		      if(s.length()!=t.length()) {
		    	  return false;
		      } 
		      
		      char[] s1 = s.toCharArray();
			  char[] s2 = t.toCharArray();
			  
			  Arrays.sort(s1);
			  Arrays.sort(s2);//排序
			
		
			  
			  return Arrays.equals(s1, s2);
	    }
}
