class _5LongestPalindromicSubstring {
    String res="";
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        for(int i=0;i<s.length();i++){
           helper(s,i,i);
           helper(s,i,i+1);
        }
        return res;
    }

    public void helper(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String cur=s.substring(left + 1, right);        //当前的子串

        if(res.length()<cur.length()) {
            res = cur;
        }



    }
}