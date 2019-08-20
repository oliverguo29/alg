class _58LengthofLastWord {
    public int lengthOfLastWord(String s) {

        String[] ss = s.split(" ");
        if(ss.length<1){
            return 0;
        }
       if(ss[ss.length-1]!=null){
           String res=ss[ss.length-1];

          return  res.toCharArray().length;
       }

        return 0;



    }
}