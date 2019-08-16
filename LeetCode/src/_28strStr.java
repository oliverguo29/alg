class _28strStr {
    /**
     *
     * 情况1：needle大于haystack
     * 情况2：完全一样 返回0
     *
     */

    public int strStr(String haystack, String needle) {     //防止数组越界
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }


        return haystack.equals(needle)?0:-1;
    }


    }
