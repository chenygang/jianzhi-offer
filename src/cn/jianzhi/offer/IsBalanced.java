package cn.jianzhi.offer;

/**
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * <p>
 * 解题思路
 */
public class IsBalanced {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        getHeight(root, 1);
        return isBalanced;
    }

    private int getHeight(TreeNode root, int level) {
        if (root == null) return level;

        int leftHeight = getHeight(root.left, level + 1);
        if (!isBalanced) return level;

        int rightHeight = getHeight(root.right, level + 1);
        if (!isBalanced) return level;

        if (Math.abs(leftHeight - rightHeight) > 1) isBalanced = false;

        return Math.max(leftHeight, rightHeight);
    }

}
