import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = Integer.valueOf(sc.nextLine());

        String[] s_arr = sc.nextLine().split(" ");
        int [] arr = new int[s_arr.length];
        for(int i=0;i<s_arr.length;i++){
            arr[i]=Integer.valueOf(s_arr[i]);
        }

        int i = find(arr);
        System.out.println(i);
    }

    public static  int find(int [] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<=arr[i-1]){

                storage(map,arr,i);

            }else {
                for(int j=i-1;i>0;j--){
                    if(arr[i]<=arr[j]){

                        storage(map,arr,j);

                        break;
                    }
                }
            }
        }

        Set<Map.Entry<Integer, Integer>> en = map.entrySet();
        int max=0;
        int res=0;
        for(Map.Entry<Integer, Integer> mm:en){
            if(mm.getValue()>max){
                max=mm.getValue();

                res=mm.getKey();
            }

        }


        return res;
    }


    public static  void storage(Map<Integer,Integer> map,int [] arr,int i){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],1);
        }else {
            int time = map.get(arr[i]);
            map.put(arr[i],time+1);
        }
    }
}
