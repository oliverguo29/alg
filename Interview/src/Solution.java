import java.util.*;

public class Solution {

    public  static  String info(int num){
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"A");map.put(2,"B");map.put(3,"C");map.put(4,"D");map.put(5,"E");map.put(6,"F");
        map.put(7,"G");map.put(8,"H");map.put(9,"I");map.put(10,"J");map.put(11,"K");map.put(12,"L");
        map.put(13,"M");map.put(14,"N");map.put(15,"O");map.put(16,"P");map.put(17,"Q");map.put(18,"R");
        map.put(19,"S");map.put(20,"T");map.put(21,"U");map.put(22,"V");map.put(23,"W");map.put(24,"X");
        map.put(25,"Y");map.put(26,"Z");




        return map.get(num);

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ss = sc.next();
        sc.close();


        List decode = decode(ss);
        Collections.sort(decode);
        for(int i=0;i<decode.size();i++){
            System.out.println(decode.get(i));
        }



    }

    public static  List<String> decode(String ss){


        List<String> ll = new ArrayList<>();
        if(ss.length()==0||ss.charAt(0)==0){
            return ll;
        }

        int len= ss.length();
        int [] arr = new int [len+1];

        arr[0]=1;
        arr[1]=ss.charAt(0)=='0'?0:1;


        for(int i=2;i<=len;i++){
            int one = Integer.valueOf(ss.substring(i-1,i));         //1位数
            int two = Integer.valueOf(ss.substring(i-2,i));         //2位数
            if(one>=1){

                arr[i]+=arr[i-1];
                int head=ss.charAt(0)-'0';
                String info1 = info(head);
                String info2 = info(one);
                String in=info1+info2;
                ll.add(in);

            }
            if(two>=10&&two<=26){
                arr[i]+=arr[i-2];
                String info = info(two);
                ll.add(info);
            }
        }

        return ll;
    }
}
