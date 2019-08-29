class _91DecodeWays {
    /**
     * eg:1234
     * 递归：2种: 1; 12
     * dp
     *
     */
    public int numDecodings(String s) {
        if(s.length()==0||s.charAt(0)==0){
            return 0;                               //如果以0开头，没有解码方式
        }

        int [] dp = new int[s.length()+1];          //长度为n+1,包括0
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;

        for(int i=2;i<=s.length();i++){
            int oneDigit= Integer.valueOf(s.substring(i-1,i));
            int twoDigit= Integer.valueOf(s.substring(i-2,i));
            if(oneDigit>=1){
                dp[i]+=dp[i-1];
            }
            if(twoDigit>=10&&twoDigit<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];
    }

}

/*
    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;
        }

        return  helper(s.toCharArray(), 0);
    }
    private  int helper(char[] s,int index){

        if(index==s.length){
            return 1;
        }

        int ways=0;

        if(s[index]!='0'){    //情况1
            ways += helper(s, index + 1);
        }

        if(validEncoding(s,index)){
            ways+=helper(s,index+2);
        }


        return ways;
    }

    private boolean validEncoding(char[] arr, int start){
        if(start+1>=arr.length){
            return false;
        }
        if(arr[start]=='1'){
            return true;
        }
        if(arr[start]=='2'&&arr[start+1]-'6'<=0){
            return true;
        }

        return false;
    }
    */
