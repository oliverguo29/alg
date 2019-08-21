import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class D1DesignerPDFViewer{

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        char[] letters = word.toCharArray();
        Map<Character,Integer> map =new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);


        int max;
        int result;
        if(letters.length>1){
             max=h[map.get(letters[0])-1];
            for(int i=1;i<letters.length;i++){
                int tmp=h[map.get(letters[i])-1];
                if(tmp>max){
                    max=tmp;
                }
            }

            result=max*letters.length;

            return result;
        }else if(letters.length==1){
            max=map.get(h[0]);
            result=max*letters.length;
            return result;
        }else{
            return 0;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String sss="1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7";
        String[] hItems =sss.split(" ");


        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = "zaba";

        int result = designerPdfViewer(h, word);

        System.out.println(result);
    }
}
