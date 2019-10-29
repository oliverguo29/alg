import java.util.Stack;

public class __739DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        int n=T.length;
        int [] dist =new int [n];
        Stack<Integer> ss = new Stack<>();

        for(int i=0;i<n;i++){
            while (!ss.isEmpty()&&T[i]>T[ss.peek()]){
                int tmp=ss.pop();       //温度大于栈里存的
                dist[tmp]=i-tmp;
            }
            ss.add(i);
        }
        return dist;

    }

}
