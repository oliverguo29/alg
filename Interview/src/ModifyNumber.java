import java.util.Scanner;

public class ModifyNumber {
    /**
     * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
     * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
     * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
     *
     */

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = Integer.parseInt(sc.nextLine());
                for(int i = 0; i < n; i++){
                    StringBuilder sb = new StringBuilder(sc.nextLine());
                    for(int j = 2; j < sb.length(); j++){
                        if(sb.charAt(j) == sb.charAt(j - 1)
                                && sb.charAt(j - 1) == sb.charAt(j - 2)){
                            sb.deleteCharAt(j);
                            j--;
                        }
                        else if(isPattern(sb, j - 3, j)){
                            sb.deleteCharAt(j);
                            j--;
                        }
                    }
                    System.out.println(sb.toString());
                }
            }
            sc.close();
        }
        public static boolean isPattern(StringBuilder sb, int i, int j){
            if(i < 0) return false;
            return sb.charAt(i) == sb.charAt(i + 1) &&
                    sb.charAt(j - 1) == sb.charAt(j);
        }
    }


