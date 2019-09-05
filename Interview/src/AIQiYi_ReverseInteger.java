import java.util.*;

public class AIQiYi_ReverseInteger {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = Integer.parseInt(s.nextLine());
            String line = s.nextLine();

            int  [] value = new int[num];

            String[] line_arr = line.split(" ");

            for(int i=0;i<num;i++){
                char[] letter = line_arr[i].toCharArray();
                Arrays.sort(letter);        //从小到大
                Integer number = Integer.valueOf(new String(letter));
                value[i]=number;
            }
            //找出最大的数
            Arrays.sort(value);
            System.out.println(value[value.length-1]);

        }
}
