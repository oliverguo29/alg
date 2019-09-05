import java.util.Scanner;

/**
 * 1、空字符串是完整的。
 * 2、如果s是完整的字符串，那么(s)也是完整的。
 * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
 * 例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
 */
public class AIQiYi_Pair {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //count计数多出来的"("，n计数字符串最前面的")"
        int count = 0, n=0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }
            if(str.charAt(i) == ')') {
                if(count == 0){
                    n++;
                }else{
                    count--;
                }
            }
        }
        System.out.println(count+n);

    }
}
