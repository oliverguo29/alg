package mianshijindian;

import java.util.Stack;

/**
 * 字符串压缩
 *                  "aabcccccaaa"
 *                   返回："a2b1c5a3"
 *
 * 解题思路：
 * 1。将字符串变成chararray
 * 2。挨个遍历，放入栈，tmp赋值为当前的值，计数，
 *  2。1。如果下一个和tmp不同，弹出来，sb拼接
 *  2。2。相同就继续此操作
 * 3。最后比较是否长度缩短，没有就返回原串
 *
 */
public class _5_Zipper {

    public static void main(String[] args) {
        String a = zipString("welcometonowcoderrrrr");
        System.out.println(a);
    }

    public static  String zipString(String iniString) {
        // write code here
        if(iniString==null||iniString==" "){
            return iniString;
        }

        StringBuilder sb = new StringBuilder();
        char[] arr = iniString.toCharArray();
        Stack<Character> ss = new Stack<>();
        int count=1;


        char tmp=arr[0];
        ss.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=tmp&&ss!=null){              //如果不同
                for(int j=0;j<count-1;j++){         //将栈清空
                    ss.pop();
                }
                sb.append(tmp);                     //拼接字符串
                sb.append(count);
                ss.push(arr[i]);                    //将新的字母存入栈
                tmp=arr[i];                         //tmp和count重新赋值
                count=1;
            }else {
                ss.push(arr[i]);
                count++;
            }
        }
        if(ss.size()!=0){                           //看看栈是否清空，没有的话就把栈中内容拼接到字串中
            sb.append(tmp);
            sb.append(count);
        }

        return sb.toString().length()>=iniString.length()?iniString:sb.toString();
    }


}
