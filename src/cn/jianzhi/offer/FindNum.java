package cn.jianzhi.offer;

/**
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 解决思路
 * 从题中可知，每行从左到右依次增大，每列从上道下依次增大。为了尽快找到目标值，每次排除一行或者一列。
 * 从右上角开始比较，
 * 如果与目标值相等，则找到；
 * 如果小于目标值，则下移一行；
 * 如果大于目标值，则向左移一列；
 */
public class FindNum {
    public boolean Find(int target, int[][] array) {
        boolean found = false;
        int rows = array.length;
        int cols = array[0].length;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (array[row][col] == target) {
                found = true;
                break;
            } else if (array[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return found;
    }
}
