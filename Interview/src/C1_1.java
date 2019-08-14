public class C1_1 {
    /**
     * Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     */
    
    public static boolean isUnique(String s){
        if(s==null||s==""){
            return false;
        }

        char[] ss = s.toCharArray();

        if(ss.length<2){
            return true;
        }

        for(int c=0;c<ss.length;c++) {
            for (int i = c+1; i < ss.length; i++) {
                if (ss[c] == ss[i]) {
                    System.out.println(ss[c]+""+ss[i]);
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s="abcdeag";
        boolean unique = isUnique(s);
        System.out.println(unique);
    }
    
}
