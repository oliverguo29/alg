class _344ReverseString {
    public void reverseString(char[] s) {
        //hello
        if(s.length==0||s==null){
            return;
        }

        int left=0;
        int right=s.length-1;
        while (left<right) {
            sort(s,left,right);
            left++;
            right--;
        }





    }

    public  void sort(char[] s,int left,int right){
        char tmp;

        tmp=s[left];
        s[left]=s[right];
        s[right]=tmp;


    }
}