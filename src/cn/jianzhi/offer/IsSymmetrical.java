package cn.jianzhi.offer;

/**
 * 题目描述
 * <p>
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * <p>
 * 解决思路
 * <p>
 * 递归比较左右分支root1 和 root2
 * 如果root1和root2都为空，是对称的
 * 如果root1和root2其中一个不为空， 不是对称的
 * 如果root1和root2都不为空，且值不相等， 不是对称
 * 否则，递归比较孩子节点
 */
public class IsSymmetrical {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    boolean isSymmetrical(TreeNode pRoot) {
        return isSymmetrical(pRoot, pRoot);
    }

    private boolean isSymmetrical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return isSymmetrical(root1.left, root2.right) && isSymmetrical(root1.right, root2.left);
    }

}
