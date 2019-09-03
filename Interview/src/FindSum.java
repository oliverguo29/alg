import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindSum {
    //-1 2 ，-2,3,0,1,5
    /**
     * 输入一组数，
     * 求这个数组里两两组合，如a,b，求a+b=0；这样的数对有多少个，（a,b）和（b,a）算一个
     */

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        String ss = s.nextLine();

        ss.replace(" ","");     //替换空格
        String[] split = ss.split(",");    //去掉逗号

        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<split.length;i++){
            int  num = Integer.valueOf(split[i]);
            ll.add(num);
        }

        long res = find(ll);

        System.out.println(res);


    }

    public static  long find(List<Integer> ll){
        Collections.sort(ll);
        int i=0;
        int j=ll.size()-1;
        int sum=0;


        while (i<j){
            if(ll.get(i)+ll.get(j)==0){
                i++;
                j--;
                sum++;
            }else {
                j--;
            }
        }
        return sum;
    }

}
