import java.util.Arrays;

class _204CountPrimes {
    /**
     * 找质数，除了1和自身不能除别的数字
     * 1.boolean 数组全部赋值为true
     * 2.判断是否是倍数
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        if(n<=0||n==1){
            return 0;
        }
        int count=0;
        boolean[] arr = new boolean[n];

        Arrays.fill(arr,true);

        arr[0]=false;
        arr[1]=false;

        for(int i=2;i<Math.sqrt(n);i++){
            if(arr[i]!=false) {
                for (int j = i; j*i<n; j++) {
                    arr[i*j] = false;
                }
            }
        }

        for(boolean r:arr){
            if(r==true){
                count++;
            }
        }

        return count;
    }


}