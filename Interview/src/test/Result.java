package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 2 6 3 4 5
 */
public class Result {



        /*
         * Complete the 'waitingTime' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY tickets
         *  2. INTEGER p
         */

        public static long waitingTime(List<Integer> tickets, int p) {
            // Write your code here

            int length = tickets.size()-1;
            int time=0;
            int target= tickets.get(p);
            int [] ll =new int [tickets.size()];
            List<Integer> list = new ArrayList<>();

            while (target!=0) {

                for (int i = 0; i < tickets.size(); i++) {
                    int tmp = tickets.get(i);
                    if (tmp > 0&&length>=0) {
                       
                        tmp = tmp - 1;
                        ll[length]=tmp;
                        length--;
                        time++;

                    } else {
                        time++;
                        continue;
                    }
                }
                target--;
                for(int j:ll){
                    System.out.println(j);
                    list.add(j);
                }
                tickets=list;

            }

           // int tmp=tickets.get(target);
            return time;


        }

    public static void main(String[] args) {
       List<Integer> ll =new ArrayList<>();
        ll.add(2);
        ll.add(6);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        int target = 2;

        long l = waitingTime(ll, target);

        System.out.println(l);
    }


}
