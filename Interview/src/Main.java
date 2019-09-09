import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num =Integer.valueOf(sc.nextLine());        //4

        String[] s_arr = sc.nextLine().split(" ");
        int[] rule=new int[num-1];

        for(int i=0;i<s_arr.length;i++){
            rule[i]=Integer.valueOf(s_arr[i]);           //110
        }

        int[] base =new int[]{1,2,3,4};
        int j=0;
        for(int i=1;i<num+1;i++){
            if(j<num){
                base[j]=i;
            }

        }


        boolean sort = sort(base, rule);
        System.out.println(sort);


    }

    public  static void combine(int [] arr){
        Set<int []> set = new HashSet<>();


        }





    public static boolean sort(int arr[],int rule[]){

        int count=-1;
        for(int i:rule){
                count++;
                if(i==1){
                    if(arr[count]<arr[count+1]){
                        //false
                        System.out.println("***");
                        return false;
                    }
                }else if(i==0) {
                    if(arr[count]>arr[count+1]){
                        //false
                        System.out.println("###");
                        return  false;
                    }
                }
            }


        return true;
    }
}
