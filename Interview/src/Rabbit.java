public class Rabbit {

    private int num = 2;// 原始兔子数量2个
    public int sum(int month) {
        if (month == 1 || month == 2) {
            num = 2;
        }
        if (month >= 3) {
            //当月兔子数量=上月兔子数量+本月新增兔子数量，本月新增兔子数量就是三个月前的兔子数量乘以2
            num = sum(month - 1) + sum(month - 3) * 2;
        }
        return num;
    }
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        int num = rabbit.sum(7);
        System.out.println(num);//输出结果为46
    }


}
