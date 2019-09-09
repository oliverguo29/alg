package jianzhioffer;

/**
 * 斐波那契数列
 * 求第n项，n<=39
 *
 *
 *          - 0
 * f(n)=    - 1
 *          - f(n-1)+f(n-2)
 */
public class _10_TestFibonacci {
    private int [] fib = new int[40];

    public _10_TestFibonacci(){
        fib[1]=1;
        for(int i=2;i<fib.length;i++){
            fib[i]=fib[i-1]+fib[i-2];               //在构造器中计算所有的数值
        }
    }

    public int Fibonacci(int n) {
        return fib[n];                              //直接返回结果
    }
}
