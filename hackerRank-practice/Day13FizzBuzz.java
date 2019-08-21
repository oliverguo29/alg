import java.util.ArrayList;
import java.util.List;

class Day13FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        
    	List<String> ll = new ArrayList<>();
    	String res="";
    	
    	for(int i=1;i<=n;i++) {
    		if(i%3==0||i%5==0) {
    			if(i%3==0&&i%5==0) {
    				res="FizzBuzz";
    				ll.add(res);
    			}else if(i%3==0){
    				res="Fizz";
    				ll.add(res);
    			}else {
    				res="Buzz";
    				ll.add(res);
    			}
    		}else {
    		res=i+"";
    		
    		ll.add(res);
    		}
    	}
    	
    	
    	return ll;
    }
    
    public static void main(String[] args) {
		int i=1;
		List<String> fizzBuzz = fizzBuzz(i);
		for(String s:fizzBuzz) {
			System.out.println(s);
		}
	}
}
