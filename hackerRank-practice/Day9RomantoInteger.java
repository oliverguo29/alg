import java.util.HashMap;
import java.util.Map;


public class Day9RomantoInteger {
	 public static int romanToInt(String s) {
	        Map<Character,Integer> map= new HashMap<Character,Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        
	        char[] charArray = s.toCharArray();
	      
	        int sum=0;
	        int prev=0;
	        int now=0;
	        for(int i=charArray.length-1;i>=0;i--) {
	        	now=map.get(charArray[i]);
	        	if(now<prev){
	        		sum-=now;
	        		
	        	}else {
	        		
	        		sum+=now;
	        		
	        	}
	        	prev=now;
	        	
	        }
  
		 return sum;
	    }
	 
	 
	 
	 public static void main(String[] args) {

		 String s="MCDLXXVI";
		 System.out.println(romanToInt(s));
	 }
}
