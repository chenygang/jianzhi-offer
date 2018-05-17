package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * <p>
 * 解决思路
 * 采用位运算
 * n & (n-1) 去掉最后一个1
 * n       : 10110100
 * n-1     : 10110011
 * n&(n-1) : 10110000
 * <p>
 * O(logM) 时间复杂度解法，其中 M 表示 1 的个数。
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

    public int NumberOf12(int n) {
        return Integer.bitCount(n);
    }
}
