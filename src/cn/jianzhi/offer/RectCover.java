package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 解决思路
 * 本质是一个斐波那契数列。
 * 当n=1时，使用一个小矩形 竖着放，1种方法
 * 当n=2时，使用2个小矩形可以 横着或者竖着，2种方法
 * 当为n时，使用1个小矩形竖着放加上n-1时的放法 或者使用2个小矩形横着放加上n-2时的放法，即f(n) = f(n-1) + f(n-2).
 */
public class RectCover {
    public int RectCover(int target) {
        if (target <= 2) return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }

}
