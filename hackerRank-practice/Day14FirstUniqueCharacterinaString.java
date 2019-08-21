import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 用有序hashmap： linkedhashmap 找出第一个value=1的key，再去cc里找index，没有return -1
 * @author guoao
 *
 */
public class Day14FirstUniqueCharacterinaString {
	  public int firstUniqChar(String s) {
		  if(s.length()==0) {
			  return -1;
		  }
		  int cc[] = new int[26];
		  
		  for(int i=0;i<s.length();i++) {	//将char变成数字，可能是unicode，有相同的则加1，没有的则为1，和放入hashmap原理相同
			  cc[s.charAt(i)-'a']+=1;
		  }
		  
		  for(int j=0;j<s.length();j++) {	//再次遍历，找出第一个为1的，return.
			  if(cc[s.charAt(j)-'a']==1) {
				  return j;
			  }
		  }
		  
		  
		  
		  return -1;
	  }
	
	
	
	
	
	
	/* public int firstUniqChar(String s) {
    	if(s.length()==0&&s.startsWith("")) {
    		return -1;
    	}
        char[] cc = s.toCharArray();
        Map<Character,Integer> map =new LinkedHashMap<>();	//有序
        for(char c:cc) {
        	if(!map.containsKey(c)) {
        		map.put(c, 1);
        	}else {
        		map.put(c, map.get(c)+1);
        	}
        }
        
        Set<Entry<Character, Integer>> entrySet = map.entrySet();
        
       
        char k =0;
       for(Entry<Character, Integer> e:entrySet) {		
   			if(e.getValue()==1) {
   				k=e.getKey();
   				break;
   			}
       }
       for(int i=0;i<cc.length;i++) {
    	   if(cc[i]==k) {
    		   return i;
    	   }
       }
       
    	
    	return -1;
    }*/
}
