import java.util.ArrayDeque;
import java.util.Deque;

class _394DecodeString {

    /**
     *
     * 1.如果遇到数字，看这个数字到底是多大
     * 2.如果遇到"["，将之前的数字存入数字栈，字符存入字符栈，数字清0，字符清0
     * 3.如果遇到"]"，将数字栈的内容弹出，将字符内容重复放入一个sb，取出字符栈中的内容，合并字符串
     * 4.如果遇到字符，继续添加字符
     *
     */
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder("");
        int cur_number=0;
        Deque<Integer> num_stack = new ArrayDeque<>();
        Deque<StringBuilder> letter_stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c>='0'&&c<='9'){             //是数字
                cur_number=cur_number*10;   //看这个数字到底是多大
                cur_number+=(c-'0');
            }else if(c=='['){
                num_stack.push(cur_number);
                letter_stack.push(sb);
                sb=new StringBuilder();
                cur_number=0;
            }else if(c==']'){
                int times = num_stack.pop();
                StringBuilder tmp = new StringBuilder();
                for(int j=0;j<times;j++){    //放入多少次
                    tmp.append(sb.toString());
                }
                sb = letter_stack.pop();
                sb.append(tmp.toString());
            }else{
                sb.append(c);
            }
        }


        return  sb.toString();
    }
}