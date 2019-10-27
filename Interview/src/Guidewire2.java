import java.util.ArrayList;
import java.util.List;

public class Guidewire2 {

        public static  int solution(int N) {
            // write your code in Java SE 8
            int res=0;
            if(N>0){
                String ss=N+"";
                StringBuilder sb= new StringBuilder();
                int index=0;
                char[] chars = ss.toCharArray();
                for(int i=0;i<chars.length;i++){
                    if(chars[i]-'0'>5){
                       sb.append(chars[i]);
                    }else {
                        sb.append('5');
                        index=i;
                        break;
                    }
                }

              for(int i=index;i<ss.length();i++){
                sb.append(chars[i]);
              }
                res=Integer.valueOf(sb.toString());
            }else if(N<0){
                String ss=N+"";
                StringBuilder sb= new StringBuilder();
                int index=0;
                char[] chars = ss.toCharArray();
                for(int i=0;i<chars.length;i++){
                    if(chars[i]-'0'<5){
                        sb.append(chars[i]);
                    }else {
                        sb.append('5');
                        index=i;
                        break;
                    }
                }

                for(int i=index;i<ss.length();i++){
                    sb.append(chars[i]);
                }
                res=Integer.valueOf(sb.toString());
            }else{
                //n==0
                 res= 50;
            }

            return res;

        }

        public static void main(String[] args) {
            int N=0;
            int solution = solution(N);
            System.out.println(solution);
        }
    }

