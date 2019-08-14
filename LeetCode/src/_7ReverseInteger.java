class _7ReverseInteger {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE||x==0){
            return 0;
        }

        String s= x+"";
        boolean flag =false;    //symbol
        StringBuilder sb = new StringBuilder();
        int res;

        char[] ss = s.toCharArray();

       if(ss[0]=='-'){
           flag=true;
           sb.append('-');
       }


       if(ss[ss.length-1]!='0'){
           sb.append(ss[ss.length-1]);
       }
       for(int i=ss.length-2;i>=0;i--){
            sb.append(ss[i]);
       }

       if(flag==true){
           sb.deleteCharAt(sb.length()-1);
       }

        String s1 = sb.toString();
       try {
            res = Integer.parseInt(s1);
       }catch (NumberFormatException e){
           return 0;
       }



        return  res;
    }
}