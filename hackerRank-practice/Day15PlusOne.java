import java.util.Arrays;

public class Day15PlusOne {
	 public static int[] plusOne(int[] digits) {
		 
		 if(digits==null||digits.length<1) {
			 return new int[1];
		 }
		 
		 for(int i=digits.length-1;i>=0;i--) {
			 if(digits[i]<9) {
				 digits[i]=digits[i]+1;
				 break;						//因为break了,只会检查最后一位
			 }else if(digits[i]==9){		//最后一位为9，会自动向前检查
				 digits[i]=0;
				 if(i==0) {
					 digits[i]=1;
					 digits=Arrays.copyOf(digits,digits.length+1);		//copy完要再次赋值
				 }
			 }
		 }
		 
		 
		 
		 return digits;
	    }
	 
	 
	 public static void main(String[] args) {
		int [] s=new int[] {1,2,3};
		plusOne(s);
	}
}
