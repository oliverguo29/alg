import java.util.ArrayList;



 
class Day11AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   ArrayList<Integer> al1= new ArrayList<Integer>();
    	ArrayList<Integer> al2= new ArrayList<Integer>();
    	ArrayList<Integer> res= new ArrayList<Integer>();
    	ListNode ln = new ListNode(0);
    	while(l1!=null) {
    		al1.add(l1.val);
    		l1=l1.next; 
    	}
    	while(l2!=null) {
    		al2.add(l2.val);
    		l2=l2.next; 
    	}
    	int sum=0;
    
    	int in=0;
    	
    	
    	
    	int size=al1.size()>al2.size()?al2.size():al1.size();
    	
    	
    	for(int i=0;i<size;i++) {
    		sum=al1.get(i)+al2.get(i)+in;
    		if(sum==10) {
    			
    			in=1;
    			sum=0;
    			
    		}else if(sum>10){
    			in=1;
    			sum=sum%10;
    		}else{
                in=0;
            }
    		//System.out.println(sum);
    		res.add(sum);
    		
    	}
         
if(al1.size()!=al2.size()) {
    		
    			if(size==al1.size()) {
        			for(int j1=al1.size();j1<al2.size();j1++) {
        				sum=al2.get(j1)+in;
        				if(sum>=10) {
        					in=1;
        					sum=sum%10;
        					res.add(sum);
        
        				}else {
        				res.add(al2.get(j1)+in);
        				in=0;
        				}
        			}
        			if(in!=0) {
        				res.add(in);
        				in=0;
        			}
        			
        		}else {
        			for(int j1=al2.size();j1<al1.size();j1++) {
        				sum=al1.get(j1)+in;
        				if(sum>=10) {
        					in=1;
        					sum=sum%10;
        					res.add(sum);
        
        				}else {
        				res.add(al1.get(j1)+in);
        				in=0;
        				}
        			}if(in!=0) {
        				res.add(in);
        				in=0;
        			}

    		}
    	}else {
    	 	
    		if(in==1) {
	 		res.add(1);
    		in=0;
	 	}
        }
    	
    	ListNode [] ln_arr = new ListNode[res.size()];
    	
    		for(int r=0;r<res.size();r++) {
    		
    		int n = res.get(r);
    		
    		ListNode tmp=new ListNode(n);
    		
    		ln_arr[r]=tmp;
    		
    		
    	}
    	
    	for(int i=0;i<ln_arr.length-1;i++){
			ln_arr[i].next=ln_arr[i+1];
		}
		
    	
    	return ln_arr[0];
}
}