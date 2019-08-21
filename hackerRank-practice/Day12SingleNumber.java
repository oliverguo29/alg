import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Day12SingleNumber {
    public int singleNumber(int[] nums) {
     /*   Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i:nums) {
    		if(!map.containsKey(i)) {
    			map.put(i, 1);
    		}else {
    			map.put(i,map.get(i)+1);
    		}
    	}
    	
    	int res=0;
    	
    	Set<Entry<Integer, Integer>> entrySet = map.entrySet();
    	Iterator<Entry<Integer, Integer>> it = entrySet.iterator();
    	while(it.hasNext()) {
    		Entry<Integer, Integer> next = it.next();
    		if(next.getValue()==1) {
    			res=next.getKey();
    		}
    	}*/
    	//方法2比特的异或XOR
    	int res = 0;
    	for(int i:nums) {
    		res ^=i;
    		
    	}
    	return res;
    }
}
