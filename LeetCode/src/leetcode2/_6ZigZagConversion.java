package leetcode2;

import java.util.ArrayList;
import java.util.List;

/**
 * z型变换
 * 根据row去建立多个stringBuilder,设置一个flag，决定走向，依次放入
 */
class _6ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s == null || s.length() <= 1 || numRows <= 1){
            return s;
        }

        List<StringBuilder> ll = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            ll.add(new StringBuilder());
        }

        int flag = 1;
        int index = 0;
        for(char c : s.toCharArray()){
            ll.get(index).append(c);
            index += flag;
            if(index == 0 || index == numRows-1) {
                flag = -flag;
            }
        }

        StringBuilder sb = new StringBuilder();
        ll.stream().forEach(v -> sb.append(v));

        return sb.toString();
    }
}