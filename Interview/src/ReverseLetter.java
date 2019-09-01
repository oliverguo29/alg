import java.util.Scanner;

public class ReverseLetter {
    /**
     * 句子反转
     * hello xiao mi
     * mi xiao hello
     */


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1="";
        while (s.hasNext()){
            s1= s.nextLine();
        }
        String revese = revese(s1);
        System.out.println(revese);
        s.close();
    }

    public static  String revese(String s){
       StringBuilder sb = new StringBuilder();
       String[] ss = s.split(" ");
        for(int j=ss.length-1;j>=0;j--){
            sb.append(ss[j]);
        }
        return  sb.toString();

    }
}
