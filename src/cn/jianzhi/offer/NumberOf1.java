package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * <p>
 * 解决思路
 * 采用位运算
 * n & (n-1) 去掉最后一个1
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

}
