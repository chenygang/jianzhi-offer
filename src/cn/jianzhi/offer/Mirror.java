package cn.jianzhi.offer;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * <p>
 * 解决思路
 * 递归比较交换
 * 如果root为空，返回；
 * 如果root没有孩子，返回；
 * 如果root有孩子，则交换孩子，然后递归交换
 */
public class Mirror {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
    }
}
