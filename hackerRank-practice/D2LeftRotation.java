import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class D2LeftRotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        List<Integer> tmp = new ArrayList();

        for(int c=d;c<a.length;c++){

            tmp.add(a[c]);
        }

        for(int o=0;o<n;o++){
            tmp.add(a[o]);
        }

        int [] b = new int [n];

        for(int i=0;i<a.length;i++){
            b[i]=tmp.get(i);
        }

        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }

        scanner.close();
    }
}
