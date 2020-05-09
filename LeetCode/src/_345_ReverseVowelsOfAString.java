import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class _345_ReverseVowelsOfAString {
    /**
     * 反转原音字母
     * 使用双指针求解
     */
    public String reverseVowels(String s) {
        HashSet<Character> letter= new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        //性能好于list
        char [] result = new char [s.length()];

        int i = 0; int j = s.length()-1;

        while (i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!letter.contains(ci)){
                result[i++] = ci;
            }else if(!letter.contains(cj)){
                result[j--] = cj;
            }else {
                result[j--] = ci;
                result[i++] = cj;
            }
        }
        return new String(result);

    }
}