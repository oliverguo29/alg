public class Ball {
    /**
     * 一球从100米高度自由落下，每次落地后反跳回原高度的一半;再落下，求它在第10次落地时，共经过多少米?第10次反弹多高?
     * @param args
     */
    public static void main(String[] args) {

        //次数
        int times=10;
        // 定义触地时经过的米数
        double high = 100;
        // 定义弹回高度
        double m = 50;
        // 这里注意要从第二次开始，因为第一次是直接从100m高处落下，不是反弹到100m再落下
         for(int i=2;i<=times;i++) {
         high = high + m*2;
        m = m/2;
         }
        System.out.println("第十次反弹的高度为："+m);
        System.out.println("一共经过的米数为：" +high);


    }





}
