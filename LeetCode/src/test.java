import java.util.List;

public class test {

    public static void main(String[] args) {
       Solution s =new Solution();
        String ss="2";


        List<String> strings = s.letterCombinations(ss);
        for(String sss:strings){
            System.out.print(sss+"  ");
        }

    }
}
