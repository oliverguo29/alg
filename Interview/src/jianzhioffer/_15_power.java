package jianzhioffer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *               n/2
 *          (x*x)           n%2==0
 *  n
 * x   =           n/2
 *          x*(x*x)         n%2==1
 */
public class _15_power {
    public double Power(double base, int exponent) {
        if(exponent==0){    //0次方
            return 1;
        }

        if(exponent==1){
            return base;
        }

        boolean flag =false;
        if(exponent<0){
            exponent=-exponent;
            flag=true;
        }

        double pow=Power(base*base,exponent/2);
        if(exponent%2==0){
            pow=pow*base;       //不等于0      乘奇数次
        }

        return flag?(1/pow):pow;
    }
}



/**
 double pow = Math.pow(base, exponent);
 return pow;
 **/