import java.util.Stack;

public class Day9ValidParentheses {
	 public boolean isValid(String s) {
	        char[] arr = s.toCharArray();
	        Stack<Character> ss= new Stack<Character>();
		 
	        for(int i=0;i<arr.length;i++) {
				if(arr[i]=='['||arr[i]=='('||arr[i]=='{') {		//头符号
				
					ss.push(arr[i]);
				}else if(arr[i]==']'||arr[i]==')'||arr[i]=='}') {
					if(ss.isEmpty()) {
						
						return false;
					}else {
						Character pop = ss.pop();
						if(pop=='['&&arr[i]!=']'||pop=='('&&arr[i]!=')'||pop=='{'&&arr[i]!='}') {
							
							return false;
						}
					}
				}
				
			}
			
			if(ss.isEmpty()) {
				return true;
			}else {
				
				for(int j=0;j<=ss.size();j++) {
					ss.pop();
				}
				return false;
			}
		
	    }
}
