package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * <p>
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * <p>
 * 解决思路
 * <p>
 * 二分查找法
 * 如果a[mid] >= a[low]时，最小元素一定在[mid,high]
 * 如果a[mid] <= a[high]时，最小元素一定在[low,mid]
 * 如果a[mid]=a[low]=a[high]时，不能确定最小元素在哪个区域，则需要顺序查找
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int low = 0, high = array.length - 1;
        int mid = low;
        while (array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = low + (high - low) / 2;
            if (array[low] == array[mid] && array[mid] == array[high]) { // 当比较相等时， 顺序查找
                return MinInOrder(array, low, high);
            }
            if (array[mid] >= array[low]) low = mid;
            else if (array[mid] <= array[high]) high = mid;
        }
        return array[mid];
    }

    private int MinInOrder(int[] array, int low, int high) {
        int result = array[low];
        for (int i = low + 1; i <= high; i++) {
            result = Math.min(result, array[i]);
        }
        return result;
    }
}
