package demo;

/**
 * Author: zhangl
 * Date: 2017/8/16
 * Description:
 * Project: algorithms
 */
public class BasicDemo {
    public static void main(String[] args) {
        //计算两个非负整数的最大公约数
        int a = gcd(6, 9);
        System.out.println(a);
        //整数溢出
        System.out.println(Math.abs(-2147483648));
        //初始化为无穷大
        System.out.println(Double.POSITIVE_INFINITY);
        //1.1.1
        System.out.println((0 + 15) / 2);//7
        System.out.println(2.0e-6 * 100000000.1);//200.0000002
        System.out.println(true && false || true && true);//true
        //1.1.2
        System.out.println((1 + 2.236) / 2);//1.618
        System.out.println(1 + 2 + 3 + 4.0);//10.0
        System.out.println(4.1 >= 4);//true
        System.out.println(1 + 2 + "3");//33

    }

    //欧几里德算法：两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }
}
