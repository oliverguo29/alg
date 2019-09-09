package mianshijindian;
/**
 * 原串反转
 *                      "This is nowcoder"
 *                       返回："redocwon si sihT"
 *  双指针，头和尾互换
 */
public class _2_Reverse {

    public  String reverseString(String iniString) {
        // write code here

        char[] arrs = iniString.toCharArray();

        int head=0;
        int tail=arrs.length-1;
        char tmp;

        while (head<=tail){                     //首尾互换

            tmp=arrs[head];
            arrs[head]=arrs[tail];
            arrs[tail]=tmp;
            head++;
            tail--;
        }

        StringBuilder sb =new StringBuilder();  //拼接字符串
        for(char ss:arrs){
            sb.append(ss);
        }
        iniString=sb.toString();                //重新赋值

        return iniString;
    }
}
