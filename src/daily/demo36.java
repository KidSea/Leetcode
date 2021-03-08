package daily;

import java.util.HashMap;

/**
 * 给定一棵二叉树，判断琪是否是自身的镜像（即：是否对称）
 * 例如：下面这棵二叉树是对称的
 *      1
 *     /  \
 *   2    2
 *  / \    / \
 * 3 4  4  3
 * 下面这棵二叉树不对称。
 *     1
 *     / \
 *   2   2
 *     \    \
 *     3    3
 * 备注：
 * 希望你可以用递归和迭代两种方法解决这个问题
 */
public class demo36 {
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root == null) return true;
        return travalTree(root.left, root.right);
    }

    private boolean travalTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && travalTree(left.left, right.right) && travalTree(left.right, right.left);
    }
}
