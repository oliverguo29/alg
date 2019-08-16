import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _17LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> mp = new HashMap();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        List<String> ll =new ArrayList<>();



        char[] cc = digits.toCharArray();
        if(cc.length==0){

            return  ll;
        }



        ll.add("");
        for(char c:cc){
            List<String> nn = new ArrayList<>();
            char[] letters = mp.get(c).toString().toCharArray();
            for(char l:letters){

                for(String res:ll) {
                    nn.add(res+l);
                }
            }
            ll=nn;

        }

        return ll;

    }
}