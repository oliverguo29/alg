import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class D1TimeConversion {

    /*
     * Complete the timeConversion function below.
     */

    static String getSecond(String second){
        StringBuffer sBuffer = new StringBuffer();
        String regex = "\\d";                       // \d 数字：[0-9]
        Pattern pattern = Pattern.compile(regex);   //注册匹配格式
        Matcher matcher = pattern.matcher(second);     //2、调用匹配 目标字符串
        while (matcher.find()) {
            sBuffer.append(matcher.group());
        }

        return sBuffer.toString();
    }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] strings = s.split(":");
        String m_time;


        int hour =  Integer.parseInt(strings[0])+12;    //get hour

        if(s.contains("PM")){
            if(hour==24){
                m_time="12"+":"+strings[1]+":"+getSecond(strings[2]);
                return m_time;
            }else {
                m_time = hour + ":" + strings[1] + ":" + getSecond(strings[2]);
                return m_time;
            }
        }else{
            if(hour==24){
                m_time="00"+":"+strings[1]+":"+getSecond(strings[2]);
                return m_time;
            }else {
                m_time = strings[0] + ":" + strings[1] + ":" + getSecond(strings[2]);
                return m_time;
            }
        }


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
