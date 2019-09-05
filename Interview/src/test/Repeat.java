package test;

import java.util.Scanner;

/**
 * 1010 3 101010 2
 *
 * 101010101010   101010101010
 */
public class Repeat {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = new String();

        ss = s.nextLine();


        String[] sss = ss.split(" ");

        if(sss.length<4){
            return;
        }

        int time1= Integer.valueOf(sss[1]);
        int time2= Integer.valueOf(sss[3]);

        long repeat1 = repeat(sss[0], time1);
        long repeat2 = repeat(sss[2], time2);

        if(repeat1>repeat2){
            System.out.println("Greater");
        }else if(repeat1==repeat2){
            System.out.println("Equal");
        }else {
            System.out.println("Less");
        }


    }

    private static long repeat(String str,int times){
        StringBuilder sb1 = new StringBuilder(str);
        for(int i=1;i<times;i++){
            sb1.append(str);
        }
        Long res = Long.valueOf(sb1.toString());
        return res;
    }

}
