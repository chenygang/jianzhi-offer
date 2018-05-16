package cn.jianzhi.offer;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * <p>
 * 解决思路
 * 1.实现递归版
 * 2.实现递推版
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public int Fibonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f1 = 0, f2 = 1;
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }
}
