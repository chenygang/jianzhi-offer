package cn.jianzhi.offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 解决思路
 * 从规律可知
 * <p>
 * 1级台阶时1种方法（1）
 * 2级台阶时2种方法（1-1，2）
 * n级台阶时，从n-1级台阶一直到1级台阶跳上来，即f(n) = f(n-1) + f(n-2)+ ... + f(1) + f(0)
 * 由于f(n-1) = f(n-2) + f(n-3) + ... + f(2) + f(1) + f(0)
 * 所以f(n) = f(n-1) + f(n-1) = f(n-1)*2
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if (target <= 0) return 0;
        if (target <= 2) return target;
        return JumpFloorII(target - 1) * 2;
    }

    public int JumpFloorII2(int target) {
        if (target <= 0) return 0;
        if (target <= 2) return target;
        int n = 0;
        int n1 = 2;
        for (int i = 3; i <= target; i++) {
            n = n1 * 2;
            n1 = n;
        }
        return n;
    }
}
