public class _5replaceSpace {
    /**
     * 替换空格
     * A B
     *
     * A%20B
     */
    public String replace(StringBuffer str){
        int p1= str.length()-1;
        for(int i=0;i<=p1;i++){
            if(str.charAt(i)==' '){
                str.append("   ");
            }
        }

        int p2=str.length()-1;
        while (p1>=0&&p2>p1){                       //str新增了多个空格
            char c = str.charAt(p1--);
            if(c==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');        //替换空格
                str.setCharAt(p2--,'%');
            }else {
                str.setCharAt(p2--,c);              //替换c
            }
        }
        return str.toString();
    }
}
