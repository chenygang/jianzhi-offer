package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * <p>
 * 解决思路
 * <p>
 * 递归求解
 * 1。如果节点为null,返回高度为0
 * 2。如果不为空，分别求出左右分支的高度
 * 3。比较左右分支的高度，取大的一个，并加上1
 */
public class TreeDepth {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
