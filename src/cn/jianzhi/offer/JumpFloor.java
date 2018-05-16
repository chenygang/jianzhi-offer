package cn.jianzhi.offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 解决思路
 * <p>
 * 从观察规律可知
 * 1级台阶时1种方法（1）
 * 2级台阶时2种方法（1-1，2）
 * n级台阶时，只能从n-1级台阶和n-2级台阶跳上来，即f(n) = f(n-1) + f(n-2)  ---> 斐波拉契数序列
 */
public class JumpFloor {
    /**
     * 递归版
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target <= 0) return 0;
        else if (target <= 2) return target;
        else
            return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    /**
     * 递推版
     * @param target
     * @return
     */
    public int JumpFloor2(int target) {
        if (target <= 0) return 0;
        if (target <= 2) return target;
        int n = 0;
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= target; i++) {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
        }
        return n;
    }
}
