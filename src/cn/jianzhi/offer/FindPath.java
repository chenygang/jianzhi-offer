package cn.jianzhi.offer;

import java.util.ArrayList;

/**
 * 题目描述
 * <p>
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * <p>
 * 解答思路
 *
 * 递归解法
 * 在每一个跟节点 带上target 值
 */
public class FindPath {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        if (root == null) return paths;
        find(paths, new ArrayList<Integer>(), root, target);
        return paths;
    }

    private void find(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path, TreeNode root, int target) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == target) paths.add(path);
            return;
        }

        ArrayList<Integer> path2 = new ArrayList<>();
        path2.addAll(path);
        if (root.left != null) find(paths, path, root.left, target - root.val);
        if (root.right != null) find(paths, path2, root.right, target - root.val);

    }
}
