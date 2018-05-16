package cn.jianzhi.offer;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * 解决思路
 * 使用冒泡法
 * 1。从前往后找到一个偶数
 * 2。从当前位置往后找到一个奇数
 * 3。移动2者之间的数， 交换奇数和偶数
 */
public class ReOrderArray {
    public void reOrderArray(int[] a) {
        if (a == null || a.length == 0) return;
        int i = 0, j;
        while (i < a.length) {
            while (i < a.length && !isEven(a[i])) i++;
            j = i + 1;
            while (j < a.length && isEven(a[j])) j++;
            if (j < a.length) {
                int temp = a[j];
                System.arraycopy(a, i, a, i + 1, j - i);
                a[i++] = temp;
            } else { // 查找失败
                break;
            }
        }
    }

    private boolean isEven(int num) {
        return (num & 0x1) == 0;
    }
}
